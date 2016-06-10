package br.com.ggdio.zssn.infrastructure.data;

import br.com.ggdio.zssn.shared.Location;

public class LocationData extends Location {
	
	public LocationData() {
		// TODO Auto-generated constructor stub
	}
	
	public LocationData(Double latitude, Double longitude) {
		super();
		this.latitude = latitude;
		this.longitude = longitude;
	}

	@Override
	protected Double getLatitude() {
		return getLatitude();
	}

	@Override
	protected Double getLongitude() {
		return getLongitude();
	}

	@Override
	protected void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	@Override
	protected void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	
}