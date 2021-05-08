package Recurtion;

public class Test {
    public static void main(String[] args) {
        counter(3);
        System.out.println();
        System.out.println(fact(4));
    }

    private static void counter(int n) {
        if (n == 0)
            return;
        System.out.println(n);

        counter(n - 1);
    }

    private static int fact(int g) {
        if (g == 1)
            return 1;

        return g * fact(g - 1);
    }
}
