package br.com.ggdio.zssn.infrastructure.data;

import br.com.ggdio.zssn.domain.enumeration.ItemType;
import br.com.ggdio.zssn.shared.Item;
import br.com.ggdio.zssn.shared.UniqueKey;

public class ItemData extends Item {
	
	public ItemData() {
		// TODO Auto-generated constructor stub
	}
	
	public ItemData(Long id, ItemType type, int quantity) {
		super();
		this.id = id;
		this.type = type;
		this.quantity = quantity;
	}

	@Override
	public Long getId() {
		return this.getId();
	}

	@Override
	public UniqueKey getType() {
		return this.getType();
	}

	@Override
	public int getQuantity() {
		return this.getQuantity();
	}
	
	@Override
	protected void setId(Long id) {
		this.setId(id);
	}

	@Override
	protected void setType(UniqueKey type) {
		this.setType(type);
	}

	@Override
	protected void setQuantity(int quantity) {
		this.setQuantity(quantity);
	}

}