package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ContactService.contact;

class contactServiceTest1 {

	@Test
	void testcontact() {
		contact contact = new contact("Jane", "Doe", "123456","0123456789", "2500 Manchester 03106" );
		assertTrue(contact.getFirstName().equals("Jane"));
		assertTrue(contact.getLastName().equals("Doe"));
		assertTrue(contact.getId().equals("123456"));
		assertTrue(contact.getPhone().equals("0123456789"));
		assertTrue(contact.getAdd().equals("2500 Manchester 03106"));
	}
	
	@Test
	void testContactFirstNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("JaneDoeJaNEDOEEEE", "Doe", "123456","0123456789", "2500 Manchester 03106");
		});
	}
	@Test
	void  testContactLastNameTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("Jane", "DoeDOEDOEEEE", "123456","0123456789", "2500 Manchester 03106");
		});
	}
	@Test
	void testContactIDTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("Jane", "Doe", "12345678912655","0123456789", "2500 Manchester 03106");
		});
	}
	void testContactPhoneTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("Jane", "Doe", "123456","01234567891111", "2500 Manchester 03106");
		});
	}
	void testContactAddTooLong() {
		Assertions.assertThrows(IllegalArgumentException.class, () -> {
			new contact("Jane", "Doe", "123456","0123456789", "2500 Manchester 031061111111111117882656456");
		});
	}

}
