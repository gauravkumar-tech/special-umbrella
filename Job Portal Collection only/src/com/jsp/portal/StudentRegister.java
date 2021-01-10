package com.jsp.portal;

public class StudentRegister {
	
	String name;
	int id;
	Long phone;
	int percentage;
	
	StudentRegister(String name, int id, Long phone, int percentage){
		this.name=name;
		this.id=id;
		this.phone=phone;
		this.percentage=percentage;
	}
	
	public int hashCode(){
		return id;
	}
	
	public boolean equals(Object obj){
		return this.hashCode()==obj.hashCode();
	}
	

}
