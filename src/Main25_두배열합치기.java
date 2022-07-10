
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main25_두배열합치기 {
    public String solution(int n, int m, int[] a, int[] b) {
        List<Integer> resultList = new ArrayList<>();

        int nCnt=0;
        int mCnt=0;
        while(nCnt<n && mCnt<m){
            if(a[nCnt]<b[mCnt]) resultList.add(a[nCnt++]);
            else resultList.add(b[mCnt++]);
        }
        while(nCnt<n)
            resultList.add(a[nCnt++]);

        while(mCnt<m)
            resultList.add(b[mCnt++]);

        return resultList.stream().map(String::valueOf).collect(Collectors.joining(" "));
    }
    /*
    3
    1 3 5
    5
    2 3 6 7 9
     */
    public static void main(String[] args) {
        Main25_두배열합치기 main = new Main25_두배열합치기();
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
        System.out.println(main.solution(m, n, b, a));
    }
}