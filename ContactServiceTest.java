package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactServiceTest {

    @Test
    public void testAddContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        assertEquals(contact, service.findContact("10001"));
    }

    @Test
    public void testCannotAddDuplicateContactID() {

        ContactService service = new ContactService();

        Contact contact1 = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        Contact contact2 = new Contact(
                "10001",
                "John",
                "Smith",
                "9876543210",
                "456 Oak Street"
        );

        service.addContact(contact1);

        assertThrows(IllegalArgumentException.class, () -> {
            service.addContact(contact2);
        });
    }

    @Test
    public void testDeleteContact() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        service.deleteContact("10001");

        assertNull(service.findContact("10001"));
    }

    @Test
    public void testUpdateFirstName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        service.updateFirstName("10001", "Katie");

        assertEquals("Katie", contact.getFirstName());
    }

    @Test
    public void testUpdateLastName() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        service.updateLastName("10001", "Smith");

        assertEquals("Smith", contact.getLastName());
    }

    @Test
    public void testUpdatePhone() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        service.updatePhone("10001", "9876543210");

        assertEquals("9876543210", contact.getPhone());
    }

    @Test
    public void testUpdateAddress() {

        ContactService service = new ContactService();

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        service.addContact(contact);

        service.updateAddress("10001", "456 Oak Street");

        assertEquals("456 Oak Street", contact.getAddress());
    }

    @Test
    public void testCannotUpdateNonexistentContact() {

        ContactService service = new ContactService();

        assertThrows(IllegalArgumentException.class, () -> {
            service.updateFirstName("99999", "John");
        });
    }
}