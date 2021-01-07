package se.lexicon.model;

public class Todo {
    //Creating fields
    private int todoId;
    private String description;
    private boolean done;
    private Person assignee;

    //Constructing the object
    public Todo(int todoId, String description) {
        this.todoId = todoId;
        this.description = description;
    }

    //Including getters and setters that are needed
    public int getTodoId() {
        return todoId;
    }

    public void setTodoId(int todoId) {
        this.todoId = todoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}