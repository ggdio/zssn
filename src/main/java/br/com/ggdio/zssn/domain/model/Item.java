package br.com.ggdio.zssn.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import br.com.ggdio.zssn.domain.enumeration.ItemType;

@Entity
@Table(uniqueConstraints=
	@UniqueConstraint(columnNames={"type", "person_id"}
))
public class Item {

	@Id @GeneratedValue
	private Long id;
	
	@Enumerated @Column(nullable=false)
	private ItemType type;
	
	private Integer quantity;
	
	public Item() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	
	public ItemType getType() {
		return type;
	}
	
	public Integer getQuantity() {
		return quantity;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public void setType(ItemType type) {
		this.type = type;
	}
	
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Item other = (Item) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (type != other.type)
			return false;
		return true;
	}
	
}