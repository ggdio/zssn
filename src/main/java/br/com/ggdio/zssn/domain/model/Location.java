package br.com.ggdio.zssn.domain.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Location {

	@Column(nullable = false)
	private final Double latitude;

	@Column(nullable = false)
	private final Double longitude;

	public Location(Double latitude, Double longitude) {
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