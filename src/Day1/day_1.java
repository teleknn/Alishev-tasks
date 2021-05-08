package Day1;

public class day_1 {
    public static void main(String[] args) {
        String string = "JAVA";
        int i=0;
        while (i<10){
            System.out.print(string+" ");
            i++;
        }
        System.out.println();
        System.out.println("___________");

        for (int j=1; j<10; j++){
            System.out.println(string);
        }
        System.out.println();
        System.out.println("___________");

        int year = 1980;
        while (year<=2020){
            System.out.println("Олипиада "+year+" года");
            year = year+4;
        }
        System.out.println();
        System.out.println("___________");

        for (int year2=1980; year2<=2020; year2=year2+4){
            System.out.println("Олипиада "+year2+" года");

            System.out.println();
            System.out.println("___________");

            int k = 9;
            System.out.println("k = "+k);
            for (int f=1; f<=9; f++){
                int l=f*k;
                System.out.println(f+" x "+k+" = "+l);
            }

        }
    }
}
