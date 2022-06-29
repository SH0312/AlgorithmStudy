import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main9_숫자만추출 {
    public String solution(String str) {
        List<String> list = Arrays.asList(str.split(""));
        String answer = "";

        for (String s : list) {
            if (Character.isDigit(s.charAt(0))) {
                answer += s;
            }
        }


        return String.valueOf(Integer.parseInt(answer));
    }

    /*
    g0en2T0s8eSoft
     */
    public static void main(String[] args) {
        Main9_숫자만추출 main = new Main9_숫자만추출();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(main.solution(input1));
    }
}