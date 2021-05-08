public class Arrays {
    public static void main(String[] args) {
        int number = 10; // приметивный тип данных   // [10]
        int[] numbers = new int[5]; // numbers -> [массив] ссылаеться на массив в отличии от выше
        // System.out.println(numbers[0]);  // 0 1 2 3 4
        numbers[0] = 100;
        numbers[1] = 1000;
        numbers[3] = 30000; // инициализация значений ячеек массива, но так не добно лучше через цикл!
        System.out.println(numbers[0]);
        System.out.println(numbers[3]);
        for (int i = 0; i < numbers.length; i++) { //Заносим в массив данные через цикл
            numbers[i] = i * 10;

        }
        for (int i = 0; i < numbers.length; i++) { //вывод данных массива через цикл
            System.out.println(numbers[i]);

        }
        int[] numbers1 = {1, 2, 3, 5}; // можно сразу ввести данные в массив
        for (int i = 0; i < numbers1.length; i++) { //вывод данных массива через цикл
            System.out.println(numbers1[i]);

        }
    }


}
