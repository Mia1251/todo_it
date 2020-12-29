package se.lexicon.model;

public class Person {

    private int personId;           //Required fields
    private int finalPersonId;     //Required fields
    private String firstName;       //Required fields
    private String lastName;        //Required fields


    public Person(int personId, String firstName, String lastName) {        //Constructing the object
        this.personId = personId;
        this.finalPersonId = finalPersonId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    //getters and setters that are needed
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
