package LearnInheritence;

class MainMethodLearn1 extends MainMethodLearn {
    public static void main(String[] args) {
        MainMethodLearn mmo = new MainMethodLearn();

        mmo.main();
    }

    public void main() {
        System.out.println("Overloaded main() method invoked - 2");
    }
}
