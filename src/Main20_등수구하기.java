
import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main20_등수구하기 {
    public String solution(int[] arr1) {
        int result[] = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i]++;
            for (int j = i; j < arr1.length; j++) {
                if(i == j) continue;;
                if(arr1[i] < arr1[j])
                    result[i]++;
                else if(arr1[i] > arr1[j]){
                    result[j]++;
                }
            }
        }
        return Arrays.stream(result).mapToObj(String::valueOf).collect(Collectors.joining(" "));
    }

    /*
    5
    87 89 92 100 76
     */
    public static void main(String[] args) {
        Main20_등수구하기 main = new Main20_등수구하기();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(main.solution(arr1));
    }
}