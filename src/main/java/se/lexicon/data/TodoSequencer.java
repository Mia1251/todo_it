package se.lexicon.data;

public class TodoSequencer {

    //Creating a private static int variable
    private static int todoId = 1;

    public static int nextTodoId() {
        return ++todoId;
    }
    public static void reset() {
        todoId = 0;
    }
}
