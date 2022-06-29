import java.util.Scanner;

public class Main12_암호 {
    public String solution(String number, String str) {
        StringBuffer answer = new StringBuffer();
        StringBuffer strBinary = new StringBuffer();

        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i) == '#')
                strBinary.append(1);
            else
                strBinary.append(0);

            if(strBinary.length() == str.length()/Integer.parseInt(number)){
                answer.append((char) Integer.parseInt(strBinary.toString(), 2));
                strBinary = new StringBuffer();
            }
        }
        return answer.toString();
    }

    /*
    4
    #****###**#####**#####**##**
     */
    public static void main(String[] args) {
        Main12_암호 main = new Main12_암호();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();
        String input2 = in.nextLine();

        System.out.println(main.solution(input1, input2));
    }
}