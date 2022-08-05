
import java.util.Scanner;

public class Main28_연속부분수열 {
    public int solution(int n, int k, int[] arr) {
        int answer = 0;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
                if(sum == k){
                    answer++;
                    break;
                } else if (sum > k) {
                    break;
                }
            }
        }
        return answer;

    }
    /*
    8 6
    1 2 1 3 1 1 1 2
     */
    public static void main(String[] args) {
        Main28_연속부분수열 main = new Main28_연속부분수열();
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