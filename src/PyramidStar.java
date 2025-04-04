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


//public class PyramidStar {
//    public static void main(String[] args) {
//        int count = 10;
//
//        for (int i = 0; i < count; i++) {
//            // Print spaces before stars in each row
//            System.out.print(" ".repeat(count - i - 1));
//
//            // Print stars after spaces
//            System.out.print("* ".repeat(i + 1));
//
//            // Move to the next line
//            System.out.println();
//        }
//    }
//}