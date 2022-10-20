package ContactService;

import java.util.*;  
public class contactService {
private ArrayList<String> contactDet;//arraylist of contact details
private Hashtable<String, ArrayList<String> > contacts;// hashtable id as key value as contact details
private String id; 
public contactService() {
	contacts= new Hashtable <String, ArrayList <String>> ();
	
	}
public void addContact(contact val) {
	contactDet = new ArrayList<String> ();
	id = val.getId();
	contactDet.add(val.getFirstName());
	contactDet.add(val.getLastName());
	contactDet.add(val.getPhone());
	contactDet.add(val.getAdd());
	contacts.put(id, contactDet);
	
	}
public void deleteContact(String id) {
	if(contacts.containsKey(id)){
       contacts.remove(id);
    } else {
        System.out.println("Invalid ID for Contacts!");
    }
}
public void updateContact(String id, String val, String newField) {
	if(contacts.containsKey(id)){
	    
	    ArrayList<String> current = new ArrayList<String> ();
	    
	   
	    
		current = contacts.get(id);
		if (val.equalsIgnoreCase("First Name")) {
			if (newField.length() > 10 || newField==null) {
				System.out.println("Invalid entry");
				
			}else {
			
				current.set(0, newField);
			}
		} else if ( val.equalsIgnoreCase("Last Name")) {
			if (newField.length() > 10 || newField==null) {
				System.out.println("Invalid entry");
				
			}else {
			
				current.set(1, newField);
			}
		}else if (val.equalsIgnoreCase("Phone")) {
			if (newField.length() != 10 ) {
				System.out.println("Invalid entry");
				
			}else {
			
				current.set(2, newField);
			}
		}else {
			if (newField.length() > 30 || newField==null) {
				System.out.println("Invalid entry");
				
			}else {
			
				current.set(3, newField);
			}
		}
	    } else {
	        System.out.println("Invalid ID for Contacts!");
	    }
}

}

