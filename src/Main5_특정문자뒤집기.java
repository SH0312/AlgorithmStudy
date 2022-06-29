import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main5_특정문자뒤집기 {
    public String solution(String input) {

        String answer = "";
        List<String> list = Arrays.asList(input.split(""));

        int endIndex = list.size()-1;
        for(int i = 0 ; i <list.size(); i++){
            if(Character.isLetter(list.get(i).charAt(0))){
                for(int j = endIndex; j > i; j--){
                    if(Character.isLetter(list.get(j).charAt(0))){
                        String temp = list.get(i);
                        list.set(i, list.get(j));
                        list.set(j, temp);
                        endIndex--;
                        break;
                    }
                    endIndex--;
                    if(i == endIndex)
                        return String.join("", list);
                }
            }
        }
        return String.join("", list);
    }

    /*
    a#b!GE*T@S
     */
    public static void main(String[] args) {
        Main5_특정문자뒤집기 main = new Main5_특정문자뒤집기();
        Scanner in=new Scanner(System.in);
        String input = in.next();


        System.out.println(main.solution(input));
    }
}
