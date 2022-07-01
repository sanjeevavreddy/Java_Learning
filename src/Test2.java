public class Test2 {

    public static void main(String[] args) {

        System.out.println(calculator(1,2));
        System.out.println(calculator(2,1));
        System.out.println(calculator(2,2));


    }

    public static int calculator(int a,int b)
    {
        if(a>b)
            return a+b;
        else
            return a-b;

    }

}
