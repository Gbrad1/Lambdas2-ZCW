import java.time.LocalDate;
import java.time.Period;

public class Person {

    public enum Sex {
        MALE,
        FEMALE;
    }

    private final String name;
    private final LocalDate birthday;
    private final String emailAddress;



    public Person(String name, LocalDate birthday, String emailAddress) {
        this.name = name;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
    }

    public Person() {
        this.name = "anonymous";
        this.birthday = java.time.LocalDate.now();
        this.emailAddress = "unknown@anonymous.com";
    }


    public int getAge() {
        Period p = Period.between(this.birthday, java.time.LocalDate.now());
        System.out.println(p.getYears());
        return p.getYears();
    }

    public void printPerson() {

    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthday() {
        return this.birthday;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
