package DS.The_Beauty_Of_Programming.Ch1;

public class ChinaChess {


    public static void main(String[] args) {

        //遍历A、B所有可能位置，再判别合法性
        int i, j;
        for(i=1; i<=9; i++) {
            for(j=1; j<=9; j++) {
                if(i%3 != j%3) {
                    System.out.println(i + " " + j);
                }
            }
        }
        //思路一：使用1byte 8位，前四位放A的位置，后四位放B的位置

        System.out.println("new solution: ");
        //思路二：将情况总数当作是遍历的范围
        for(i = 0; i< 81; i++) {
            if(i/9%3 != i%9%3) {
                System.out.println(i/9 + " " + i%9);
            }
        }

        //思路三：将对象(结构体)视作一个变量



    }


}
