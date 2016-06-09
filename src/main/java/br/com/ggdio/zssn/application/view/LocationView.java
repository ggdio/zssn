package br.com.ggdio.zssn.application.view;

import com.fasterxml.jackson.annotation.JsonCreator;

public class LocationView {
	
	private final Double latitude;
	private final Double longitude;

	@JsonCreator
	public LocationView(Double latitude, Double longitude) {
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