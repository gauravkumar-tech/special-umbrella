package com.jsp.restaurant;
import java.util.*;


public class BigRestaurant {

	public static void main(String[] args) {
		System.out.println("Welcome to Big kakke da dhabba");
		Scanner sc=new Scanner(System.in);
		StringBuilder sb=new StringBuilder();
		String[]main_menu= new String [4];
	
		main_menu[0]="Chinese menu";
		main_menu[1]="North indian";
		main_menu[2]="South indian";
		main_menu[3]="Generate bill";
		
		String[]chinese= new String[4];
		
		chinese[0]="Haka noodles rs.100";
		chinese[1]="Momos rs. 20";
		chinese[2]="manchurian rs. 150";
		chinese[3]="Return to main menu";
		
		String[]North= new String[4];
		
		North[0]="Rajma Chawal rs.20";
		North[1]="sarso ka Saag rs.20";
		North[2]="Makki ki roti rs.5";
		North[3]="Return to main menu";
		
		String[]South= new String[4];
		
		South[0]="Dosa rs.60";
		South[1]="Rava rs.20";
		South[2]="Uttapamam rs.60";
		South[3]="Return to main menu";
		
		int Food_Type;
		int sum=0;
		do{
			for (int main = 0; main < main_menu.length; main++) {
				System.out.println("Press " +main+" for "+main_menu[main]);
			}
			System.out.println("Please Select the Type of Food");
			Food_Type=sc.nextInt();
			//chinese item menu
			//if start for food=chinese
			if(Food_Type==0){
				System.out.println("You have selected Chinese for Menu is: ");
				
				for (int chinese_menu = 0; chinese_menu < chinese.length; chinese_menu++) {
					System.out.println(" Press "+chinese_menu+" for "+chinese[chinese_menu]);
				}
				int Chinese_Item;
				int Chinese_item_Quantity=0;
				do{
					System.out.println("Please select the item from list for Order, Re-Order or To Return To main Menu");
					Chinese_Item=sc.nextInt();
					if(Chinese_Item!=3){
						System.out.println("Select the quantity:");
						 Chinese_item_Quantity=sc.nextInt();
					}
					if(Chinese_Item==0){
						sum+=100;
						sum=Chinese_item_Quantity*sum;
						sb.append(chinese[0]+" Quantity Selected: "+ Chinese_item_Quantity+"\n");
					}else if(Chinese_Item==1){
						sum+=20;
						sum=Chinese_item_Quantity*sum;
						sb.append(chinese[1]+" Quantity Selected: "+ Chinese_item_Quantity+"\n");
					}else if(Chinese_Item==2){
						sum+=150;
						sum=Chinese_item_Quantity*sum;
						sb.append(chinese[2]+" Quantity Selected: "+ Chinese_item_Quantity+"\n");
					}else if(Chinese_Item==3){
						System.out.println("Main menu Loading");
						
					}
				}while(Chinese_Item!=3);
					System.out.println("Returned to main menu.");
			
			}
			//food type=1 chinese end.
			//food type=2 North indian start
			if(Food_Type==1){
				System.out.println("You have selected North Indian for Menu is: ");
				
				for (int North_menu = 0; North_menu < North.length; North_menu++) {
					System.out.println(" Press "+North_menu+" for "+North[North_menu]);
				}
				int North_Item;
				int North_item_Quantity=0;
				do{
					System.out.println("Please select the item from list for Order, Re-Order or To Return To main Menu");
					North_Item=sc.nextInt();
					if(North_Item!=3){
						System.out.println("Select the quantity:");
						 North_item_Quantity=sc.nextInt();
					}
					if(North_Item==0){
						sum+=20;
						sum=North_item_Quantity*sum;
						sb.append(North[0]+" Quantity Selected: "+ North_item_Quantity+"\n");
					}else if(North_Item==1){
						sum+=20;
						sum=North_item_Quantity*sum;
						sb.append(North[1]+" Quantity Selected: "+ North_item_Quantity+"\n");
					}else if(North_Item==2){
						sum+=5;
						sum=North_item_Quantity*sum;
						sb.append(North[2]+" Quantity Selected: "+ North_item_Quantity+"\n");
					}else if(North_Item==3){
						System.out.println("Main menu Loading");
						
					}
				}while(North_Item!=3);
					System.out.println("Returned to main menu.");
			
			}
			//food type=2 North end.
			//food type=3 South indian start
			if(Food_Type==2){
				System.out.println("You have selected South Indian for Menu is: ");
				
				for (int South_menu = 0; South_menu < South.length; South_menu++) {
					System.out.println(" Press "+South_menu+" for "+South[South_menu]);
				}
				int South_Item;
				int South_item_Quantity=0;
				do{
					System.out.println("Please select the item from list for Order, Re-Order or To Return To main Menu");
					South_Item=sc.nextInt();
					if(South_Item!=3){
						System.out.println("Select the quantity:");
						 South_item_Quantity=sc.nextInt();
					}
					if(South_Item==0){
						sum+=60;
						sum=South_item_Quantity*sum;
						sb.append(South[0]+" Quantity Selected: "+ South_item_Quantity+"\n");
					}else if(South_Item==1){
						sum+=20;
						sum=South_item_Quantity*sum;
						sb.append(South[1]+" Quantity Selected: "+ South_item_Quantity+"\n");
					}else if(South_Item==2){
						sum+=60;
						sum=South_item_Quantity*sum;
						sb.append(South[2]+" Quantity Selected: "+ South_item_Quantity+"\n");
					}else if(South_Item==3){
						System.out.println("Main menu Loading");
						
					}
				}while(South_Item!=3);
					System.out.println("Returned to main menu.");
			
			}
			//food type=3 South end.
			
			
		}while(Food_Type!=3);
			System.out.println("Bill is Generating, Total Amount:"+sum+" GST and Service Tax included");
			System.out.println("You have Ordered these Orders\n"+sb);
		
		
		
		
	}
}
