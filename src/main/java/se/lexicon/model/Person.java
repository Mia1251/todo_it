package se.lexicon.model;

public class Person {
    //Creating fields
    private int personId;
    private int finalPersonId;
    private String firstName;
    private String lastName;

    //Constructing the object
    public Person(int personId, int finalPersonId,String firstName, String lastName) {
        this.personId = personId;
        this.finalPersonId = finalPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //Including getters and setters that are needed
    public int getPersonId() {
        return personId;
    }

    public void setPersonId(int personId) {
        this.personId = personId;
    }

    public int getFinalPersonId() {
        return finalPersonId;
    }

    public void setFinalPersonId(int finalPersonId) {
        this.finalPersonId = finalPersonId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
