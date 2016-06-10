package br.com.ggdio.zssn.shared;

public abstract class ItemDecorator extends Item {
	
	private final Item inner;
	
	protected ItemDecorator(Item item) {
		this.inner = item;
	}

	@Override
	public Long getId() {
		return inner.getId();
	}

	@Override
	public UniqueKey getType() {
		return inner.getType();
	}

	@Override
	public int getQuantity() {
		return inner.getQuantity();
	}
	
	@Override
	protected void setId(Long id) {
		inner.setId(id);
	}

	@Override
	protected void setType(UniqueKey type) {
		inner.setType(type);
	}

	@Override
	protected void setQuantity(int quantity) {
		inner.setQuantity(quantity);
	}

}