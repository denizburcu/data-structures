package mobilephone;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void saveContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        int position = contacts.indexOf(contact);
        if (position > 0) {
            contacts.remove(position);
        } else {
            System.out.println("The contact is not found in the phone. ");
        }
    }

    public Contact queryContact(Contact contact) {
        int position = contacts.indexOf(contact);
        if (position > 0) {
            return contacts.get(position);
        } else {
            return null;
        }
    }

    public void modifyContact(Contact contact) {
        int position = contacts.indexOf(contact);
        contacts.set(position, contact);
        System.out.println("Contact" + (position + 1) + " has been modified.");
    }

    public void printList() {
        System.out.println("You have " + contacts.size() + " people in your contact list.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.println("Name: " + contacts.get(i).getName() + "Phone number: " + contacts.get(i).getPhoneNumber());
        }
    }
}
