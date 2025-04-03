import java.util.HashMap;
import java.util.Map;

public class StringReverseWithSpecialChar {

    public static void main(String[] args) {
        String s = "Ja@va Progra@mmin@g$";

        StringBuilder s1 = new StringBuilder();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z'))
                s1.append(s.charAt(i));
        }
        int count = s1.length()-1;
        for (int i = 0; i < s.length(); i++) {
            if ((s.charAt(i) >= 'a' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z')) {
                s2.append(s1.charAt(count));
                count--;
            }

            else {
                s2.append(s.charAt(i));
            }
        }
        System.out.println(s2);
    }
}