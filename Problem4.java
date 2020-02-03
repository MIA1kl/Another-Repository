package week2;

public class Problem4 {
    public static void main(String[] args) {
        method1();
        method2();
        method3();
        method1();
        method2();
        method3();
        method2();
        method1();
        method3();
        method2();
    }



    private static void method1() {
        System.out.println("  _______\n" +
                " /       \\\n" +
                "/         \\");
    }
    private static void method2() {
        System.out.println("\\         /\n" +
                " \\_______/\n");
    }
    private static void method3() {
        System.out.println("-\"-'-\"-'-\"-");

    }

}
