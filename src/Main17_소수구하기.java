import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main17_소수구하기 {
    public int solution(int n) {
        //에라토스테네스의 체
        boolean prime[] = new boolean[n + 1];
        List<Integer> primeList = new ArrayList<>();
        prime[0] = prime[1] = true;

        for (int i = 2; i * i <= n; i++) {
            if (!prime[i]) {
                for (int j = i * i; j <= n; j += i){
                    prime[j] = true;
                }
            }
        }
        for (int i = 1; i < n; i++) {
            if(!prime[i]){
                primeList.add(i);
            }
        }
        return primeList.size();
    }

    public int solution2(int n) {
        int resultCnt = 0;

        for (int i = 0; i < n; i++) {
            if( i < 2){
                continue;
            }
            else if(i == 2){
                resultCnt++;
            }
            else{
                boolean prime = true;
                for (int j = 2; j < (i/2+1); j++) {
                    if(i%j == 0){
                        prime = false;
                        break;
                    }
                }
                if (prime) {
                    resultCnt++;
                }
            }
        }
        return resultCnt;
    }
    /*
    20
     */
    public static void main(String[] args) {
        Main17_소수구하기 main = new Main17_소수구하기();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(main.solution(n));
    }
}