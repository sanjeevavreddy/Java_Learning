
import java.util.List;
import java.util.*;

import java.util.ArrayList;

public class LearnStrigs {

    public static void main(String[] args) {
        String SS = "SANJEEVAVEEJNAS";
        String SS1 = "SANJEEVA";


        StringBuilder SB = new StringBuilder(SS);

//        SS.concat(SS1);

//        SB.append(SS1);

//        SB.deleteCharAt(7);


//        System.out.println(IsPallindrome(SS));
//        System.out.println(isVowel('b'));
        System.out.println(isAnagram("anagram", "nagrama"));
        System.out.println(isAnagram("anagram", "nagraxa"));

    }

    public static boolean isVowel(char ch) {
        char[] vowel = {'a', 'e', 'i', 'o', 'u'};
        List<Character> vowellist = new ArrayList<Character>();
        for (char c : vowel) {
            vowellist.add(c);
        }

        return vowellist.contains(ch);
    }

    public static boolean IsPallindrome(String Word) {
        boolean flag = true;
        for (int i = 0; i < Word.length() / 2; i++) {
            if (Word.charAt(i) != Word.charAt(Word.length() - 1 - i)) {
                flag = false;
                break;
            }
        }
        return flag;
    }

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if (a.length() != b.length())
            return false;
        else {
            boolean flag = true;
            String A = a.toLowerCase();
            String B = b.toLowerCase();
            char[] charArrayA = A.toCharArray();
            char[] charArrayB = B.toCharArray();

            List<Character> charArrayListA = new ArrayList<>();
            for (char c : charArrayA)
                charArrayListA.add(c);
            List<Character> charArrayListB = new ArrayList<>();
            for (char c : charArrayB)
                charArrayListB.add(c);

            Collections.sort(charArrayListA);
            Collections.sort(charArrayListB);


            for (int i = 0; i < charArrayA.length; i++) {
                if (!charArrayListA.get(i).equals(charArrayListB.get(i))) {

                    flag = false;
                    break;
                }
            }
            return flag;

        }
    }

}
