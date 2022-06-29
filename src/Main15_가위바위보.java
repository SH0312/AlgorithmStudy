import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main15_가위바위보 {
    public String solution(int[] arr1, int[] arr2) {
        List<String> resultList = new ArrayList<>();
        /*
            arr1이 이기면 A를 출력하고, arr2가 이기면 B를 출력합니다. 비길 경우에는 D
            가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보
         */
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i])
                resultList.add("D");
            else {
                if (arr1[i] == 1 && arr2[i] == 3
                        || arr1[i] == 2 && arr2[i] == 1
                        || arr1[i] == 3 && arr2[i] == 2) {
                    resultList.add("A");
                } else {
                    resultList.add("B");
                }
            }
        }
        return String.join("\n", resultList);
    }
    /*
    5
    2 3 3 1 3
    1 1 2 2 3
     */
    public static void main(String[] args) {
        Main15_가위바위보 main = new Main15_가위바위보();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }
        for (int i = 0; i < n; i++) {
            arr2[i] = in.nextInt();
        }

        System.out.println(main.solution(arr1, arr2));
    }
}