import java.util.*;

public class RepeatedCharsinString {

    public static void main(String[] args) {
        repeatedCharInString("SANJEEVA");

    }

    public static void repeatedCharInString(String S)
    {
        Set<Character> uniqueCharSet = new HashSet<>();
        HashMap<Character, Integer> CharCountHashMap = new HashMap<>();

        for(int i=0;i<S.length();i++)
            uniqueCharSet.add(S.charAt(i));

        for(Character c:uniqueCharSet)
            CharCountHashMap.put(c,repeatedNumberOfTimes(c,S));

        for(Character c:uniqueCharSet)
            System.out.println(c+":"+CharCountHashMap.get(c));


    }
    public static int repeatedNumberOfTimes(Character c,String s)
    {
        int count=0;
        for (int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c)
                count++;
        }
        return count;
    }

}
