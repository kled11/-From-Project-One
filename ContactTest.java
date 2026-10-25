package contact;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ContactTest {

    @Test
    public void testValidContact() {

        Contact contact = new Contact(
                "10001",
                "Kim",
                "Ledesma",
                "1234567890",
                "123 Main Street"
        );

        assertEquals("10001", contact.getContactID());
        assertEquals("Kim", contact.getFirstName());
        assertEquals("Ledesma", contact.getLastName());
        assertEquals("1234567890", contact.getPhone());
        assertEquals("123 Main Street", contact.getAddress());
    }

    @Test
    public void testContactIDCannotBeNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    null,
                    "Kim",
                    "Ledesma",
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testContactIDCannotBeTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "12345678901",
                    "Kim",
                    "Ledesma",
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testFirstNameCannotBeNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    null,
                    "Ledesma",
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testFirstNameCannotBeTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "KimberlyAnn",
                    "Ledesma",
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testLastNameCannotBeNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    null,
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testLastNameCannotBeTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    "LedesmaSmith",
                    "1234567890",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testPhoneMustBeTenDigits() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    "Ledesma",
                    "123456789",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testPhoneCannotContainLetters() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    "Ledesma",
                    "12345abc90",
                    "123 Main Street"
            );
        });
    }

    @Test
    public void testAddressCannotBeNull() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    "Ledesma",
                    "1234567890",
                    null
            );
        });
    }

    @Test
    public void testAddressCannotBeTooLong() {

        assertThrows(IllegalArgumentException.class, () -> {
            new Contact(
                    "10001",
                    "Kim",
                    "Ledesma",
                    "1234567890",
                    "1234567890123456789012345678901"
            );
        });
    }
}