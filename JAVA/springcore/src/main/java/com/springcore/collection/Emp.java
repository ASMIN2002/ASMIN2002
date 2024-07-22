package com.springcore.collection;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Emp {
	private String ename;
	private List<String> phn;
	private Set<String> addr;
	private Map<String , String> courses;
	
	
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public List<String> getPhn() {
		return phn;
	}
	public void setPhn(List<String> phn) {
		this.phn = phn;
	}
	public Set<String> getAddr() {
		return addr;
	}
	public void setAddr(Set<String> addr) {
		this.addr = addr;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	
	
	public Emp(String ename, List<String> phn, Set<String> addr, Map<String, String> courses) {
		super();
		this.ename = ename;
		this.phn = phn;
		this.addr = addr;
		this.courses = courses;
	}
	public Emp() {
		super();
		
	}
	
	
	
}
