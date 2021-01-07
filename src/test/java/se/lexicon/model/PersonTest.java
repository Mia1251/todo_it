package se.lexicon.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonTest {

    private Person testPerson;

    @Before
    public void setup() {
        testPerson = new Person(1, "Maria", "Svensson");
    }
    @Test
    public void test_Person_personId() {
        int expectedResult = 1;
        int actualResult = testPerson.getPersonId();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_Person_FirstName() {
        String expectedResult = "Maria";
        String actualResult = testPerson.getFirstName();
        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test_Person_LastName() {
        String expectedResult = "Svensson";
        String actualResult = testPerson.getLastName();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
