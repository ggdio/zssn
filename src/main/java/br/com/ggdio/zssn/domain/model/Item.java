package br.com.ggdio.zssn.domain.model;

import br.com.ggdio.zssn.domain.enumeration.ItemType;

/**
 * Inventory Item
 * An item have a quantity of a determined resource type
 * @author Dio
 *
 */
public abstract class Item {
	
	private Long id;
	private ItemType type;
	private int quantity;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public ItemType getType() {
		return type;
	}
	
	public int getQuantity() {
		return quantity;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setType(ItemType type) {
		this.type = type;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}