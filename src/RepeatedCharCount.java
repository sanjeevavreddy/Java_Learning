public class RepeatedCharCount {
    public static void main(String[] args) {
        repeatedChar("aaabbcccdeea");
    }

    public static void repeatedChar(String S)
    {
        S=S+".";
        int count=1;
        for (int i=0;i<S.length()-1;i++)
        {
            if(S.charAt(i)!=S.charAt(i+1))
            {
                System.out.print(S.charAt(i)+""+count);
                count=1;
            }
            else
                count=count+1;
        }
    }
}
