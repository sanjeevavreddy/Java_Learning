package Numbers;

class FibanociiTriangle {


    public static void main(String args[]) {
        int n = 12;
        int[] fibs = new int[n];
        for (int i = 1; i <= n; i++)
            fibs[i - 1] = fib(i);

        int temp = 1;
        int i = 0;

        while (i < n) {
            for (int j = 0; j < temp; j++) {
                if (i == n) {
                    break;
                }
                System.out.print(fibs[i] + " ");
                i++;
            }
            temp = temp + 1;
            System.out.println("");
        }
    }

    static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

}