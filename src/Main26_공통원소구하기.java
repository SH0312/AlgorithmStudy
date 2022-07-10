
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main26_공통원소구하기 {
    public String solution(int n, int m, int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();

        int nCnt=0;
        int mCnt=0;

        Arrays.sort(a);
        Arrays.sort(b);

        while (nCnt < n && mCnt < m) {
            if(a[nCnt] == b[mCnt]){
                resultList.add(a[nCnt]);
                nCnt++;
                mCnt++;
            }
            else if( a[nCnt] < b[mCnt]){
                nCnt++;
            }
            else{
                mCnt++;
            }
        }
        return resultList.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
    /*
    5
    1 3 9 5 2
    5
    3 2 5 7 8
     */
    public static void main(String[] args) {
        Main26_공통원소구하기 main = new Main26_공통원소구하기();
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int[] a=new int[n];
        for(int i=0; i<n; i++){
            a[i]=in.nextInt();
        }
        int m=in.nextInt();
        int[] b=new int[m];
        for(int i=0; i<m; i++){
            b[i]=in.nextInt();
        }

            System.out.println(main.solution(n, m, a, b));
    }
}