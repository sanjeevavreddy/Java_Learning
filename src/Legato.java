public class Legato {
    public static void main(String[] args) {
        for (int i = 0; i < 11; i++)
            System.out.println(fibonacii(i));

    }


    static int fibonacii(int n) {
        if (n <= 1)
            return n;
        else
            return fibonacii(n -2 ) + fibonacii(n - 1);
    }
}
