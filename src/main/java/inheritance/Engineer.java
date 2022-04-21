package inheritance;

public class Engineer extends Profession {

    private Project project;

    public Engineer(String name, String surname, String education, String birthday) {
        super(name, surname, education, birthday);
        this.project = project;
    }

    public Scheme build(Project project) {
        return new Scheme();
    }

}
