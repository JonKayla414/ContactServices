package ContactService;

public class contact {
	private String firstName;
	private String lastName; 
	
	private String id;
	private String phone;
	private String add;
	public contact(String firstName, String lastName,  String id, String phone, String add) {
		if(firstName == null || firstName.length() > 10 ) {
			throw new IllegalArgumentException("Invalid First Name!");
		}if(lastName == null || lastName.length() > 10 ) {
			throw new IllegalArgumentException("Invalid Last Name!");
		}if(id == null || id.length() > 10 ) {
			throw new IllegalArgumentException("Invalid id!");
		}if(phone == null || phone.length() != 10) {
			throw new IllegalArgumentException("Invalid phone number!");
		}if(add == null || add.length() > 30 ) {
			throw new IllegalArgumentException("Invalid id!");
		}
		this.firstName = firstName;
		this.lastName = lastName;
		this.id=id;
		this.phone=phone;
		this.add=add;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getId() {
		return id;
	}
	public String getPhone() {
		return phone;
	}
	public String getAdd() {
		return add;
	}
}
