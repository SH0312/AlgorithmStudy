
import java.util.Scanner;

public class Main23_임시반장정하기 {
    public int solution(int[][] arr1) {
        int answer = 1;
        int maxCnt =Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            int max = 0;
            for (int j = 0; j < arr1.length; j++) {
                for (int z = 0; z < arr1[i].length; z++) {
                    if(i == j)
                         continue;
                    if(arr1[i][z] == arr1[j][z]){
                        max++;
                        break;
                    }
                }
            }
            if(maxCnt < max){
                maxCnt = max;
                answer = i+1;
            }
        }

        return answer;
    }

    /*
    5
    2 3 1 7 3
    4 1 9 6 8
    5 5 2 4 4
    6 5 2 6 7
    8 4 2 2 2
     */
    public static void main(String[] args) {
        Main23_임시반장정하기 main = new Main23_임시반장정하기();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int[][] arr1 = new int[n][5];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 5; j++) {
                arr1[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(arr1));
    }
}