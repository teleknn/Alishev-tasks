package Searilization;

import java.io.Serializable;

public class Person implements Serializable {
    private int id; //Чтобы НЕ сериализовать данное поле надо добавить - private transient int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Переопределяем метод String
    public String toString() {
        return id + " : " + name;
    }
}
