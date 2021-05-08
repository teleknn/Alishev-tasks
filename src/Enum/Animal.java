package Enum;

public enum Animal {
    DOG("собака"), CAT("кошка"), FROG("лягушка");
    private String translation;

    Animal(String translation) {
        this.translation = translation;
    }

    public String getTranslation() {
        return translation;
    }

    public String toString() {
        return "перевод на русский" + translation;
    }
}
