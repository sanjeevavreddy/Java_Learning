public class TestM {
    static int i = 0;

    public static void main(String[] args) {
        loop();
    }

    public static void loop()
    {
        while (i<10)
        {
            i=i+1;
            loop();
        }
        System.out.println(i);
    }
}
