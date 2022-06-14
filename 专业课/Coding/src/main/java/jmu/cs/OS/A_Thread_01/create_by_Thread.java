package jmu.cs.OS.A_Thread_01;

import java.lang.Thread;

public class create_by_Thread extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":\t" + i);
        }
    }

    public static void main(String[] args) {
        create_by_Thread t1 = new create_by_Thread();
        create_by_Thread t2 = new create_by_Thread();

        t1.start();
        t2.start();

        new create_by_Thread().start();
        System.out.println("主线程");
    }
}
