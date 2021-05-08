package Day6;

import java.util.Random;

class Teacher {
    private String fio;
    private String subgect;

    public Teacher(String fio, String subgect) {
        this.fio = fio;
        this.subgect = subgect;
    }

    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getSubgect() {
        return subgect;
    }

    public void setSubgect(String subgect) {
        this.subgect = subgect;
    }

    public void evaluate (Student student){
        Random random = new Random();
        int randomVol = random.nextInt(4) + 2;
        String evolution = "";

    switch (randomVol){
        case 2: evolution = "Неудовлетворительно";
            break;
        case 3: evolution = "Удовлитворительно";
            break;
        case 4: evolution = "Хорошо";
            break;
        case 5: evolution = "Отлично";
            break;
    }
        System.out.println("Преподаватель "+ this.fio + "оценил студента с именем "+ student.getName()
                + "по предмету "+this.subgect + "на оценку " + evolution);
    }
}
