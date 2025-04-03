import java.util.Arrays;
import java.util.Objects;

public class ReverseWordsInSentence {
    public static void main(String[] args) {
        String s = "A   Sanj";
        System.out.println(Arrays.asList(s.split(" ")));
//        System.out.println(reverseWords("a good   example"));
    }
    public static String reverseWords(String s){
        String[] ss = s.split(" ");

        StringBuilder sss = new StringBuilder();

        for (int i = ss.length - 1; i >= 0; i--) {
            if(!Objects.equals(ss[i], "")) {
                sss.append((ss[i]).trim()).append(" ");
            }
        }

        return sss.toString().trim();
    }
}
