
import java.util.Scanner;

public class Main30_최대길이연속부분수열 {
    public int solution(int n, int k, int[] arr) {
        int answer;
        int sum = 0;
        int zeroCnt = 0;
        int indexPoint = 0;
        for (int i = 0; i < n; i++) {
            if(zeroCnt < k && arr[i] == 0){
                zeroCnt++;
                sum++;
            }
            else if(zeroCnt == k && arr[i] == 0){
                indexPoint = i;
                break;
            }
            else{
                sum += arr[i];
            }
        }
        answer = sum;
        int index = 0;
        for (int i = indexPoint; i < n; i++) {
            if(arr[i] == 0){
                while(zeroCnt == k){
                    if(arr[index] == 0){
                        zeroCnt--;
                    }
                    index++;
                    sum--;
                }
                zeroCnt++;
                sum++;
            }
            else{
                sum += arr[i];
            }
            answer = Math.max(answer, sum);
        }
        return answer;

    }
    /*
    14 2
    1 1 0 0 1 1 0 1 1 0 1 1 0 1
     */
    public static void main(String[] args) {
        Main30_최대길이연속부분수열 main = new Main30_최대길이연속부분수열();
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