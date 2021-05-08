public class Multidimentional_Arrays {
    public static void main(String[] args) {
        int[] number = {1, 2, 3};
        int[][] matrix = {{1, 2, 3, 4, 5},
                {4},
                {7, 8, 9}};
        System.out.println(matrix[1][0]);
        System.out.println(matrix[0][4]);
        int[] number1 = new int[5];

        String[][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);

        int[] number2 = {1, 2, 3}; //вывести двухмерный массив на экран
        int[][] matrix1 = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        for (int i = 0; i < matrix1.length; i++) {
            for (int j = 0; j < matrix1[i].length; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }
    }
}
