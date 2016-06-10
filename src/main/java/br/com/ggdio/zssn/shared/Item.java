package br.com.ggdio.zssn.shared;

import br.com.ggdio.zssn.domain.enumeration.ItemType;

/**
 * Inventory Item
 * An item have a quantity of a determined resource type
 * @author Dio
 *
 */
public abstract class Item {
	
	protected Long id;
	protected ItemType type;
	protected int quantity;
	
	public abstract Long getId();
	public abstract UniqueKey getType();
	public abstract int getQuantity();
	
	protected abstract void setId(Long id);
	protected abstract void setType(UniqueKey type);
	protected abstract void setQuantity(int quantity);
	
}