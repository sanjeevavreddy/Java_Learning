public class MergeStringAlternate {

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder s = new StringBuilder();

        for (int i = 0; i < word1.length() + word2.length(); i++) {
            if (i > word1.length() - 1) {
                s.append(word2.substring(i));
                break;
            } else if (i > word2.length() - 1) {
                s.append(word1.substring(i));
                break;
            } else
                s.append(word1.charAt(i)).append(word2.charAt(i));
        }
        return s.toString();
    }

    public static void main(String[] args) {
        System.out.println(mergeAlternately("SA","PRAV"));
    }
}
