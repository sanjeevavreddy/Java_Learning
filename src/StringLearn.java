public class StringLearn {




    public static void main(String[] args) {
        String str = new String("abc");
        String str1 = "abc";

        StringBuilder stringBuilder=new StringBuilder(str);
        StringBuilder stringBuilder1=new StringBuilder(str1);

        System.out.println(str.equals(str1));


        System.out.println(stringBuilder.equals(stringBuilder1));
        System.out.println(stringBuilder);
        char c='c';
        String C=Character.toString(c);

    }
}
