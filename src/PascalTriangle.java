
public class PascalTriangle {

    public static void generate(int numRows) {
        int arr[] = {1};
        for (int i = 0; i < numRows-1; i++) {
            for (int a : arr) {
                System.out.print(a);System.out.print(" ");

            }
            System.out.println();
            arr = nextLineInPascal(arr);
        }
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

        generate(4);
    }

}
