package ru.job4j.inheritance;

public class Doctor extends Profession {
    private Pacient pacient;

    public Doctor(String name, String surname, String education, String birthday, Pacient pacient) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
    }

    public Diagnosis heal(Pacient pacient) {
        return new Diagnosis();
    }
}
