public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a=5,b=6;
        System.out.println(a+":"+b);
        swapFunction(a,b);

    }

    public static void swapFunction(int a,int b)
    {
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println(a+":"+b);
    }
}
