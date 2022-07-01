public class HackerRank {
    public static void fizzBuzz(int n) {
        // Write your code here
        if(n%3==0 && n%5==0)
        {
            System.out.println("FizzBuzz");
        }
        else if(n%3==0)
        {
            System.out.println("Fizz");
        }
        else if(n%5==0)
        {
            System.out.println("Buzz");
        }
        else
        {
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        for(int i=1;i<=15;i++)
        fizzBuzz(i);
    }
    int[]A={1,2,3,4,5,6,7,8,9,10};
    int l=A.length;
    char a='a';

}
