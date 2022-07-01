//aabbbcdddd
//2233314444

import java.util.HashSet;
import java.util.Set;

public class JioTest {
    public static void main(String[] args) {
        System.out.print(maxRepeatingChar("aabbbcccccceeeeeeeeeeeeeeeedddd"));
    }
    public static char maxRepeatingChar(String S)
    {
        char c = 0;


        int[] count = new int[S.length()];

        for(int i=0;i<S.length();i++)
        {
            count[i]=findRepeatedinString(S.charAt(i),S);
        }

        int maxiMumNumberIndex=0;
        int maxCount=0;
        for(int i=0;i<count.length;i++)
        {
            if(maxCount<count[i])
            {
                maxCount=count[i];
                maxiMumNumberIndex=i;
            }
        }

//        for(int a:count)
//            System.out.print(a+" ");

        c=S.charAt(maxiMumNumberIndex);

        System.out.print(count[maxiMumNumberIndex]);



        return c;
    }

    private static int findRepeatedinString(Character c1, String s) {
        int count=0;
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)==c1)
            {
                count++;
            }
        }
        return count;
    }

}
