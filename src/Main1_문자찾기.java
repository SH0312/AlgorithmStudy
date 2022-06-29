import java.util.Scanner;

public class Main1_문자찾기 {
    public int solution(String str, char c) {
        int answer = 0;
        str = str.toLowerCase();
        c = Character.toLowerCase(c);
        for(char strChar : str.toCharArray()){
            if(strChar == c){
                answer++;
            }
        }
        return answer;
    }

    /*
    Computercooler
    c
     */
    public static void main(String[] args) {
        Main1_문자찾기 main = new Main1_문자찾기();
        Scanner in=new Scanner(System.in);
        String input1 = in.next();
        char input2 = in.next().charAt(0);


        System.out.println(main.solution(input1, input2));
    }
}