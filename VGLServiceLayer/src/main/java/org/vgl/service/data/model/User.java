package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String address;

	private String addressCoordinate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date birthday;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createTime;

	private String email;

	private String firstName;

	private String gender;

	private Boolean invalid;

	private String lastName;

	private String localization;

	private String nickname;

	private String password;

	private String type;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateTime;

	//bi-directional many-to-one association to Behavior
	@OneToMany(mappedBy="user")
	private List<Behavior> behaviors;

	//bi-directional many-to-one association to Item
	@OneToMany(mappedBy="user")
	private List<Item> items;

	//bi-directional many-to-one association to ItemStatus
	@OneToMany(mappedBy="user")
	private List<ItemStatus> itemStatuses;

	//bi-directional many-to-one association to TraceItem
	@OneToMany(mappedBy="user")
	private List<TraceItem> traceItems;

	//bi-directional many-to-one association to Region
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="regionId")
	private Region region;

	public User() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getAddressCoordinate() {
		return this.addressCoordinate;
	}

	public void setAddressCoordinate(String addressCoordinate) {
		this.addressCoordinate = addressCoordinate;
	}

	public Date getBirthday() {
		return this.birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Boolean getInvalid() {
		return this.invalid;
	}

	public void setInvalid(Boolean invalid) {
		this.invalid = invalid;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLocalization() {
		return this.localization;
	}

	public void setLocalization(String localization) {
		this.localization = localization;
	}

	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Date getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<Behavior> getBehaviors() {
		return this.behaviors;
	}

	public void setBehaviors(List<Behavior> behaviors) {
		this.behaviors = behaviors;
	}

	public Behavior addBehavior(Behavior behavior) {
		getBehaviors().add(behavior);
		behavior.setUser(this);

		return behavior;
	}

	public Behavior removeBehavior(Behavior behavior) {
		getBehaviors().remove(behavior);
		behavior.setUser(null);

		return behavior;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Item addItem(Item item) {
		getItems().add(item);
		item.setUser(this);

		return item;
	}

	public Item removeItem(Item item) {
		getItems().remove(item);
		item.setUser(null);

		return item;
	}

	public List<ItemStatus> getItemStatuses() {
		return this.itemStatuses;
	}

	public void setItemStatuses(List<ItemStatus> itemStatuses) {
		this.itemStatuses = itemStatuses;
	}

	public ItemStatus addItemStatus(ItemStatus itemStatus) {
		getItemStatuses().add(itemStatus);
		itemStatus.setUser(this);

		return itemStatus;
	}

	public ItemStatus removeItemStatus(ItemStatus itemStatus) {
		getItemStatuses().remove(itemStatus);
		itemStatus.setUser(null);

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
		traceItem.setUser(this);

		return traceItem;
	}

	public TraceItem removeTraceItem(TraceItem traceItem) {
		getTraceItems().remove(traceItem);
		traceItem.setUser(null);

		return traceItem;
	}

	public Region getRegion() {
		return this.region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

}