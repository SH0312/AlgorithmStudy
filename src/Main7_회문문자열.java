import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main7_회문문자열 {
    public String solution(String str) {
        List<String> list = Arrays.asList(str.split(""));

        String answer = "YES";
        for(int i = 0; i < list.size()/2; i++){
            if(!(list.get(i).toLowerCase().equals(list.get(list.size()-(i+1)).toLowerCase()))){
                answer ="NO";
                break;
            }
        }

        return answer;
    }

    /*
    gooG
     */
    public static void main(String[] args) {
        Main7_회문문자열 main = new Main7_회문문자열();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(main.solution(input1));
    }
}