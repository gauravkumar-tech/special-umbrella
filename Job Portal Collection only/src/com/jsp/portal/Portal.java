package com.jsp.portal;
import java.util.*;

public class Portal {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("welcome to the Student Registration");
	System.out.println("Enter the name of the student");
	String name=sc.nextLine();
	System.out.println("Enter your mobile number");
	Long phone=sc.nextLong();
	System.out.println("Enter the id");
	int id=sc.nextInt();
	System.out.println("Enter degree percentage without '%' symbol");
	int degree=sc.nextInt();
	
	HashSet<StudentRegister> al=new HashSet<StudentRegister>();
	
	boolean b1=al.add(new StudentRegister(name,id,phone,degree));
	if(b1){
		System.out.println("register succesfully");
		
	}else{
		System.out.println("Already added, cannot be added");
	}
	
	System.out.println("welcome to the Student Registration");
	System.out.println("Enter the name of the student");
	sc.nextLine();
	String name1=sc.nextLine();
	System.out.println("Enter your mobile number");
	Long phone1=sc.nextLong();
	System.out.println("Enter the id");
	int id1=sc.nextInt();
	System.out.println("Enter degree percentage without '%' symbol");
	int degree1=sc.nextInt();

	boolean b=al.add(new StudentRegister(name1,id1,phone1,degree1));
	if(b){
		System.out.println("register succesfully");
		
	}else{
		System.out.println("Already added, cannot be added");
	}
	
	/*Iterator<StudentRegister> it=al.iterator();
	while(it.hasNext()){
		System.out.println("name of the candidate is: "+it.next().name +" has registered succesfully");
		System.out.println("name of the candidate is: "+it.next().degree +" has registered succesfully");
		
		
	}*/

	System.out.println("This company has register, recuirement is 60% only");
	System.out.println("selected candidates list are");
	for (StudentRegister st : al) {
		CompanyCriteria cc=new CompanyCriteria(st.name,st.id,st.phone,st.percentage);
			cc.selectedcandidate();
	}


	
	
		
	
	/*
 	if(b){
		CompanyCriteria c1=new CompanyCriteria(name1,degree1);
		c1.selectedcandidate();
	}
	*/
	
		
		
	}

}
