package contacts;

import validInputs.ValidInputs;

import java.util.LinkedList;

public class Contacts<Person> {
    private static ValidInputs validInputs;

    static {
        validInputs = new ValidInputs();
    }

    private LinkedList<Person> personLinkedList;

    public Contacts(String contactNumber) {
        personLinkedList = new LinkedList<>();
    }


    }

