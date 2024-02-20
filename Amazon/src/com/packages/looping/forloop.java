package com.packages.looping;

public class forloop {
	public static void main(String[] args) {
		int i,sum=0;
		for(i=40;;) {
			if(i<=80) {
				if(i%2==0) {
					sum=sum+i;
				
				}
				i++;
				}else break; 
			
		}System.out.println("sum of the even numbers between 40 and 80 = " +sum);
	}

}
