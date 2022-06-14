package jmu.cs.DS.string;

import java.util.Scanner;

public class test {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String str = in.next();
        StringBuffer s = new StringBuffer(str);

        int ans = 0;
        for(int i = 1; i < n; i++) {
            if(s.charAt(i-1) == 'V' && s.charAt(i) == 'K') {
                ans++;
                s.setCharAt(i, 'a');
                s.setCharAt(i-1, 'a');
            }
        }

        for(int i = 1; i < n; i++) {
            if(s.charAt(i) == s.charAt(i-1) && s.charAt(i) != 'a') {
                ++ans;
                break;
            }
        }

        System.out.println(ans);
    }

}
/*
 开始的思路：
 考虑各个vk之间的字符长度，大于等于2即可
 错误在： kv无法变为vk

 正确思路一：
    1、覆盖所有的VK->aa
    2、找不为a的两个重复符号

 正确思路二：
    边走边找，遇到VK+1， 不是VVK，VKK的情况+1

 */
