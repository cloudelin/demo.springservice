package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the Behavior database table.
 * 
 */
@Entity
@NamedQuery(name="Behavior.findAll", query="SELECT b FROM Behavior b")
public class Behavior implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	private String data;

	private String gpsCoordinate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date timestamp;

	private String type;

	//bi-directional many-to-one association to User
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="userId")
	private User user;

	public Behavior() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getData() {
		return this.data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getGpsCoordinate() {
		return this.gpsCoordinate;
	}

	public void setGpsCoordinate(String gpsCoordinate) {
		this.gpsCoordinate = gpsCoordinate;
	}

	public Date getTimestamp() {
		return this.timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}