package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Status database table.
 * 
 */
@Entity
@NamedQuery(name="Status.findAll", query="SELECT s FROM Status s")
public class Status implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String code;

	//bi-directional many-to-one association to ItemStatus
	@OneToMany(mappedBy="status")
	private List<ItemStatus> itemStatuses;

	public Status() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<ItemStatus> getItemStatuses() {
		return this.itemStatuses;
	}

	public void setItemStatuses(List<ItemStatus> itemStatuses) {
		this.itemStatuses = itemStatuses;
	}

	public ItemStatus addItemStatus(ItemStatus itemStatus) {
		getItemStatuses().add(itemStatus);
		itemStatus.setStatus(this);

		return itemStatus;
	}

	public ItemStatus removeItemStatus(ItemStatus itemStatus) {
		getItemStatuses().remove(itemStatus);
		itemStatus.setStatus(null);

		return itemStatus;
	}

}