package com.simplilearn.demo;

public class OS {
	private long OSID;
	private String name;
	
	private OS() {
		
	}

	public OS(String name) {
		OSID = 0;
		this.name = name;
	}

	public long getOSID() {
		return OSID;
	}

	public void setOSID(long OSID) {
		OSID = OSID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	

}
