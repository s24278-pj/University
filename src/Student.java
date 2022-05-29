public class Student extends Person implements IPrintInfo{

    private String indexNumber;

    public Student(String name, String surname, int yearOfBirth, Gender gender, String indexNumber) {
        super(name, surname, yearOfBirth, gender);
        this.indexNumber = indexNumber;
    }

    public String getIndexNumber() {
        return indexNumber;
    }

    public void setIndexNumber(String indexNumber) {
        this.indexNumber = indexNumber;
    }

    public void toPrintInfo(){
        System.out.println("Student: ");
        super.toPrintInfo();
        System.out.println("Index number: " + getIndexNumber());
    }
}
