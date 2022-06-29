import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main10_가장짧은문자거리 {
    public String solution(String str) {
        String[] split = str.split(" ");
        List<String> list = Arrays.asList((split[0]).split(""));
        List<String> result = new ArrayList<>();


        for (int i = 0; i < list.size(); i++) {
            int back =0;
            int front = 0;
            for(int j = i; j >=0; j--){
                if(list.get(j).equals(split[1])){
                    break;
                }
                if((j -1) < 0){
                    back = 100;
                }
                back++;
            }
            for(int j = i; j <list.size(); j++){
                if(list.get(j).equals(split[1])){
                    break;
                }
                if((j +1) >= list.size()){
                    front = 100;
                }
                front++;
            }
            if (back > front) {
                result.add(String.valueOf(front));
            }
            else{
                result.add(String.valueOf(back));
            }
        }
        return String.join(" ", result);
    }

    public int[] solution2(String s, char t){
        int[] answer=new int[s.length()];
        int p=1000;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==t){
                p=0;
                answer[i]=p;
            }
            else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=s.length()-1; i>=0; i--){
            if(s.charAt(i)==t) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i], p);
            }
        }
        return answer;
    }


    /*
    teachermode e
     */
    public static void main(String[] args) {
        Main10_가장짧은문자거리 main = new Main10_가장짧은문자거리();
        Scanner in=new Scanner(System.in);
        String input1 = in.nextLine();

        System.out.println(main.solution(input1));
    }
}