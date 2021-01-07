package se.lexicon.model;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TodoTest {

    private Todo testTodo;

    @Before
    public void setup() {
        testTodo = new Todo(1, "Wash my laundry");
    }

    @Test
    public void test_Todo_todoId() {
        int expectedResult = 1;
        int actualResult = testTodo.getTodoId();
        Assert.assertEquals(expectedResult, actualResult);

    }

    @Test
    public void test_Todo_description() {
        String expectedResult = "Wash my laundry";
        String actualResult = testTodo.getDescription();
        Assert.assertEquals(expectedResult, actualResult);
    }
}
