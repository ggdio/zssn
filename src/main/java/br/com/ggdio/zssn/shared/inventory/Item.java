package br.com.ggdio.zssn.shared.inventory;

import br.com.ggdio.zssn.domain.enumeration.ItemType;
import br.com.ggdio.zssn.shared.UniqueKey;

/**
 * Inventory Item
 * An item have a quantity of a determined resource type
 * @author Dio
 *
 */
@SuppressWarnings("unused")
public abstract class Item {
	
	private Long id;
	private ItemType type;
	private int quantity;
	
	public abstract Long getId();
	public abstract UniqueKey getType();
	public abstract int getQuantity();
	
	protected abstract void setId(Long id);
	protected abstract void setType(UniqueKey type);
	protected abstract void setQuantity(int quantity);
	
}