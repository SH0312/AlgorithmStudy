
import java.util.Scanner;

public class Main29_연속된자연수의합 {
    public int solution(int n) {
        int answer = 0;

        for (int i = 1; i <= n/2; i++) {
            int sum = 0;
            for (int j = i; j <= n/2+1; j++) {
                sum += j;
                if (sum == n) {
                    answer++;
                    break;
                } else if (sum > n) {
                    break;
                }
            }
        }

        return answer;

    }
    /*
    15
     */
    public static void main(String[] args) {
        Main29_연속된자연수의합 main = new Main29_연속된자연수의합();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        System.out.println(main.solution(n));
    }
}