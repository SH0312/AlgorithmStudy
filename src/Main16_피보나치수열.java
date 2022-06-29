import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main16_피보나치수열 {
    public String solution(int n) {
        List<Integer> resultList = new ArrayList<>();
        resultList.add(1);
        resultList.add(1);

        for (int i = 2; i < n; i++) {
            resultList.add(resultList.get(i-2) + resultList.get(i-1));
        }
        return resultList.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
    /*
    10
     */
    public static void main(String[] args) {
        Main16_피보나치수열 main = new Main16_피보나치수열();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }
}