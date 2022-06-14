package DS;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class main {


    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        String time = in.nextLine();

        String[] array = time.split(" - ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }
}
/*
8 3 4
20 25 15 18 20 18 8 5

 */
