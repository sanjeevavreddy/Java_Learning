import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class LogestSubStrWithUnique {

    static List <String> AllStrs = new ArrayList<>();

    public static void main(String[] args) {
        LogestSubStrWith("abcadeab");

        SortListByLength();
//        for (String s:AllStrs)
//            System.out.println(s);
        System.out.println(AllStrs.get(0));
    }

    public static void LogestSubStrWith(String S)
    {
        for(int i=0;i<S.length()-1;i++)
        {
            for(int j=i+1;j<S.length();j++)
            {
                if(isStringWithUniqe(S.substring(i,j)))
                {
                    AllStrs.add(S.substring(i,j));
                }
            }
        }
    }

    private static boolean isStringWithUniqe(String substring) {
        boolean flag = true;
        for(int i=0;i<substring.length()-1;i++)
        {
            for (int j=i+1;j<substring.length();j++)
            {
                if(substring.charAt(i)==substring.charAt(j))
                {
                    flag = false;
                    break;
                }

            }
        }
        return flag;
    }
    public static void SortListByLength()
    {
        for(int i=0;i<AllStrs.size()-1;i++)
        {
            for(int j=i+1;j<AllStrs.size();j++)
            {
                if(AllStrs.get(i).length()<AllStrs.get(j).length())
                {
                    String temp="";
                    temp=AllStrs.get(i);
                    AllStrs.set(i,AllStrs.get(j));
                    AllStrs.set(j,temp);
                }

            }
        }
    }

}
