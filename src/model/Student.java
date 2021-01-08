package model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	private int id;
	private String name;
	private String emailid;
	private String password;
	
	
	public final int getId() {
		return id;
	}
	public final void setId(int id) {
		this.id = id;
	}
	public final String getName() {
		return name;
	}
	public final void setName(String name) {
		this.name = name;
	}
	public final String getEmailid() {
		return emailid;
	}
	public final void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	public final String getPassword() {
		return password;
	}
	public final void setPassword(String password) {
		this.password = password;
	}  
	
	public Student(String name, String emailid, String password) {
		super();
		this.name = name;
		this.emailid = emailid;
		this.password = password;
	}
	
	public Student ()
	{}
	
}
