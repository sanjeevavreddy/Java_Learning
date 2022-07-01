import java.util.Locale;

public class ReplaceCharWithOpposite {
    public static void main(String[] args) {
        String actualString="ABabcdefgYZ";


        String result="";

        for(int i=0;i<actualString.length();i++)
        {
            result=result+reverseChar(actualString.charAt(i));
        }

        System.out.println(result);

    }

    private static String reverseChar(char charAt) {

        if(charAt>='a'&&charAt<='z')
        {
            int j=charAt-'a';
            int ascii ='z'-j;
            char c = (char)ascii;
            return String.valueOf(c);
        }
        else if(charAt>='A'&&charAt<='Z')
        {
            int j=charAt-'A';
            int ascii ='Z'-j;
            char c = (char)ascii;
            return String.valueOf(c);
        }
        else return String.valueOf(charAt);
    }
}
