package jmu.cs.Gym.LeetCode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class t1 {

    public static HashMap<String, Integer> map = new HashMap<>();

    public static void dfs(int index, String str, StringBuffer path) {
        if(index == str.length()) {
            if(map.containsKey(path)) {
                int i = map.get(path);
                map.put(String.valueOf(path), i+1);
            }
            else {
                map.put(String.valueOf(path), 1);
            }
            return;
        }
        dfs(index+1, str, new StringBuffer(path));
        dfs(index+1, str, new StringBuffer(path.append(str.charAt(index))));
    }

    public static void main(String[] args) {

        int[] array = new int[10];


    }
}
