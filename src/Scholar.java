import org.w3c.dom.ls.LSOutput;

public class Scholar extends Student implements IPrintInfo{
    private boolean scholarship;

    public static final double SCHOLARSHIP_AMOUNT = 1500;

    public boolean isScholarship() {
        return scholarship;
    }

    public void setScholarship(boolean scholarship) {
        this.scholarship = scholarship;
    }

    public Scholar(String name, String surname, int yearOfBirth, Gender gender, String indexNumber, boolean scholarship) {
        super(name, surname, yearOfBirth, gender, indexNumber);
        this.scholarship = scholarship;
    }

    public void toPrintInfo(){
        super.toPrintInfo();
        System.out.print("Scholarship: ");
        if(scholarship){
            System.out.println(SCHOLARSHIP_AMOUNT);
        }else {
            System.out.println(0);
        }
    }
}
