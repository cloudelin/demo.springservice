package org.vgl.service.data.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the ItemPic database table.
 * 
 */
@Entity
@NamedQuery(name="ItemPic.findAll", query="SELECT i FROM ItemPic i")
public class ItemPic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;

	@Lob
	private String pic1;

	@Lob
	private String pic2;

	@Lob
	private String pic3;

	@Lob
	private String pic4;

	//bi-directional many-to-one association to Item
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="itemId")
	private Item item;

	public ItemPic() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPic1() {
		return this.pic1;
	}

	public void setPic1(String pic1) {
		this.pic1 = pic1;
	}

	public String getPic2() {
		return this.pic2;
	}

	public void setPic2(String pic2) {
		this.pic2 = pic2;
	}

	public String getPic3() {
		return this.pic3;
	}

	public void setPic3(String pic3) {
		this.pic3 = pic3;
	}

	public String getPic4() {
		return this.pic4;
	}

	public void setPic4(String pic4) {
		this.pic4 = pic4;
	}

	public Item getItem() {
		return this.item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

}