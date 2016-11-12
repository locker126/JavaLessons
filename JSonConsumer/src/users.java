
public class users {
	private String id = "";
	private String name = "";
	private String username = "";
	private String email = "";
	private Address address = new Address();
	private String phone = "";
	private String website = "";
	private Company company = new Company();
	
	public users(){
		this.setId("");
		this.setName("");
		this.setUsername("");
		this.setEmail("");
		this.setAddress(new Address());
		this.setPhone("");
		this.setWebsite("");
		this.setCompany(new Company());
	}
public users(String _id, String _name, String _username, String _email, Address _address, String _phone, String _website, Company _company){
	this.setId(_id);
	this.setName(_name);
	this.setUsername(_username);
	this.setEmail(_email);
	this.setAddress(_address);
	this.setPhone(_phone);
	this.setWebsite(_website);
	this.setCompany(_company);
		
	}
/**
 * @return the id
 */
public String getId() {
	return id;
}
/**
 * @param id the id to set
 */
public void setId(String id) {
	this.id = id;
}
/**
 * @return the name
 */
public String getName() {
	return name;
}
/**
 * @param name the name to set
 */
public void setName(String name) {
	this.name = name;
}
/**
 * @return the username
 */
public String getUsername() {
	return username;
}
/**
 * @param username the username to set
 */
public void setUsername(String username) {
	this.username = username;
}
/**
 * @return the email
 */
public String getEmail() {
	return email;
}
/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}
/**
 * @return the address
 */
public Address getAddress() {
	return address;
}
/**
 * @param address the address to set
 */
public void setAddress(Address address) {
	this.address = address;
}
/**
 * @return the phone
 */
public String getPhone() {
	return phone;
}
/**
 * @param phone the phone to set
 */
public void setPhone(String phone) {
	this.phone = phone;
}
/**
 * @return the website
 */
public String getWebsite() {
	return website;
}
/**
 * @param website the website to set
 */
public void setWebsite(String website) {
	this.website = website;
}
/**
 * @return the company
 */
public Company getCompany() {
	return company;
}
/**
 * @param company the company to set
 */
public void setCompany(Company company) {
	this.company = company;
}
	
	
}
