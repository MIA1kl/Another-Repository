package week2;

public class Problem7 {
    public static void main(String[] args) {
        method1();
        method1();
        method2();
        method1();
    }

    private static void method1() {
        System.out.println("*****\n" +
                "*****\n" +
                " * *\n" +
                "  *\n" +
                " * *\n");
    }

    private static void method2() {
        System.out.println("*****\n" +
                "*****\n" +
                "\n" +
                "  *\n" +
                "  *\n" +
                "  *");
    }
}
