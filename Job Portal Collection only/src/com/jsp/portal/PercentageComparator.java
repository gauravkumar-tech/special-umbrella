package com.jsp.portal;

import java.util.Comparator;

public class PercentageComparator implements Comparator<StudentRegister> {

	@Override
	public int compare(StudentRegister o1, StudentRegister o2) {
	
			return (o1.percentage-o2.percentage);
	
	
	}

	

}
