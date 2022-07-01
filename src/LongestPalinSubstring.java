import java.util.*;

class LongestPalinSubstring
{
    static List<String> allPallins = new ArrayList<>();

    public static void main(String[] args) {
        String str = "SANJEEVAVEEJNAA";
        longestPallindroSubStr(str);


        if(allPallins.size()==0)
            System.out.println("none");
        else
            System.out.println(allPallins.get(0));

    }
    static void longestPallindroSubStr(String str)
    {
        for(int i=0;i<=str.length();i++)
        {
            for(int j=i+3;j<=str.length();j++)
            {
                storeIfPallindrome(str.substring(i,j));
//                System.out.println(str.substring(i,j));
            }
        }
    }
    static void storeIfPallindrome(String substr)
    {
        if(isPalindrome(substr))
        {
            allPallins.add(substr);

        }
    }
    static boolean isPalindrome(String str)
    {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }


}