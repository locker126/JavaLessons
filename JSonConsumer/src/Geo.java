
public class Geo {
	private String lat = "";
	private String lng = "";
	public Geo(){
		setLat("");
		setIng("");
	}
	public Geo(String _lat, String _ing){
		setLat(_lat);
		setIng(_ing);
	}
	/**
	 * @return the lat
	 */
	public String getLat() {
		return lat;
	}
	/**
	 * @param lat the lat to set
	 */
	public void setLat(String lat) {
		this.lat = lat;
	}
	/**
	 * @return the ing
	 */
	public String getIng() {
		return lng;
	}
	/**
	 * @param ing the ing to set
	 */
	public void setIng(String ing) {
		lng = ing;
	}
}
