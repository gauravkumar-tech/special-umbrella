package com.jsp.portal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class CompanyCriteria {
	String name;
	int percentage;
	int id;
	long phone;
	
	CompanyCriteria(String name,int id, long phone, int percentage){
		this.name=name;
		this.phone=phone;
		this.id=id;
		this.percentage=percentage;
	}
	void selectedcandidate(){

		/*ArrayList<StudentRegister> al=new ArrayList<StudentRegister>();	
		*/
		TreeSet<StudentRegister> al=new TreeSet<StudentRegister>(new PercentageComparator());
		if(percentage>=60){		
			al.add (new StudentRegister(name, id, phone, percentage));	
		}
		
		/*
		doubt// send a collection to the constructor of the new class?
		or Send the object arr and convert it back to the collection?
		//or how to print specifice fields of the object without making it generic.
	*//*
		Collections.sort(al, new PercentageComparator());*/
		for (StudentRegister st : al) {
			System.out.println("Selected students are: "+name +" id: "+id+ " phone:"+phone+" percentage: "+percentage);
		}
	
	
	
	}

}
