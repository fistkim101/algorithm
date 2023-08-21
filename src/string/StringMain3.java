package string;

import java.util.Scanner;

public class StringMain3 {

    public String solution(String statement){
        String longestWord = "";
        String[] words = statement.split(" ");
        for(String word : words){
            if(word.length() > longestWord.length()){
                longestWord = word;
            }
        }

        return longestWord;
    }
    public static void main(String[] args) {
        StringMain3 T = new StringMain3();
        Scanner scanner = new Scanner(System.in);
        String statement = scanner.nextLine();
        System.out.println(T.solution(statement));
    }
}
