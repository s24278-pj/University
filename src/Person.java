public abstract class Person implements IPrintInfo{
    protected String name;
    protected String surname;
    protected int yearOfBirth;
    protected Gender gender;

    public Person(String name, String surname, int yearOfBirth, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void toPrintInfo(){
        System.out.println("Name: " + getName() + "\nSurname: " + getSurname() + "\nYear of Birth: " + getYearOfBirth());
    }
}
