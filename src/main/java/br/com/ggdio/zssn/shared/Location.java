package br.com.ggdio.zssn.shared;

/**
 * Component that provides localization data
 * @author Dio
 *
 */
public abstract class Location {

	protected Double latitude;
	protected Double longitude;
	
	protected abstract Double getLatitude();
	protected abstract Double getLongitude();
	
	protected abstract void setLatitude(Double latitude);
	protected abstract void setLongitude(Double longitude);
	
}