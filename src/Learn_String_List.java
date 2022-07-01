import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Learn_String_List {
    public static <strArray> void main(String[] args) {
        String S="nheritence.A";
        String S1="nheritence.B";

//        System.out.println(S.compareTo(S1));





        String[] strArray ={"BHADRI","AJITH","DADA","CHANDRA","BHADRA","BHADR"};

//            for (String str:strArray)
//            {
//                for (int i=0;i<strArray.length-1;i++)
//                {
//                    if(strArray[i].compareTo(strArray[i+1])>0)
//                    {
//                        String temp;
//                        temp =strArray[i];
//                        strArray[i]=strArray[i+1];
//                        strArray[i+1]=temp;
//                    }
//                }
//            }
        for (String str:strArray)
        System.out.print(str);
        List<String> strList = new ArrayList<>(List.of(strArray));
        System.out.println(strList);
        Collections.sort(strList);
        System.out.println(strList);


    }
}
