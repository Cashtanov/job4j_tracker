package inheritance;

public class Doctor extends Profession {

    private Pacient pacient;

    public Doctor(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.pacient = pacient;
    }

    public static Diagnosis heal(Pacient pacient) {
        return new Diagnosis("Диагноз");
    }
}
