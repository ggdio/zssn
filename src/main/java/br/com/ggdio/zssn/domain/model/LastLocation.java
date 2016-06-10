package br.com.ggdio.zssn.domain.model;

import br.com.ggdio.zssn.shared.Location;
import br.com.ggdio.zssn.shared.LocationDecorator;

public class LastLocation extends LocationDecorator {

	public LastLocation(Location location) {
		super(location);
	}
	
	@Override
	public Double getLatitude() {
		return super.getLatitude();
	}
	
	@Override
	public Double getLongitude() {
		return super.getLongitude();
	}

}
