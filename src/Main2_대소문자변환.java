import java.util.Scanner;

public class Main2_대소문자변환 {
    public String solution(String str) {

        String answer ="";
        for(char strChar : str.toCharArray()){
            if(Character.isUpperCase(strChar)){
                answer += Character.toLowerCase(strChar);
            }
            else{
                answer += Character.toUpperCase(strChar);
            }
        }
        return answer;
    }

    /*
    StuDY
     */
    public static void main(String[] args) {
        Main2_대소문자변환 main = new Main2_대소문자변환();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();

        System.out.println(main.solution(input1));
    }
}