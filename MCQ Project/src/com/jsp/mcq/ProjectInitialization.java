package com.jsp.mcq;

public class ProjectInitialization {
	int[]arr=new int[20];
	int sum;
	int incorrect=0;
	int skip=0;
	ProjectInitialization(int[]arr){
		int sum=0;
		int incorrect=0;
		int skip=0;
		this.arr=arr;
		
		if(arr[0]==3){
			sum+=1;
		}else if(arr[0]==5){
			skip+=1;
		}else{
		
			incorrect+=1;
		}
	
		if(arr[1]==2){
			sum+=1;
		}else if(arr[1]==5){
			
		}else{
			incorrect+=1;
		}
		if(arr[2]==3){
			sum+=1;
		}else if(arr[2]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}
		if(arr[3]==4){
			sum+=1;
		}else if(arr[3]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}
		if(arr[4]==3){
			sum+=1;
		}else if(arr[4]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[5]==2){
			sum+=1;
		}else if(arr[5]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[6]==4){
			sum+=1;
		}else if(arr[6]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[7]==3){
			sum+=1;
		}else if(arr[7]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[8]==3){
			sum+=1;
		}else if(arr[8]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[9]==3){
			sum+=1;
		}else if(arr[9]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[10]==4){
			sum+=1;
		}else if(arr[10]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if
		(arr[11]==3){
			sum+=1;
		}else if(arr[11]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[12]==3){
			sum+=1;
		}else if(arr[12]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[13]==2){
			sum+=1;
		}else if(arr[13]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[14]==4){
			sum+=1;
		}else if(arr[14]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[15]==3){
			sum+=1;
		}else if(arr[15]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[16]==3){
			sum+=1;
		}else if(arr[16]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[17]==2){
			sum+=1;
		}else if(arr[17]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[18]==4){
			sum+=1;
		}else if(arr[18]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}if(arr[19]==3){
			sum+=1;
		}else if(arr[19]==5){
			skip+=1;
		}else{
			incorrect+=1;
		}
		this.sum=sum;
		this.incorrect=incorrect;
		this.skip=skip;
}/*
	void print(){
		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}*/
	//}
}
