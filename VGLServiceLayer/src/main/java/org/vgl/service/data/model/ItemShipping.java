package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ItemShipping database table.
 * 
 */
@Entity
@NamedQuery(name="ItemShipping.findAll", query="SELECT i FROM ItemShipping i")
public class ItemShipping implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private Double shippingFee;

	//bi-directional many-to-one association to Item
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="itemId")
	private Item item;

	//bi-directional many-to-one association to ShippingType
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="shippingTypeId")
	private ShippingType shippingType;

	public ItemShipping() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Double getShippingFee() {
		return this.shippingFee;
	}

	public void setShippingFee(Double shippingFee) {
		this.shippingFee = shippingFee;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public ShippingType getShippingType() {
		return this.shippingType;
	}

	public void setShippingType(ShippingType shippingType) {
		this.shippingType = shippingType;
	}

}