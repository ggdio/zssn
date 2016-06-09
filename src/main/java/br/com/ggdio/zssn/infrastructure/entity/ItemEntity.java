package br.com.ggdio.zssn.infrastructure.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.ggdio.zssn.shared.inventory.Item;
import br.com.ggdio.zssn.shared.inventory.ItemDecorator;

/**
 * Item Entity Mapping for Persistence Layer
 * @author Dio
 *
 */
@Entity
@Table(name="ITEM", uniqueConstraints=
	@UniqueConstraint(columnNames={"type", "id_person"}
))
public class ItemEntity extends ItemDecorator {

	public ItemEntity(Item inner) {
		super(inner);
	}
	
	@Override
	@Column(name="ID_ITEM")
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long getId() {
		return super.getId();
	}
	
	@Column(name="DO_TYPE", length=1, nullable=false)
	private Character getItemType() {
		return super.getType().getKey().charAt(0);
	}
	
	@Override
	@Column(name="NR_QUANTITY")
	public int getQuantity() {
		return super.getQuantity();
	}

}
