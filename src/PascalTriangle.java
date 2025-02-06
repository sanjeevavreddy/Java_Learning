import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {

    public static List<List<Integer>> generate(int numRows) {
        int[] arr = {1};
        List <List<Integer>> result = new ArrayList<List<Integer>>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> res = new ArrayList<Integer>();
            for (int a : arr) {
                    res.add(a);
            }
            result.add(res);
            arr = nextLineInPascal(arr);
        }
        return result;
    }

    public static int[] nextLineInPascal(int[] array) {
        int[] newArray = new int[array.length + 1];

        newArray[0] = 1;
        newArray[array.length] = 1;

        for (int i = 0; i < array.length - 1; i++) {
            newArray[i + 1] = array[i] + array[i + 1];
        }



        return newArray;
    }

    public static void main(String[] args) {

        System.out.println(generate(4));
    }

}
