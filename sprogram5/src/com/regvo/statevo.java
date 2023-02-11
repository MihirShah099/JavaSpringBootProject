package com.regvo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.regvo.countryvo;
@Entity
@Table(name = "stat_table")
public class statevo {
	@Id
	@Column(name="Id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="sname")
	private String sname;
	
	@ManyToOne countryvo cid;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public countryvo getCid() {
		return cid;
	}
	public void setCid(countryvo cid) {
		this.cid = cid;
	}
	
}
