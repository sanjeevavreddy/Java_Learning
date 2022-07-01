public class PanagramCheck {


    public static void main(String[] args) {
        String A[] = {"The", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        System.out.println(panagram(A));
    }

    private static int panagram(String[] A) {
        int b = 1;
        StringBuilder sentence = new StringBuilder();
        for (String str : A) {
            sentence.append(str);
        }
        String sentence1 = sentence.toString();
        for (int i = 'a'; i <= 'z'; i++) {
            int j = 'A';
            String CAPS = Character.toString(i);
            String small = Character.toString(j);
            if (!(sentence1.contains(CAPS) || sentence1.contains(small))) {
                b = 0;
            }
            j++;
        }
        return b;

    }
}
