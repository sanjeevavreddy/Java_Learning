import java.util.HashSet;
import java.util.Set;

public class CompareArrays {
    public static void main(String[] args) {
        int[] A ={1,2,5,7,6,8,8,6};
        int[] B ={1,2,5,6,8,6,7};
        System.out.println(compareArrays(A,B));

    }

    public static boolean compareArrays(int[] A,int[] B)
    {
        boolean flag = true;
        boolean flag1 = true;

        Set<Integer> firstArray = new HashSet<>();
        Set<Integer> secondArray = new HashSet<>();

        for(int i:A)
        firstArray.add(i);

        for(int i:B)
        secondArray.add(i);

        for(Integer I:firstArray)
        {
            if(!secondArray.contains(I))
            {
                flag= false;
                break;
            }
        }

        for(Integer I:secondArray)
        {
            if(!firstArray.contains(I))
            {
                flag1= false;
                break;
            }
        }

        return flag&flag1;
    }

}
