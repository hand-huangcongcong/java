package org.hand;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		double tax = (double) 0.00;
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入工资:");
		int pay = scanner.nextInt();
			if(pay>80000+3500){
				tax = (pay-3500)*0.45;
						}
			else if(pay>55000+3500){
				tax = (pay-3500)*0.35;
			}
			else if(pay>35000+3500){
				tax = (pay-3500)*0.3;
			}
			else if(pay>9000+3500){
				tax = (pay-3500)*0.25;
			}
			else if(pay>4500+3500){
				tax = (pay-3500)*0.20;
			}
			else if(pay>1500+3500){
				tax = (pay-3500)*0.10;
			}
			else if(pay>3500){
				tax = (pay-3500)*0.03;
			}
			
		
		
		System.out.println("所需要缴纳的税费为:"+tax);
	}

	
}
