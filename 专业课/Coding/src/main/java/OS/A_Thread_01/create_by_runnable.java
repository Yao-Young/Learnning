package OS.A_Thread_01;

import java.lang.Thread;

class myThread implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName() + ":\t" + i);
        }
    }
}


public class create_by_runnable {

    public static void main(String[] args) {
        new Thread(new myThread()).start();
    }

}
