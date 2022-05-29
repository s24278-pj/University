public class Lecturer extends Person implements IPrintInfo{
    private String title;

    public Lecturer(String name, String surname, int yearOfBirth, Gender gender, String title) {
        super(name, surname, yearOfBirth, gender);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void toPrintInfo(){
        System.out.println("Lecturer: ");
        super.toPrintInfo();
        System.out.println("Title: " + getTitle());
    }
}
