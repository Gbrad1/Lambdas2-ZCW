import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class TestPerson {

    Person anon;
    Person testPerson;
    Person amanda;
    Person giles;
    Person hunter;
    Person margot;

    LocalDate ld;
    LocalDate ald;
    LocalDate gld;
    LocalDate hld;
    LocalDate mld;

    List<Person> list;

    @Before
    public void setup() {
        ld = LocalDate.of(2000, 1, 1);
        ald = LocalDate.of(1996, 10, 31);
        gld = LocalDate.of(1995, 5,15);
        hld = LocalDate.of(1996, 1, 7);
        mld = LocalDate.of(1996, 9, 27);
        anon = new Person();
        testPerson = new Person("John Doe", ld, "johnDoe@gmail.com", Person.Sex.MALE);
        amanda = new Person("Amanda", ald, "amandaDeflip@gmail.com", Person.Sex.FEMALE);
        giles = new Person("Giles", gld, "gilesbradford27@gmail.com", Person.Sex.MALE);
        hunter = new Person("Hunter", hld, "hhh@gmail.com", Person.Sex.MALE);
        margot = new Person("Margot", mld, "margot@gmail.com", Person.Sex.FEMALE);

        list = new ArrayList<>();
        list.add(amanda);
        list.add(giles);
        list.add(hunter);
        list.add(margot);
    }

    @Test
    public void testNullaryPersonConstructor() {
        String expectedName = "anonymous";

        Assert.assertEquals(expectedName, anon.getName());
    }

    @Test
    public void testPersonConstructor() {
        String expectedName = "John Doe";

        Assert.assertEquals(expectedName, testPerson.getName());
    }

    @Test
    public void testGetPersonsAge() {
        Assert.assertEquals(20, testPerson.getAge());
    }

    @Test
    public void testGetAge() {
        Assert.assertEquals(20, testPerson.getAge());
    }

    @Test
    public void testPrintPersonOlderThan() {
        Person.printPersonsOlderThan(list, 20);
        Assert.assertTrue(amanda.getAge() > 20);
        Assert.assertTrue(giles.getAge() > 20);
    }

    @Test
    public void testPrintPersonsWithinAgeRange() {
        Person.printPersonsWithinAgeRange(list, 15, 25);
        Assert.assertTrue(amanda.getAge() > 20 && amanda.getAge() < 25);
        Assert.assertTrue(giles.getAge() > 20&& giles.getAge() < 25);
    }

    @Test
    public void testIfPersonIsEligibleToDrive() {
        Person.printPersons(list);
        Assert.assertTrue(amanda.getAge() > 16);
        Assert.assertTrue(giles.getAge() > 16);
        Assert.assertTrue(hunter.getAge() > 16);
        Assert.assertTrue(margot.getAge() > 16);
    }
}