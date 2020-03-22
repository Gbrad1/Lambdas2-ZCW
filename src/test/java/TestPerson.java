import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;


public class TestPerson {

    Person anon;
    Person testPerson;

    @Before
    public void setup() {
        LocalDate ld = LocalDate.of(2000, 01, 01);
        anon = new Person();
        testPerson = new Person("John Doe", ld, "johnDoe@gmail.com");
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
}