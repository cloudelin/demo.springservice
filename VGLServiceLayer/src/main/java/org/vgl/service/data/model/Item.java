package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the Item database table.
 * 
 */
@Entity
@NamedQuery(name="Item.findAll", query="SELECT i FROM Item i")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String country;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	@Lob
	private String description;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dueTime;

	private String guid;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastAvaliableTime;

	private Double priceRate;

	private String priceUnit;

	private Double reqBefore;

	private String reqBeforeUnit;

	private String title;

	//bi-directional many-to-one association to Category
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categoryId")
	private Category category;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="owner")
	private User user;

	//bi-directional many-to-one association to ItemPic
	@OneToMany(mappedBy="item")
	private List<ItemPic> itemPics;

	//bi-directional many-to-one association to ItemShipping
	@OneToMany(mappedBy="item")
	private List<ItemShipping> itemShippings;

	//bi-directional many-to-one association to ItemStatus
	@OneToMany(mappedBy="item")
	private List<ItemStatus> itemStatuses;

	//bi-directional many-to-one association to TraceItem
	@OneToMany(mappedBy="item")
	private List<TraceItem> traceItems;

	public Item() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCountry() {
		return this.country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDueTime() {
		return this.dueTime;
	}

	public void setDueTime(Date dueTime) {
		this.dueTime = dueTime;
	}

	public String getGuid() {
		return this.guid;
	}

	public void setGuid(String guid) {
		this.guid = guid;
	}

	public Date getLastAvaliableTime() {
		return this.lastAvaliableTime;
	}

	public void setLastAvaliableTime(Date lastAvaliableTime) {
		this.lastAvaliableTime = lastAvaliableTime;
	}

	public Double getPriceRate() {
		return this.priceRate;
	}

	public void setPriceRate(Double priceRate) {
		this.priceRate = priceRate;
	}

	public String getPriceUnit() {
		return this.priceUnit;
	}

	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	public Double getReqBefore() {
		return this.reqBefore;
	}

	public void setReqBefore(Double reqBefore) {
		this.reqBefore = reqBefore;
	}

	public String getReqBeforeUnit() {
		return this.reqBeforeUnit;
	}

	public void setReqBeforeUnit(String reqBeforeUnit) {
		this.reqBeforeUnit = reqBeforeUnit;
	}

	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<ItemPic> getItemPics() {
		return this.itemPics;
	}

	public void setItemPics(List<ItemPic> itemPics) {
		this.itemPics = itemPics;
	}

	public ItemPic addItemPic(ItemPic itemPic) {
		getItemPics().add(itemPic);
		itemPic.setItem(this);

		return itemPic;
	}

	public ItemPic removeItemPic(ItemPic itemPic) {
		getItemPics().remove(itemPic);
		itemPic.setItem(null);

		return itemPic;
	}

	public List<ItemShipping> getItemShippings() {
		return this.itemShippings;
	}

	public void setItemShippings(List<ItemShipping> itemShippings) {
		this.itemShippings = itemShippings;
	}

	public ItemShipping addItemShipping(ItemShipping itemShipping) {
		getItemShippings().add(itemShipping);
		itemShipping.setItem(this);

		return itemShipping;
	}

	public ItemShipping removeItemShipping(ItemShipping itemShipping) {
		getItemShippings().remove(itemShipping);
		itemShipping.setItem(null);

		return itemShipping;
	}

	public List<ItemStatus> getItemStatuses() {
		return this.itemStatuses;
	}

	public void setItemStatuses(List<ItemStatus> itemStatuses) {
		this.itemStatuses = itemStatuses;
	}

	public ItemStatus addItemStatus(ItemStatus itemStatus) {
		getItemStatuses().add(itemStatus);
		itemStatus.setItem(this);

		return itemStatus;
	}

	public ItemStatus removeItemStatus(ItemStatus itemStatus) {
		getItemStatuses().remove(itemStatus);
		itemStatus.setItem(null);

		return itemStatus;
	}

	public List<TraceItem> getTraceItems() {
		return this.traceItems;
	}

	public void setTraceItems(List<TraceItem> traceItems) {
		this.traceItems = traceItems;
	}

	public TraceItem addTraceItem(TraceItem traceItem) {
		getTraceItems().add(traceItem);
		traceItem.setItem(this);

		return traceItem;
	}

	public TraceItem removeTraceItem(TraceItem traceItem) {
		getTraceItems().remove(traceItem);
		traceItem.setItem(null);

		return traceItem;
	}

}