package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the ShippingType database table.
 * 
 */
@Entity
@NamedQuery(name="ShippingType.findAll", query="SELECT s FROM ShippingType s")
public class ShippingType implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String type;

	//bi-directional many-to-one association to ItemShipping
	@OneToMany(mappedBy="shippingType")
	private List<ItemShipping> itemShippings;

	public ShippingType() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ItemShipping> getItemShippings() {
		return this.itemShippings;
	}

	public void setItemShippings(List<ItemShipping> itemShippings) {
		this.itemShippings = itemShippings;
	}

	public ItemShipping addItemShipping(ItemShipping itemShipping) {
		getItemShippings().add(itemShipping);
		itemShipping.setShippingType(this);

		return itemShipping;
	}

	public ItemShipping removeItemShipping(ItemShipping itemShipping) {
		getItemShippings().remove(itemShipping);
		itemShipping.setShippingType(null);

		return itemShipping;
	}

}