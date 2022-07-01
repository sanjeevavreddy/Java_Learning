public class RepeatedSequenceInString {
    public static void main(String[] args) {
        System.out.println(countSequenceRepeated("abbbaaaaccaaaab"));
    }

    public static int countSequenceRepeated(String S)
    {
        boolean isRepeated=false;
        boolean isRepeatedEarlier;

        S=S+".";
        int count=0;

        for(int i=1;i<S.length();i++)
        {
//            System.out.println(S.charAt(i-1) +":"+ S.charAt(i));

            isRepeatedEarlier=isRepeated;

            isRepeated= S.charAt(i) == S.charAt(i - 1);

            if(isRepeated==false && isRepeatedEarlier==true)
            {
                count=count+1;

            }

        }
        return count;
    }
}
