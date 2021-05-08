package Inserted_Class;

public class Electrocar {
    private int id;

    //Нестатический вложенный класс (имееют доступ к полям обьекта)
    private class Motor {
        public void startMotor(){
            System.out.println("Motor" + id + "  is starting");
        }
    }

    //Статический вложенный класс
    public static class Battarey {
        public void charge() {
            System.out.println("Battarey is charging...");
        }
    }

    public Electrocar(int id){
        this.id = id;
    }

    public  void start(){
        Motor motor = new Motor();
        motor.startMotor();
        final int x = 1;
        //Вложенный класс в метод
        class SomeClass {
            public void someMethod(){
                System.out.println(x);
                System.out.println(id);
            }
        }

        System.out.println("Electrocar is starting");

    }


}
