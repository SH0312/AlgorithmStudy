import java.util.Scanner;

public class Main3_문장속단어 {
    public String solution(String str) {

        String answer = "";

        for(String _str : str.split(" "))
            if(answer.length() < _str.length())
                answer = _str;

        return answer;
    }

    /*
    it is time to study
     */
    public static void main(String[] args) {
        Main3_문장속단어 main = new Main3_문장속단어();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(main.solution(input1));
    }
}