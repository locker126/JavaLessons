
public class Company {
	private String name = "";
	private String catchPhrase = "";
	private String bs = "";
	
	public Company(){
		this.setName("");
		this.setCatchPhrase("");
		this.setBs("");
	}
	public Company(String _name, String _catchPhrase, String _bs){
		this.setName(_name);
		this.setCatchPhrase(_catchPhrase);
		this.setBs(_bs);
	}
	
	/**
	 * @return the catchPhrase
	 */
	public String getCatchPhrase() {
		return catchPhrase;
	}
	/**
	 * @param catchPhrase the catchPhrase to set
	 */
	public void setCatchPhrase(String catchPhrase) {
		this.catchPhrase = catchPhrase;
	}
	/**
	 * @return the bs
	 */
	public String getBs() {
		return bs;
	}
	/**
	 * @param bs the bs to set
	 */
	public void setBs(String bs) {
		this.bs = bs;
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
	
}
