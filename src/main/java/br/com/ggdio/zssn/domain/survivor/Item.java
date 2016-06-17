package br.com.ggdio.zssn.domain.survivor;

import br.com.ggdio.zssn.domain.enumeration.ItemType;

/**
 * Inventory Item
 * An item have a quantity of a determined resource type
 * @author Dio
 *
 */
public class Item {
	
	private Long id;
	private ItemType type;
	private int quantity;
	
	protected Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Item(ItemType type, int qtt) {
		this.type = type;
		this.quantity = qtt;
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