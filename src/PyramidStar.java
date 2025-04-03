public class PyramidStar {
    public static void main(String[] args) {
        int count = 10;
        for (int i = 0; i < count; i++) {
            for (int k = i; k < count; k++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
