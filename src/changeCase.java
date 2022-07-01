public class changeCase {
    public static void main(String[] args) {

        String str1 = "Great Power";
        StringBuffer newStr = new StringBuffer(str1);

        for (int i = 0; i < str1.length(); i++) {
            if (Character.isLowerCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toUpperCase(str1.charAt(i)));
            } else if (Character.isUpperCase(str1.charAt(i))) {
                newStr.setCharAt(i, Character.toLowerCase(str1.charAt(i)));
            }
        }
        System.out.println(newStr);
        reverseSentense(newStr);
    }

    public static void reverseSentense(StringBuffer buffer) {
        String S = buffer.toString();
        StringBuilder resultString = new StringBuilder();

        String[] words = S.split(" ");
        for (String s : words) {
            resultString.append(reverse(s)).append(" ");
        }
        System.out.println(resultString.toString().trim());
    }

    public static String reverse(String str) {
        String nstr = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            nstr = ch + nstr;
        }
        return nstr;
    }

}   