
import java.util.Scanner;

public class Main22_봉우리 {
    public int solution(int[][] arr1) {
        int answer = 0;

        int[] x = {-1, 0, 1, 0};
        int[] y = {0, -1, 0, 1};

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                boolean check = true;
                for (int w = 0; w < x.length; w++) {
                    int xPoint = i+x[w];
                    int yPoint = j+y[w];
                    if(xPoint >= 0 && yPoint >= 0 && xPoint < arr1.length && yPoint < arr1.length && arr1[xPoint][yPoint] >= arr1[i][j]){
                        check = false;
                        break;
                    }
                }
                if(check){
                    answer++;
                }
            }
        }
        return answer;
    }

    /*
    5
    5 3 7 2 3
    3 7 1 6 1
    7 2 5 3 4
    4 3 6 4 1
    8 7 3 5 2
     */
    public static void main(String[] args) {
        Main22_봉우리 main = new Main22_봉우리();
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