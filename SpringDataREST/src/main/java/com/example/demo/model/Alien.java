package com.example.demo.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alien {
	@Id
	@GeneratedValue
	private int eid;
	private String ename;
	private String ecar;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	
	public String getEcar() {
		return ecar;
	}
	public void setEcar(String ecar) {
		this.ecar = ecar;
	}
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	@Override
	public String toString() {
		return "Alien [eid=" + eid + ", ename=" + ename + ", ecar=" + ecar + "]";
	}
	
	
	

}
