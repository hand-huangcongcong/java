package org.hand;

import java.util.Scanner;

public class TEST {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("请输入日期:");
		String date = scanner.next();
		String[]  strs=date.split("-");
		int year = 0;
		int month = 0;
		int day = 0;
		if(strs.length<4){
			//System.out.println("111");
			    	year=Integer.parseInt(strs[0]);
			    	month=Integer.parseInt(strs[1]);
			    	day=Integer.parseInt(strs[2]);
			    	
			try {if(year>=1000 && year<9999 && month<13 && month>0 && day>0 && day<32){
				//System.out.println("日期");
				if((year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && month==2 ){
					  if(day > 29){
					    	System.out.println("润日期不存在");
					    }
					    else if(day == 29){
					    	
					    	month =month+ 1;
					    	day = 1;
					    }
					    else{
					    	day = day+1;
					    }
				    }
				
				else if(month == 1 ||month == 3 || month ==5 || month ==7|| month ==8||month ==10){
					if(day<31){
						day = day+ 1;
					}else{
						month = month+1;
				    	day = 1;
					}
				    	
				    }
				    else if(month == 12 ){
				    	if(day < 31){
				    		day = day+ 1;
				    	}else{
				    		year = year+1;
					    	month = 1;
					    	day = 1;
				    	}
				    	
				    }
				    else if(month==2){
				    	if(day == 28){
				    		month = month+1;
					    	day = 1;
				    	}else if(day<28){
				    		day = day+ 1;
				    	}else{
				    		System.out.println("日期不存在");
				    	}
					    	
				    }
				  
				    else if(month == 4 ||month == 6 || month ==9 || month ==11){
				    	if(day == 30){
				    		month = month+1;
					    	day = 1;
				    	}else if(day < 30){
				    		day = day+ 1;
				    	}else{
				    		System.out.println("日期不存在");
				    	}
				    	
				    }
	    	}
			else{
				System.out.println("终日期不存在");
			}
				
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("日期格式错误");
			} 
		     
		}
		System.out.println(year+"-"+month+"-"+day);

	}

}
