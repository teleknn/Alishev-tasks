package Day18;

import java.util.Enumeration;

public class Day18p2 {
    public static void main(String[] args) {
        int n = 545777776;

        System.out.println(count7(n));

    }

    public static int count7(int i) {
        if (i == 0)
            return 0;

        if (i % 10 == 7)
            return 1 + count7(i / 10);
        else
            return count7(i / 10);

    }

}
