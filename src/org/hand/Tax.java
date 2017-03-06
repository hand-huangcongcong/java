package org.hand;

import java.util.Scanner;

@SuppressWarnings("all")
public class Tax {
	
	public double  getTax(double salary){
		double tax;
		if (salary<=1500 )
			tax=0;
		else if(salary<=4500 && salary>1500)
			tax=(salary-1500)*0.1;
		
		else if(salary<=9000 && salary>4500)
			tax=(salary-4500)*0.2+3000*0.1;
		
		else if(salary<=35000 && salary>9000)
			tax=(salary-9000)*0.25+3000*0.1+4500*0.2;
		
		else if(salary<=55000 && salary>35000)
			tax=(salary-35000)*0.3+26000*0.2+26000*0.25;
		
		else if(salary<=80000 && salary>55000)
			tax=(salary-55000)*0.35+3000*0.1+26000*0.2+20000*0.25+20000*0.3;
		
		else
			tax=(salary-80000)*0.45+26000*0.2+20000*0.25+25000*0.35;
		return tax;
			
		
	}
	
	
	
	public static void main(String []args){
		
		Scanner in =new Scanner(System.in);
		Tax t=new Tax();
		boolean loop=true;
		char lp;
		double salary;
		while(loop){
		System.out.println("请输入工资:");
		salary=in.nextDouble();
		System.out.println("所需要交纳的税为："+t.getTax(salary));
		 System.out.println("是否还要继续Y/N");
		 lp=in.next().charAt(0);
		 if(lp=='N'||lp=='n')
			 loop=false;
		 else
			 loop=true;
		
		}
		
		
		
	}

}
