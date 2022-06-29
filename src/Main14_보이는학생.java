import java.util.Scanner;

public class Main14_보이는학생 {
    public int solution(int[] arr) {
        int resultCnt = 1;
        for (int i = 1; i < arr.length; i++) {
            boolean see = true;
            for (int j = 0; j < i; j++) {
                if (arr[j] >= arr[i]) {
                    see = false;
                    break;
                }
            }
            if (see) {
                resultCnt++;
            }
        }
        return resultCnt;
    }
    /*
    8
    130 135 148 140 145 150 150 153
     */
    public static void main(String[] args) {
        Main14_보이는학생 main = new Main14_보이는학생();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }

        System.out.println(main.solution(arr));
    }
}