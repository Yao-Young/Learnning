package jmu.cs.OS.A_Thread_01;


import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

class myCall implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 1; i <= 10; i++) {
            sum += i;
        }
        return sum;
    }
}

public class create_by_callable {
    public static void main(String[] args) {
        myCall t1 = new myCall();
        FutureTask<Integer> futureTask = new FutureTask<>(t1);
        new Thread(futureTask).start();

        try {
            Integer sum = futureTask.get();
            System.out.println("sum = " + sum);
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }

}
