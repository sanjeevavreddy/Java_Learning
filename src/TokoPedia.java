
import java.util.Scanner;

public class TokoPedia {

    public static void main(String[] args) {

        System.out.println(resultString("ab0c1def2asa3sasa"));
    }


    private static String resultString(String Word) {
        String result = "";
        char[] a = Word.toCharArray();

        String numbers = Word.replaceAll("[^0-9]", "");


        char[] reverseNumber = new char[numbers.length()];
        int j = 0;
        for (int i = numbers.length() - 1; i >= 0; i--) {
            reverseNumber[j] = numbers.charAt(i);
            j++;
        }

        StringBuilder results = new StringBuilder();
        j = 0;
        for (int i = 0; i < Word.length(); i++) {
            if (Character.isDigit(Word.charAt(i))) {
                results.append(reverseNumber[j]);
                j++;
            } else
                results.append(Word.charAt(i));
        }
        result = results.toString();
        return result;
    }


}
