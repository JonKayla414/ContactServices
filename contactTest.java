package ContactService;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import ContactService.contact;
public class contactTest {

	
@Test
@DisplayName("Contact First Name cannot have more than 10 characters")
void testContactFirstNameTooLong() {
	contact contact = new contact ("JaneDoeJaNEDOEEEE", "Doe", "123456","0123456789", "2500 Manchester 03106");
	System.out.println("The field for contact name: " + contact.getFirstName().length() + "characters is invalid. ");
	System.out.println("Cannot exceed 10.");
	assertTrue(contact.getFirstName().length() > 10);
}
	
	
@Test
@DisplayName("Contact Last Name cannot have more than 10 characters")
void testContactLastNameTooLong() {
	contact contact = new contact ("Jane", "DoeDOEDOEEEE", "123456","0123456789", "2500 Manchester 03106");
	System.out.println("The field for contact name: " + contact.getLastName().length() + "characters is invalid. ");
	System.out.println("Cannot exceed 10.");
	assertTrue(contact.getLastName().length() > 10);
}
		
	
@Test
@DisplayName("Contact ID cannot have more than 10 characters")
void testContactIDTooLong() {
	contact contact = new contact ("Jane", "Doe", "12345678912655","0123456789", "2500 Manchester 03106");
	System.out.println("The field for contact id: " + contact.getId().length() + "characters is invalid. ");
	System.out.println("Cannot exceed 10.");
	assertTrue(contact.getId().length() > 10);
}	
	
@Test
@DisplayName("Contact Phone cannot be lesser/greater than 10 characters")
void testContactPhoneTooLong() {
	contact contact = new contact ("Jane", "Doe", "123456","01234567891111", "2500 Manchester 03106");
	System.out.println("The field for contact phone: " + contact.getPhone().length() + "characters is invalid. ");
	System.out.println("Cannot exceed 10.");
	assertTrue(contact.getId().length() > 10);
}		

@Test
@DisplayName("Contact Address cannot have more than 30 characters")
void testContactAddTooLong() {
	contact contact = new contact ("Jane", "Doe", "123456","0123456789", "2500 Manchester 031061111111111117882656456");
	System.out.println("The field for contact phone: " + contact.getPhone().length() + "characters is invalid. ");
	System.out.println("Cannot exceed 30.");
	assertTrue(contact.getId().length() > 30);
}		
	
	
	
}
