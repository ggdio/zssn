package br.com.ggdio.zssn.shared.position;

public class LocationDecorator extends Location {
	
	private final Location location;

	public LocationDecorator(Location location) {
		this.location = location;
	}

	@Override
	protected Double getLatitude() {
		return location.getLatitude();
	}

	@Override
	protected Double getLongitude() {
		return location.getLongitude();
	}

	@Override
	protected void setLatitude(Double latitude) {
		location.setLatitude(latitude);
	}

	@Override
	protected void setLongitude(Double longitude) {
		location.setLongitude(longitude);
	}

}