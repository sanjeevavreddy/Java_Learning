import java.util.Arrays;
import java.util.List;

public class CompressString {
    public static void main(String[] args) {
        compress(new char[]{'a', 'b', 'b', 'c', 'c', 'c'});
    }

    public static int compress(char[] chars) {

        StringBuilder s = new StringBuilder();
        String sss = Arrays.toString(chars);

        sss = sss + " ";
        int count = 1;
        for (int i = 0; i < sss.length() - 1; i++) {
            if (sss.charAt(i) == sss.charAt(i + 1)) {
                count++;
            } else {
                s.append(sss.charAt(i));
                if (count > 1)
                    s.append(count);
                count = 1;
            }
        }

        System.out.println(s);

        chars = s.toString().toCharArray();

        System.out.println(chars);

        return s.toString().length();
    }
}
