
public class Address {
	private String street = "";
	private String suite = "";
	private String city = "";
	private String zipcode = "";
	private Geo geo = new Geo();
	/**
	 * @return the street
	 */
	
	public Address(){
		street = "";
		suite = "";
		city = "";
		zipcode = "";
	}
	public Address(String _street, String _suite, String _city, String _zipcode, Geo _geo){
		street = _street;
		suite = _suite;
		city = _city;
		zipcode = _zipcode;
		geo = _geo;
	}	
	
	
	
	public String getStreet() {
		return street;
	}
	/**
	 * @param street the street to set
	 */
	public void setStreet(String street) {
		this.street = street;
	}
	/**
	 * @return the suite
	 */
	public String getSuite() {
		return suite;
	}
	/**
	 * @param suite the suite to set
	 */
	public void setSuite(String suite) {
		this.suite = suite;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the zipcode
	 */
	public String getZipcode() {
		return zipcode;
	}
	/**
	 * @param zipcode the zipcode to set
	 */
	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}
	/**
	 * @return the geo
	 */
	public Geo getGeo() {
		return geo;
	}
	/**
	 * @param geo the geo to set
	 */
	public void setGeo(Geo _geo) {
		geo = _geo;
	}
	
	
}
