package jmu.cs.OS.syn_and_mutex.philosophersEat;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.locks.LockSupport;

class semaphore {
    int limit;
    int[] fork;
    Queue<Thread> queue;

    semaphore() {   //假设limit = 4, fork都为1
        limit = 4;
        fork = new int[5];
        for(int i = 0; i <5; i++) fork[i] = 1;
        queue = new LinkedList<>();
    }
}

class myRun implements Runnable {
    semaphore sema;
    int left, right;

    myRun(semaphore sema, int left, int right) {
        this.left = left;
        this.right = right;
        this.sema = sema;
    }

    void P(int chopsticks) {
        sema.fork[chopsticks]--;
        if(sema.fork[chopsticks] < 0) {
            block();
        }
    }

    void V(int chopsticks) {
        sema.fork[chopsticks]++;
        if(sema.fork[chopsticks] <= 0) {
            wakeup();
        }
    }

    void block() {
        sema.queue.add(Thread.currentThread());
        LockSupport.park(Thread.currentThread());
    }

    void wakeup() {
        Thread t = sema.queue.poll();
        LockSupport.unpark(t);
    }
    @Override
    public void run() {
        while(true) {
            sema.limit--;       //问题所在 这里的sema.limit没有进行线程保护

            System.out.println(Thread.currentThread().getName() + "此时sema.limit = " + sema.limit);
            if(sema.limit < 0) {
                System.out.println(Thread.currentThread().getName() +  " thinking...");
                block();
            }

            P(left);
            P(right);

            System.out.println(Thread.currentThread().getName() + " eating");

            V(left);
            V(right);

            sema.limit++;
            if(sema.limit <= 0) {
                wakeup();
            }

            System.out.println(Thread.currentThread().getName() +  " thinking again...");
        }

    }
}


public class plan_A {
    public static void main(String[] args) {
        semaphore sema = new semaphore();
        for(int i=0; i<5; i++) {
            myRun r = new myRun(sema, i, (i+1)%5);
            Thread t = new Thread(r);
            t.setName(""+i);
            t.start();
        }
    }
}


