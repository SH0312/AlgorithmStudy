
import java.util.Scanner;

public class Main24_멘토링 {
    public int solution(int[][] arr1) {
        int answer = 0;

        for (int i = 0; i < arr1[0].length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if(i == j)
                    continue;
                int cnt = 0;
                for (int[] ints : arr1) {
                    int pi = 0;
                    int pj = 0;
                    for (int s = 0; s < arr1[0].length; s++) {
                        if (ints[s] == (i + 1))
                            pi = s;
                        if (ints[s] == (j + 1))
                            pj = s;
                    }
                    if (pi < pj)
                        cnt++;
                }
                if(cnt == arr1.length){
                    answer++;
                }
            }
        }
        return answer;
    }

    /*
    4 3
    3 4 1 2
    4 3 2 1
    3 1 4 2
     */
    public static void main(String[] args) {
        Main24_멘토링 main = new Main24_멘토링();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr[i][j] = in.nextInt();
            }
        }
        System.out.println(main.solution(arr));
    }
}