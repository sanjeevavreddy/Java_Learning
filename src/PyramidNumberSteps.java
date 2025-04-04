//input 5
//output
//1
//2 6
//3 7 10
//4 8 11 13
//5 9 12 14 15

//System.out.println("A9".matches("[^0-9]"));

public class PyramidNumberSteps {
    public static void main(String[] args) {
        int a = 4;
        for (int i = 1; i <= a; i++) {
            int x = i, y = a;
            for (int j = 1; j <= i; j++) {
                System.out.print(x + " ");
                x = x + y - 1;
                y--;
            }
            System.out.println();
        }
    }
}
