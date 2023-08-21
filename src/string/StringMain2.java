package string;

import java.util.Scanner;

public class StringMain2 {
    public String solution(String string){
        StringBuilder result = new StringBuilder();
        for(char character : string.toCharArray()){
            if(Character.isLowerCase(character)){
                result.append(String.valueOf(character).toUpperCase());
            }else {
                result.append(String.valueOf(character).toLowerCase());
            }
        }
        return result.toString();
    }
    public static void main(String[] args) {
        StringMain2 T = new StringMain2();
        Scanner sc = new Scanner(System.in);
        String string = sc.next();
        System.out.println(T.solution(string));
    }
}
