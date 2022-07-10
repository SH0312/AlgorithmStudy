import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Scanner;

public class Main21_격자판최대합 {
    public int solution(int[][] arr1) {
        int[] answerArr = new int[((arr1.length * 2) +2)];
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                answerArr[i] += arr1[i][j];
                answerArr[arr1.length+i] += arr1[j][i];
                if(i == j)
                    answerArr[((arr1.length * 2))] += arr1[i][j];
            }
            answerArr[((arr1.length * 2) +1)] += arr1[(arr1.length -1 -i)][i];
        }
        OptionalInt max = Arrays.stream(answerArr).max();
        if(max.isPresent()){
            return Arrays.stream(answerArr).max().getAsInt();
        }
        return 0;
    }

    /*
    5
    10 13 10 12 15
    12 39 30 23 11
    11 25 50 53 15
    19 27 29 37 27
    19 13 30 13 19
     */
    public static void main(String[] args) {
        Main21_격자판최대합 main = new Main21_격자판최대합();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] arr1 = new int[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = in.nextInt();
            }

        }

        System.out.println(main.solution(arr1));
    }
}