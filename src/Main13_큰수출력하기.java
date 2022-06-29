import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main13_큰수출력하기 {
    public String solution(String input1, String input2) {
        List<String> answer = new ArrayList<>();
        String[] strNum = input2.split(" ");

        answer.add(strNum[0]);
        for (int i = 1; i < Integer.parseInt(input1); i++) {
            if(Integer.parseInt(strNum[i-1]) < Integer.parseInt(strNum[i])){
                answer.add(strNum[i]);
            }
        }
        return String.join(" ", answer);
    }

    /*
    6
    7 3 9 5 6 12
     */
    public static void main(String[] args) {
        Main13_큰수출력하기 main = new Main13_큰수출력하기();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        System.out.println(main.solution(input1, input2));
    }
}