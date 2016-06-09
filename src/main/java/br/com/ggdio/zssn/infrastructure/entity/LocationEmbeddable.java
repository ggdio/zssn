package br.com.ggdio.zssn.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.com.ggdio.zssn.shared.position.Location;
import br.com.ggdio.zssn.shared.position.LocationDecorator;

@Embeddable
public class LocationEmbeddable extends LocationDecorator {

	public LocationEmbeddable(Location location) {
		super(location);
	}
	
	@Column(name="VL_LATITUDE", nullable = false)
	protected Double getLatitude() {
		// TODO Auto-generated method stub
		return super.getLatitude();
	}
	
	@Column(name="VL_LONGITUDE", nullable = false)
	protected Double getLongitude() {
		// TODO Auto-generated method stub
		return super.getLongitude();
	}

}