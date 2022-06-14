package DS.heap;
import java.util.PriorityQueue;
import java.util.Scanner;

public class test {



    public static void main(String[] args) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();

        while(!queue.isEmpty()) {

        }


        Scanner scanner = new Scanner(System.in);
        int n, a;
        n = scanner.nextInt();
        for(int i = 0; i < n; i++) {
            a = scanner.nextInt();
            queue.add(a);
        }

        int ans = 0;
        Integer t1, t2;
        while((t1 = queue.poll()) != null && (t2 = queue.poll()) != null) {
            ans += t1 + t2;
            queue.add(t1+t2);
        }
        System.out.println(ans);
    }
}
