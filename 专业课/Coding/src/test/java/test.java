import java.util.HashMap;

public class test {

    public int minCostToMoveChips(int[] position) {

        int len = position.length;

        int min = Integer.MAX_VALUE;

        for(int i = 0; i < len; i++) {
            int cnt = 0;
            for(int j = 0; j < len; j++) {
                if(i == j) continue;
                if(Math.abs(position[i] - position[j])%2 != 0) {
                    cnt++;
                }
            }
            min = cnt < min ? cnt : min;
        }
        return min;
    }

    public static void main(String[] args) {

    }
}
