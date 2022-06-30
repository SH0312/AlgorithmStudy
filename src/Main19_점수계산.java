import java.util.Scanner;

public class Main19_점수계산 {
    public int solution(int[] arr1) {
        int answer = arr1[0];

        int point = 1;
        boolean addPoint = answer > 0 ? true : false;
        for (int i = 1; i < arr1.length; i++) {
            if(arr1[i] == 1){
                if(addPoint){
                    point++;
                }
                addPoint = true;
                answer += point;
            }
            else{
                point = 1;
                addPoint = false;
            }
        }
        return answer;
    }

    /*
    10
    1 0 1 1 1 0 0 1 1 0
     */
    public static void main(String[] args) {
        Main19_점수계산 main = new Main19_점수계산();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(main.solution(arr1));
    }
}