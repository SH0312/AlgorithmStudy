import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main18_뒤집은소수 {
    public String solution(int[] arr1) {
        List<Integer> primeNum = new ArrayList<>();
        for (int num : arr1) {
            int _num = Integer.parseInt(new StringBuffer(String.valueOf(num)).reverse().toString());

            if(_num < 2) continue;
            boolean prime = true;
            for(int i = 2; i < (_num/2+1); i++){
                if(_num % i == 0){
                    prime = false;
                    break;
                }
            }
            if(prime)
                primeNum.add(_num);
        }

        return primeNum.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }

    /*
    9
    32 55 62 20 250 370 200 30 100
     */
    public static void main(String[] args) {
        Main18_뒤집은소수 main = new Main18_뒤집은소수();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr1 = new int[n];
        for (int i = 0; i < n; i++) {
            arr1[i] = in.nextInt();
        }

        System.out.println(main.solution(arr1));
    }
}