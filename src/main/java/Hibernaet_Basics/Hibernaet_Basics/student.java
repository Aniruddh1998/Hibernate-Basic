//This file is automatically generates the table in database.

package Hibernaet_Basics.Hibernaet_Basics;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class student {
	
	@Id		//@Id is a keyword. Used for primary key
	private int id;
	private String fname;
	private String lname;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	@Override
	public String toString() {
		return "student [id="+ id + ", fname=" + fname +",lname="+ lname +"]";
	}
	
}
