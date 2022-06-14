package jmu.cs.DS.string;

import java.util.Scanner;

public class test2 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        String line;
        int[] array = new int[26];

        for(int i = 0; i < 4; i++) {
            line = in.nextLine();
            int len = line.length();
            for(int j = 0; j < len; j++) {
                if(line.charAt(j) >= 'A' && line.charAt(j) <= 'Z')
                    ++array[line.charAt(j) - 'A'];
            }
        }

        int maxItem = -1;
        for(int i = 0; i < 26; i++) {
            maxItem = maxItem > array[i] ? maxItem : array[i];
        }

        for(int i = maxItem; i > 0; --i) {
            for(int j = 0; j < 26; ++j) {
                if(array[j] == i) {
                    System.out.print("*");
                    --array[j];
                }
                else System.out.print(" ");
                System.out.printf("%s", j==25?"\n":" ");
            }
        }

        for(int i = 0; i < 26; i++) {
            System.out.printf("%s%s",(char)('A'+i), i==25?"":" ");

        }
    }


}
