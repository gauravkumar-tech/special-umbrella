package com.jsp.mcq;

import java.util.*;

public class Project {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList c= new ArrayList();
		
		c.add("Q1. A sum of money at simple interest amounts to Rs. 815 in 3 years and to Rs. 854 in 4 years. The sum is:\n1. Rs. 650\n2. Rs. 690\n3. Rs. 698\n4. Rs. 700\n5. Skip");
		c.add("Q2. Mr. Thomas invested an amount of Rs. 13,900 divided in two different schemes A and B at the simple interest rate of 14% p.a. and 11% p.a. respectively. If the total amount of simple interest earned in 2 years be Rs. 3508, what was the amount invested in Scheme B?\n1. Rs. 6400\n2. Rs. 6500\n3. Rs. 7200\n4.Rs. 75005.\n5. Skip");
		c.add("Q3. A+B equals to\n1. C\n2. A\n3. Question is wrong\n4. B\n5. Skip");
		c.add("Q4. 1+1=?\n1. 3\n2. 5\n3. 2\n4. 6\n5. Skip");
		c.add("Q5. square of 4=?\n1. 12\n2. 15\n3. 16\n4. 20\n5. Skip");
		c.add("Q6. select an Animal=?\n1. chair\n2. table\n3. cat\n4. cap\n5. Skip");
		c.add("Q7. cube root of 5=?\n1. 100\n2. 50\n3. 125\n4. 80\n5. Skip");
		c.add("Q8. Factorial of 5=?\n1. 50\n2. 100\n3. 120\n4. 80\n5. Skip");
		c.add("Q9. Why do we use Scanner class=?\n1. for print output\n2. for show the result\n3. to get input from keyboard\n4. to check the condition \n5. Skip");
		c.add("Q10. what is the System.out.println means?\n1. To get the value\n2. To move the cursor to the next line\n3. Print output and move the cursor to next line\n4. To initialize non-static method\n5. Skip");
		c.add("Q11. What is the palindrome number?\n1. 1=12\n2. 12=1\n3. 121=121\n4. 153=1*1*1+5*5*5+3*3*3\n5. Skip");
		c.add("Q12. What is Collections? \n1.It is an interface.\n2. It is an framework\n3. It is the utility class.\n4. None of above\n5. Skip");
		c.add("Q13. What is not the Access Modifier of Constructor\n1. Private\n2. Final\n3. static \n4.Public\n5. Skip");
		c.add("Q14. What is the type of collection(I)? \n1. TreeMap(I)\n2. SetMap(I),\n3. Set(I),List(I),Queue(I)\n4. ArrayList(I)\n5. Skip");
		c.add("Q15. why we need instanceof operator? \n1. It works same as airthemetic operator\n2. It is a Not a operator\n3. This is Use to Remove Class Cast Error.\n4. Is is atype of relational operator\n5. Skip");
		c.add("Q16. Why we use the Static Block? \n1. It is a member of class. \n2. In does not work as constructor.\n3. It is used to initialize the Static Data memmber.\n4. It is use to take the input and store in the database.\n5. Skip");
		c.add("Q17. Why do we need Try and Catch Block? \n1. It is use to initialize the members.\n2. It is use to iterate in collection.\n3. It is use to catch the exception.\n4. It is use fetch the data from database\n5. Skip");
		c.add("Q18. Which is not a method of the Collection? \n1. contains(); \n2. containsAll();\n3. Remove();\n4. retainsall();\n5. Skip");
		c.add("Q19. Which is not a method of the object class? \n1. ToString();\n2. hashCode();\n3. Remove();\n4. equals();\n5. Skip");
		c.add("Q20. Which is the Class Cast Exception?\n1. Widening DTC\n2. Narrowing DTC\n3. Casting Downcast without doing upcasting\n4. String s=(String) b;\n5. Skip");
		
		Object[]arr=c.toArray();
		int[]ag= new int[20];
		ArrayList al=new ArrayList();
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			System.out.println( "\n Enter the input");
			int value=sc.nextInt();
			ag[i]=value;
			
		}
		/*for(int i=0; i<arr.length;i++){
			System.out.println(ag[i]);
		}*/
	
		ProjectInitialization pi=new ProjectInitialization(ag);
		//pi.print();
		
		float su=pi.sum;
		float total=20;
		float per=su/total;
		float fper=per*100;
		
	
		System.out.println("your result percentage is "+fper);
		System.out.println("Total correct questions: "+su);
		System.out.println("Total uncorrect Questions: "+pi.incorrect);
		System.out.println("Total Skipped Questions: "+pi.skip);
		
		if (su==20) {
			System.out.println("You are Excellent programmer");
			System.out.println("You are eligible for next round");
			
		}else if (su<=19&&su>=15) {
			System.out.println("You are Good programmer");
			System.out.println("You are eligible for the next round");
		}else if (su<15&&su>=9) {
			System.out.println("You are a Poor programmer");
			System.out.println("you are not eligible for the next round");
		
		}else if (su<=8&&su>=0) {
			System.out.println("You are a very poor programmer");
			System.out.println("you are not eligible for the next round");
		}

		
		
		
}

}