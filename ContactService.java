package contact;

import java.util.ArrayList;

public class ContactService {

    private ArrayList<Contact> contacts = new ArrayList<>();

    // Add a contact
    public void addContact(Contact contact) {

        if (contact == null) {
            throw new IllegalArgumentException("Contact cannot be null");
        }

        // Make sure the contact ID is unique
        if (findContact(contact.getContactID()) != null) {
            throw new IllegalArgumentException("Contact ID already exists");
        }

        contacts.add(contact);
    }

    // Delete a contact using the contact ID
    public void deleteContact(String contactID) {

        Contact contact = findContact(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contacts.remove(contact);
    }

    // Update first name
    public void updateFirstName(String contactID, String firstName) {

        Contact contact = findContact(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contact.setFirstName(firstName);
    }

    // Update last name
    public void updateLastName(String contactID, String lastName) {

        Contact contact = findContact(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contact.setLastName(lastName);
    }

    // Update phone number
    public void updatePhone(String contactID, String phone) {

        Contact contact = findContact(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contact.setPhone(phone);
    }

    // Update address
    public void updateAddress(String contactID, String address) {

        Contact contact = findContact(contactID);

        if (contact == null) {
            throw new IllegalArgumentException("Contact not found");
        }

        contact.setAddress(address);
    }

    // Find a contact by contact ID
    public Contact findContact(String contactID) {

        for (Contact contact : contacts) {

            if (contact.getContactID().equals(contactID)) {
                return contact;
            }
        }

        return null;
    }
}