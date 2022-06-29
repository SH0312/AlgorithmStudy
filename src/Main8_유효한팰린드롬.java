import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main8_유효한팰린드롬 {
    public String solution(String str) {
        List<String> list = Arrays.asList(str.split(""));
        String answer = "YES";

        int endIndex = list.size()-1;
        for(int i = 0; i < list.size(); i++){
            if(Character.isLetter(list.get(i).charAt(0))){
                for(int j = endIndex; j > i; j--){
                    if(!Character.isLetter(list.get(endIndex).charAt(0))){
                        endIndex--;
                        continue;
                    }
                    if(!list.get(i).equalsIgnoreCase(list.get(endIndex))){
                        answer = "NO";
                        return answer;
                    }
                    else{
                        endIndex--;
                        break;
                    }
                }
            }
            if(i == endIndex)
                break;
        }

        return answer;
    }

    /*
    found7, time: study; Yduts; emit, 7Dnuof
     */
    public static void main(String[] args) {
        Main8_유효한팰린드롬 main = new Main8_유효한팰린드롬();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(main.solution(input1));
    }
}