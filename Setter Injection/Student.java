package practical5c;

public class Student {
	private Address address;

// Setter method for address
	public void setAddress(Address address) {
		this.address = address;
	}

// Getter method for address
	public Address getAddress() {
		return address;
	}

	public void printStudentDetails() {
		System.out.println("Student Details:");
		System.out.println("Student's " + address.toString());
	}
}