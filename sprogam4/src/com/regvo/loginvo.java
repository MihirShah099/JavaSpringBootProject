package com.regvo;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="login_tab")
public class loginvo {
@Id
@Column(name="Id")
@GeneratedValue(strategy=GenerationType.AUTO)
private int id;
@Column(name="uname")
private String uname;
@Column(name="pass")
private String pass;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	
	this.uname = uname;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}
