package com.blackjackchallenge;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
 class BlackJack {
	

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			
			boolean lets_play=false;
			
			
			
			while(!lets_play){

				System.out.println("Do You Want To Play BlackJAck If Yes Press 1 Else Press 0");
				int play=sc.nextInt();
				int count=1;
				
				int initial_amount=100;
				int starting_bet_amount=10;
				
				
				Random r=new Random();
				int dealcount=1;
				int dealsum=0;
				int sum=0;
				ArrayList<Integer> customer=new ArrayList();
				ArrayList dealer=new ArrayList();
				if(play==1){
					System.out.println("Enter You Bet Amount in multiple of 1-9");
					int bet=sc.nextInt(); 
					if(bet==0){
						System.out.println("you have selected 0, invalid bet, you cannot play further.\nYou dont have any money.");
						System.exit(0);
					}else{
						starting_bet_amount=starting_bet_amount*bet;
						initial_amount-=starting_bet_amount;
					}
					
					System.out.println("your bet amount is: "+starting_bet_amount);
					System.out.println("You remaining balance is: "+initial_amount);
					
					int i=r.nextInt(11);
					System.out.println(count+" has been drawn by Customer and Number on card is: " +i);
					customer.add(i);
					count++;
					sum+=i;
					//Customer First Time
					
					int d=r.nextInt(11);
					System.out.println(dealcount+ " has been drawn by Dealer and Number on card is "+d);
					dealer.add(d);
					dealsum+=d;
					dealcount++;
					// Dealer First Time
					
					
					int i1=r.nextInt(11);
					System.out.println(count+" has been drawn by Customer and Number on card is: " +i1);
					customer.add(i1);
					count++;
					sum+=i1;
					// Customer Second Card
					
					int d1=r.nextInt(11);
					System.out.println(dealcount+ " card has been drawn by Dealer"+d1);
					dealer.add(d1);
					dealsum+=d1;
					dealcount++;
					
				int value;
				do{
					
					System.out.println("Total Sum of Customer card "+sum);
					System.out.println("If Continue Press The Following 1. Hit 2.Stand  3.Double Down 4.Surrender 5.Split");
					
					value=sc.nextInt();
					
					switch(value){
					case 1:{
						System.out.println("You have selected Hit");
						int i2=r.nextInt(11);
						System.out.println(count++ +" has been drawn by Customer and Number on card is: " +i2);
						customer.add(i2);
							sum+=i2;
						
							if(sum>21){
								
							System.out.println("this is your total: "+sum);
								value=0;
							}else if(sum==21){

							
								value=0;
							}
						
					}
					break;
					case 2:{
						System.out.println("You have selected Stand");
						
						System.out.println( "2 has been drawn by Dealer and Number on card is "+d1);
						ArrayList<String> ag=new ArrayList();
						ag.add("Dealer won");
						ag.add("Customer won");
						
						Collections.shuffle(ag);
						Iterator it=ag.iterator();
						System.out.println(it.next());
						
						value=0;
					}
					break;
				
					
					case 3:{
						System.out.println("You have selected Double Down");
						System.out.println("Your bet is doubled");
						starting_bet_amount*=2;
						initial_amount-=starting_bet_amount;
						System.out.println("your updated bet is: "+starting_bet_amount);
						
						
						int i2=r.nextInt(11);
						System.out.println(count+" has been drawn by Customer and Number on card is: " +i2);
						Iterator<Integer> it=customer.iterator();
						while(it.hasNext()){
							int var=it.next();
							sum+=var;
							value=0;
						}
					}
					break;
				
					case 4:{
						System.out.println("You have selected Surrender");
						value=0;
					}
					break;
					
					case 5:{
						System.out.println("you have selected 5 you want to split");
						ArrayList<Integer> customerhand1=new ArrayList();
						ArrayList<Integer> customerhand2=new ArrayList();
						
						//first hand
						int firstSum=0;
						System.out.println("Your total bet is: "+starting_bet_amount);//showing bet
						System.out.println("For this hand your bet will be: "+ starting_bet_amount/2);
						initial_amount+=starting_bet_amount/2;//returning half bet
						System.out.println("1st Hand:");//1st hand cards
						System.out.println("1 has been drawn by Customer and Number on card is: " +i);// 1st card
						customerhand1.add(i);//added to collection
						firstSum+=i;//added to sum
						int i2=r.nextInt(11);
						System.out.println("1.2 has been drawn by Customer and Number on card is: " +i2);//2nd card
						customerhand1.add(i2);
						firstSum+=i2;
						System.out.println("Total sum of first hand is: "+firstSum);
						System.out.println();
						//adding both to collection and getting its sum.
						
						//Second hand
						int secondSum=0;
						System.out.println("Your total bet is: "+starting_bet_amount);//showing bet
						int return_bet_amount=starting_bet_amount/2;
						System.out.println("For this hand your bet will be: "+ starting_bet_amount/2);
						initial_amount+=starting_bet_amount/2;//returning half bet
						System.out.println("2st Hand:");//2st hand cards
						System.out.println("2 has been drawn by Customer and Number on card is: " +i1);// 1st card
						customerhand2.add(i1);//added to collection
						secondSum+=i;//added to sum
						int i3=r.nextInt(11);
						System.out.println("2.2 has been drawn by Customer and Number on card is: " +i3);//2nd card
						customerhand1.add(i3);
						secondSum+=i3;
						System.out.println("Total sum of first hand is: "+secondSum);
						System.out.println();
						//adding both to collection and getting its sum.
						
						System.out.println("please enter which hand do you want to play with 1 for 1st hand, 2 for 2nd hand");
						int hand=sc.nextInt();
						if(hand==1){
							System.out.println("You have selected first hand: cards are this");
							System.out.println("1 has been drawn by Customer and Number on card is: " +i);// 1st card
							System.out.println("1.2 has been drawn by Customer and Number on card is: " +i2);//2nd card
							
							
							System.out.println("You can only hit or surrender now");
							System.out.println("press 1 to hit and 2 to surrender");
							int hand_option1=sc.nextInt();
						/*	while(firstSum<=21){*/
								if(hand_option1==1){
								
									int i4=r.nextInt(11);
									System.out.println("next card is: "+i4);
									customerhand1.add(i4);
									firstSum+=i4;
								}else if(hand_option1==2){
									System.out.println("you have surrendered");
									System.out.println("your half bet amount will be returend that is: "+return_bet_amount/2);
									break;
								}else{
									System.out.println("You have lost this game.");
									System.out.println("your total sum is: "+firstSum);
									break;
								}//if-else over
/*							}//while over
*/						}//if, over 1st hand
					
						if(hand==2){
							System.out.println("You have selected Second hand: cards are this");
							System.out.println("2 has been drawn by Customer and Number on card is: " +i1);// 2.1st card
							System.out.println("2.2 has been drawn by Customer and Number on card is: " +i3);//2.2nd card
							
							
							System.out.println("You can only hit or surrender now");
							System.out.println("press 1 to hit and 2 to surrender");
							int hand_option1=sc.nextInt();
							/*while(secondSum<=21){*/
								if(hand_option1==1){
									
									int i5=r.nextInt(11);
									System.out.println("next card is: "+i5);
									customerhand2.add(i5);
									secondSum+=i5;
								}else if(hand_option1==2){
									System.out.println("you have surrendered");
									System.out.println("your half bet amount will be returend that is: "+return_bet_amount/2);
									break;
								
								}else{
									System.out.println("You have lost this game.");
									System.out.println("your total sum is: "+secondSum);
									break;
								}//if-else over
							/*}//while over
*/						}//if, over 2st hand
					value=0;// will get results and return to main menu
					}// split over
					break;
					
					default:{ System.out.println("Selected Wrong Option Start Again");
					value=0;}
					}
				
				}while(value!=0);
					if(sum==21){
						System.out.println("Congratulations You Won");
						float winning_amount=(float)starting_bet_amount*1.5f;
						System.out.println("Your Winning Amount Is: "+winning_amount);
						initial_amount=initial_amount + (int)winning_amount;
						System.out.println("Your Updated Amount Is: "+initial_amount);
					
						
					}else if(sum>21){
						System.out.println("Sorry You Lost");
					
					}else{
						/*if(value!=5){
							System.out.println("You Have Lost Your Bet: "+starting_bet_amount);
							System.out.println("Your Updated Balance Is:"+ initial_amount);
						}*/System.out.println("you have lost");
						System.out.println("Do You Want to play Again? Press 0 To Play, Press 1 To Stop");
						int stop_now=sc.nextInt();
						if(stop_now==0){
							lets_play=false;
						}else{
							lets_play=true;
							System.out.println("thank you for playing this game");
						}
					}
			}else{
				System.out.println("You Do Not Want To Play");
				System.out.println("Thank You");
				System.exit(0);
			}
			
			}
			
			
			}
				
		}
		




