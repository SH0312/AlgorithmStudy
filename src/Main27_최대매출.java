
import java.util.Scanner;

public class Main27_최대매출 {
    public int solution(int n, int k, int[] arr) {
        int answer;
        int sum = 0;

        for (int i = 0; i < k; i++) {
            sum += arr[i];
        }
        answer = sum;

        for (int i = k; i < n; i++) {
            sum -= arr[i-k];
            sum += arr[i];
            answer = Math.max(answer, sum);
        }

        return answer;

    }
    /*
    10 3
    12 15 11 20 25 10 20 19 13 15
     */
    public static void main(String[] args) {
        Main27_최대매출 main = new Main27_최대매출();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int[] arr=new int[n];
        for(int i=0; i<n; i++){
            arr[i]=in.nextInt();
        }
        System.out.println(main.solution(n, k, arr));
    }
}