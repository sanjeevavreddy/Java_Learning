import javax.swing.*;
import java.awt.*;
import java.util.Iterator;

public class Learn_Char {

    //char has 2 bytes (16 bits) (has 65535 values)
    public static void main(String[] args) {
        String S = "Welcome to Java Programming";
        StringBuilder LOWER = new StringBuilder();
        StringBuilder UPPER = new StringBuilder();
        int temp = 'a';
        char temp1 = 65;

        for (char c : S.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                LOWER.append(c);
            } else if (c >= 'A' && c <= 'Z') {
                UPPER.append(c);
            }
        }

        System.out.println(LOWER);
        System.out.println(UPPER);
        System.out.println(temp);
        System.out.println(temp1);


    }

}
