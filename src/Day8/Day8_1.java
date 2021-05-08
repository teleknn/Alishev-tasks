package Day8;

public class Day8_1 {
    public static void main(String[] args) {
        String sb1 = "";
        long before= System.currentTimeMillis();
       for (int i=0;i<=20000;i++){sb1=sb1+i + " "; }
        System.out.println(sb1);
        long after= System.currentTimeMillis();
        System.out.println("Time " + (after-before));

        long before1= System.currentTimeMillis();
        StringBuilder sb = new StringBuilder (); for (int j=0;j<=20000;j++){ sb.append(j + ", "); } System.out.println(sb);
        long after1= System.currentTimeMillis();
        System.out.println("Time " + (after-before));
        System.out.println("Time " + (after1-before1));
    }

}
