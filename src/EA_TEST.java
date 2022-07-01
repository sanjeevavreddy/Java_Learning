import java.util.HashSet;
import java.util.Set;

public class EA_TEST {
    public static void main(String[] args) {
//        String A="Hello";
//        String B="World";
//
//        String C="";
//
//        C=A;
//
//        A=B;
//        B=C;
//
////        StringBuilder temp = new StringBuilder(A);
////        StringBuilder temp1 = new StringBuilder(B);
//
////        B=temp1.toString();
////        A=temp.toString();
//
//        System.out.println("A:"+A);
//        System.out.println("B:"+B);
//        System.out.println("C:"+C);

//        System.out.println(Test1("Hello World"));

//        printNonRepeated("Hello World");

        Occurence("Hello World");
    }
    public static void Occurence(String S)
    {
        Set<Character> AllChars = new HashSet<>();
        for(int i=0;i<S.length();i++)
        {
            AllChars.add(S.charAt(i));
        }

        for(Character c:AllChars)
        {
            int count=0;
            for(int j=0;j<S.length();j++)
            {
                if(c==S.charAt(j))
                    count=count+1;
            }
            System.out.println(c+":"+count);
        }
    }
    public static void printNonRepeated(String S)
    {
        for(int i=0;i<S.length();i++)
        {
            boolean flag = true;
            for(int j=0;j<S.length();j++)
            {
                if(i==j)
                {
                    continue;
                }
                else if(S.charAt(i)==S.charAt(j))
                {
                    flag = false;
                    break;
                }

            }
            if(flag==true)
            {
                System.out.println(S.charAt(i));
            }
        }
    }
    public static String  Test1(String S) {
        String Temp = "";

        String[] AllWords = S.split(" ");

        for (int i = 0; i < AllWords.length; i++)
        {
            Temp=Temp+" "+reverseOfString(AllWords[i]);
        }

        return Temp;

    }

    private static String reverseOfString(String Word) {
        String temp="";
        for(int i=Word.length()-1;i>=0;i--)
        {
            temp=temp+Word.charAt(i);
        }
        return temp;
    }
}
