import java.util.Scanner;

public class Main11_문자열압축 {
    public String solution(String str) {
        str = str+" ";
        String[] split = str.split("");

        StringBuffer answer = new StringBuffer();

        int cnt = 1;
        for (int i = 0; i < split.length-1; i++) {
            if(split[i].equals(split[i+1])){
                cnt++;
            }
            else{
                answer.append(split[i]);
                if(cnt > 1){
                    answer.append(cnt);
                    cnt = 1;
                }
            }
        }

        return answer.toString();
    }

    /*
    KKHSSSSSSSE
     */
    public static void main(String[] args) {
        Main11_문자열압축 main = new Main11_문자열압축();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(main.solution(input1));
    }
}