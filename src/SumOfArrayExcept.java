public class SumOfArrayExcept {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(sumOfArray(array,5,9));

    }

    public static int sumOfArray(int[] a,int x,int y) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == x) {
                sum = sum + a[i];
                while (a[i] != y)
                    i = i + 1;
                sum = sum + a[i];
            } else {
                sum = sum + a[i];

            }
        }
        return sum;
    }
}
