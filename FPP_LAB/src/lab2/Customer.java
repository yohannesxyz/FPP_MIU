package lab2;

public class Customer {
private String firstName;
private String lastName;
private String socSecurityNum;
private Address billingAddress;
private Address shippingAddress;

public Customer(String firstName,String lastName, String socSecurityName) {
	this.firstName = firstName;
	this.lastName = lastName;
	this.socSecurityNum= socSecurityNum;
}

	void setFirstName(String fName) {
		this.firstName=fName;
	}
	String getFirstName() {
		return firstName;
	}
	
	void setbillingAddress(Address address) {
		this.billingAddress=address;
	}
	Address getbillingAddress() {
		return billingAddress;
	}
	
	public String toString() {
		return firstName+" "+lastName;
	}
}
