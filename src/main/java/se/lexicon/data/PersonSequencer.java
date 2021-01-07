package se.lexicon.data;

public class PersonSequencer {

    private static int personId = 1;

    public static int nextPersonId() {
        return ++personId;
    }
    public static void reset() {
        personId = 0;
    }
}