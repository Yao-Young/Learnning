package jmu.cs.Gym.CCCC;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class P9 {


    static void print(LinkedList list) {
        int len = list.size();
        for(int i = 0; i < len; i++) {
            System.out.printf("%d%s", list.get(i), i == len - 1 ? "\n" : " ");
        }
//        list = new LinkedList();
    }

    public static void main(String[] args) {

        int N, M, K;
        Scanner in = new Scanner(System.in);
        N = in.nextInt();
        M = in.nextInt();
        K = in.nextInt();

        Queue<Integer> PushBox = new LinkedList<>();
        Stack<Integer> StBox = new Stack<>();
        LinkedList<Integer> flower = new LinkedList<>();


        for(int i = 0; i < N; ++i) {
            int a = in.nextInt();
            PushBox.add(a);
        }
        while(PushBox.size() > 0 || StBox.size() > 0) {
            int pick, from;
            if(StBox.size() == 0) {
                pick = PushBox.peek();
                from = 2;
            }
            else {
                pick = StBox.peek();
                from = 1;
            }

            if(flower.size() == 0) {
                flower.add(pick);
                if(from == 1)
                    StBox.pop();
                else
                    PushBox.poll();
            }
            else {
                int last = flower.getLast();
                if(pick <= last) {
                    flower.addLast(pick);
                    if(from == 1)
                        StBox.pop();
                    else
                        PushBox.poll();
                }
                else {
                    if(from == 1) {
                        if(PushBox.size() == 0) {   //end1
                            //print
                            print(flower);
                            flower = new LinkedList<>();
                            continue;
                        }
                        else {
                            pick = PushBox.peek();
                            if(pick <= last) {
                                flower.addLast(pick);
                                PushBox.poll();
                            }
                            else {
                                if(StBox.size() == M) { //end2
                                    //print
                                    print(flower);
                                    flower = new LinkedList<>();
                                    continue;
                                }
                                else {
                                    StBox.push(pick);
                                    PushBox.poll();
                                }
                            }
                        }
                    }
                    else {
                        PushBox.poll();
                        StBox.push(pick);
                    }
                }

            }
            if(flower.size() == K) {
                //print
                print(flower);
                flower = new LinkedList<>();
            }
        }
        print(flower);
    }
}
/*
8 3 4
20 25 15 18 20 18 8 5

 */
