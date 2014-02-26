package org.vgl.service.data.trans;

import java.util.Date;

/**
 * 
 * @author Cloude
 *
 */
public class UserDTO {

	private Long id;

	private String address;

	private String addressCoordinate;

	private Date birthday;

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

	private Date updateTime;

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
}
