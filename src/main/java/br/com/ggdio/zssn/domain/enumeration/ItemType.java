package br.com.ggdio.zssn.domain.enumeration;

import br.com.ggdio.zssn.shared.UniqueKey;

/**
 * Item Type Domain Object
 * @author Dio
 *
 */
public enum ItemType implements UniqueKey {

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
	
	@Override
	public String getKey() {
		return toString();
	}
	
}