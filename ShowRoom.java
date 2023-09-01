package thursday_lab_24_aug;

import java.util.Scanner;
public class ShowRoom {
	     String name ;
		 long mob_no;
		 double cost,dis,amount,per;
		 //create method
	    public void input() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name = sc.next();	
		System.out.println("enter your mobile number");
		mob_no=sc.nextLong();
		System.out.println("enter your cost price");
		cost=sc.nextDouble();
		System.out.println("enter cost price");
		}
	    //create method
	    public void calculate() {
	    	//apply conditions
	    	if(cost==10000) {
	    		dis=cost*0.05;
	    		System.out.println("Discount price is:"+dis);
	    	}
	    		else if(cost<=20000) {
	    			dis=cost*0.10;
	    			System.out.println("Discount price is:"+dis);
	    			
	    		}
	    		else if(cost<=35000) {
	    			dis=cost*0.15;
	    			System.out.println("Discount price is:"+dis);
	    		}
	    		else {
	    			dis=cost*0.20;
	    			System.out.println("Discount price is:"+dis);
	    		}
	    	
	    	System.out.println("-------------------------");
	    	//applying formula
	           amount=cost-dis;
	           System.out.println("your final amountis:"+ amount);
	    	}
	    public void display() {
	    	System.out.println("***************************");
	    	//display all inputs
	    	System.out.println("customer name:"+ name);
	    	System.out.println("cusomer contact number:"+mob_no); 
	    	System.out.println("final amount(after adding discount)"+amount);
	    }
	
}
