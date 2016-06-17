package br.com.ggdio.zssn.domain.survivor;

/**
 * Component that provides localization data
 * @author Dio
 *
 */
public class Location {

	private final double latitude;
	private final double longitude;
	
	@SuppressWarnings("unused")
	private Location() {
		this.latitude = 0;
		this.longitude = 0;
	}
	
	public Location(double latitude, double longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
	public Double getLatitude() {
		return latitude;
	}
	
	public Double getLongitude() {
		return longitude;
	}
	
}