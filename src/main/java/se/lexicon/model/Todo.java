package se.lexicon.model;

public class Todo {
    //Creating fields
    private int todoId;
    private int finalTodoId;
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

    public int getFinalTodoId() {
        return finalTodoId;
    }

    public void setFinalTodoId(int finalTodoId) {
        this.finalTodoId = finalTodoId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isDone() {
        return done;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }
}
