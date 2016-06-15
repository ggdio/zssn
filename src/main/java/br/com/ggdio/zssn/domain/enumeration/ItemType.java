package br.com.ggdio.zssn.domain.enumeration;

/**
 * Item Type Domain Object
 * @author Dio
 *
 */
public enum ItemType {

	WATER(4),
	FOOD(3),
	MEDICATION(2),
	AMMUNITION(1)
	;
	
	private final int points;
	ItemType(int points) {
		this.points = points;
	}
	
	public int getPoints() {
		return points;
	}
	
}