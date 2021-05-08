package Searilization;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

class WriteObjectArray {
    public static void main(String[] args) {
        Person[] people = {new Person(1, "Bob"),
                new Person(2, "Mike"), new Person(3, "Tom")};
        try {
            FileOutputStream fos = new FileOutputStream("peopleA.bin");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            //Вариант 1 записываем поочередно каждый элемент
            oos.writeInt(people.length);
            for (Person person : people) {
                oos.writeObject(person);
            }



            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        /*Варинат 2 более предпочтительный
        oos.writeObject(people);

         */


    }
}

