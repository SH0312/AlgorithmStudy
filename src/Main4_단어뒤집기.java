import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main4_단어뒤집기 {
    public String solution(List<String> list) {

        String answer = "";

        for (String s : list) {
            answer += new StringBuffer(s).reverse().toString()+"\n";
        }

        return answer;
    }

    /*
    3
    good
    Time
    Big
     */
    public static void main(String[] args) {
        Main4_단어뒤집기 main = new Main4_단어뒤집기();
        Scanner in=new Scanner(System.in);
        int input1 = in.nextInt();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < input1; i++) {
            String input = in.next();
            list.add(input);
        }


        System.out.println(main.solution(list));
    }
}