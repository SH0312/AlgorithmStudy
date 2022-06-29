import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main6_중복문자제거 {
    public String solution(String str) {
        List<String> list = new ArrayList<>();

        for (String s : str.split("")) {
            if (!list.contains(s)) {
                list.add(s);
            }
        }

        return String.join("", list);
    }

    /*
    ksekkset
     */
    public static void main(String[] args) {
        Main6_중복문자제거 main = new Main6_중복문자제거();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();


        System.out.println(main.solution(input1));
    }
}