package Enum;

public enum Seasons {
    SUMMER(35), SPRING(10), WINTER(-10), AUTOM(15);

    private int temperatura;
    Seasons ( int temperatura){
        this.temperatura = temperatura;
    }
public int getTemperatura(){
        return temperatura;
}
    //Object ->  Enum -> Seasons
}
