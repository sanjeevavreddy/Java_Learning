//Input: aaabbcczza
//        Output: 3a2b2c2z1a


public class FindNumberOfCharsInString {
    public static void main(String[] args) {
        FindNumberOfChars("aaabbcczza");
    }

    public static void FindNumberOfChars(String S)
    {

        S=S+".";
        int count = 1;

        for(int i =0;i<S.length()-1;i++)
        {
            if(S.charAt(i)==S.charAt(i+1))
            {
                count++;
            }
            else
            {
                System.out.print(String.valueOf(count)+S.charAt(i));
                count=1;
            }
        }
    }
}
