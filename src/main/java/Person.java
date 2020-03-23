import java.time.LocalDate;
import java.time.Period;
import java.util.List;

public class Person {

    public enum Sex {
        MALE,
        FEMALE;
    }

    private final String name;
    private final LocalDate birthday;
    private final String emailAddress;
    private final Sex gender;


    public Person(String name, LocalDate birthday, String emailAddress, Sex sex) {
        this.name = name;
        this.birthday = birthday;
        this.emailAddress = emailAddress;
        this.gender = sex;
    }

    public Person() {
        this.name = "anonymous";
        this.birthday = java.time.LocalDate.now();
        this.emailAddress = "unknown@anonymous.com";
        this.gender = Sex.MALE;
    }


    public int getAge() {
        Period p = Period.between(this.birthday, java.time.LocalDate.now());
        return p.getYears();
    }

    public void printPerson() {
        String person = "Name: %s Birthday: %s Email: %s Gender: %s";
        person = String.format(person, getName(), getBirthday(), getEmailAddress(), getGender());
        System.out.println(person);
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

    public Sex getGender() {
        return gender;
    }

    public static void printPersonsOlderThan(List<Person> roster, int age) {
        for (Person p : roster) {
            if (p.getAge() >= age) {
                p.printPerson();
            }
        }
    }

    public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
        for (Person p : roster) {
            if (low <= p.getAge() && p.getAge() < high) {
                p.printPerson();
            }
        }
    }

    public static void printPersons(List<Person> roster, CheckPerson tester) {
        for (Person p : roster) {
            if (tester.test(p)) {
                p.printPerson();
            }
        }
    }

    alsjdfasjdfasjfjsdfj

}
