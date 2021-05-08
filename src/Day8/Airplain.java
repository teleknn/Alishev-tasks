package Day8;

class Airplain {
    private String made;
    private int year;
    private int longg;
    private int whith;
    private int volume;

    public Airplain(String made, int year, int longg, int whith) {
        this.made = made;
        this.year = year;
        this.longg = longg;
        this.whith = whith;
        this.volume = 0;
    }

    //“Изготовитель: ... , год выпуска: ... , длина: ..., вес: ..., количество топлива в баке: ...”
    public void info() {
        System.out.println("Изготовитель: " + made + ", год выпуска: " + year + ", длина: " + longg
                + " вес: " + whith + "количество топлива в баке: " + volume);
    }

    public void fullUp(int inputFuel) {
        volume = volume + inputFuel;
    }

    public String getMade() {
        return made;
    }

    public void setMade(String made) {
        this.made = made;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getLongg() {
        return longg;
    }

    public void setLongg(int longg) {
        this.longg = longg;
    }

    public int getWhith() {
        return whith;
    }

    public void setWhith(int whith) {
        this.whith = whith;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Изготовитель: " + made + ", год выпуска: " + year + ", длина: " + longg
                + " вес: " + whith + "количество топлива в баке: " + volume;
    }
}
