package week2;

public class Problem6 {
    public static void main(String[] args) {

        method1();

        method2();

        method2();
        method1();


    }

    private static void method1() {
        System.out.println("Go, team, go!\n" +
                "You can do it.\n");
    }

    private static void method2() {
        System.out.println("Go, team, go!\n" +
                "You can do it.\n" +
                "You're the best,\n" +
                "In the West.\n" +
                "Go, team, go!\n" +
                "You can do it.\n");
    }
}
