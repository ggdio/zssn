package br.com.ggdio.zssn.shared.position;

/**
 * Component that provides localization data
 * @author Dio
 *
 */
@SuppressWarnings("unused")
public abstract class Location {

	private Double latitude;
	private Double longitude;
	
	protected abstract Double getLatitude();
	protected abstract Double getLongitude();
	
	protected abstract void setLatitude(Double latitude);
	protected abstract void setLongitude(Double longitude);
	
}