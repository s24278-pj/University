public class Main {

    public static void main (String[] args){
        Student student1 = new Student("Adam", "Kowalski", 1994, Gender.MALE, "s24785");
        Scholar scholar1 = new Scholar("Adam", "Kowalski", 1994, Gender.MALE, "s24785", true);
        Scholar scholar2 = new Scholar("Adam", "Kowalski", 1994, Gender.MALE, "s24785", false);
        Lecturer lecturer1 = new Lecturer("Damian", "Tomaszewski", 1970, Gender.MALE, "Doctor");

        student1.toPrintInfo();
        System.out.println("--");
        scholar1.toPrintInfo();
        System.out.println("--");
        scholar2.toPrintInfo();
        System.out.println("--");
        lecturer1.toPrintInfo();
    }
}
