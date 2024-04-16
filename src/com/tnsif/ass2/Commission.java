package com.tnsif.ass2;
import java.util.Scanner;
public class Commission {
	String name,Address;
	long phoneno,sales_amount;
	public void acceptdetail() {
	Scanner s=new Scanner(System.in);
	System.out.println("enter the employee name:");
	name=s.nextLine();
	System.out.println("enter the employee Address:");
	Address=s.nextLine();
	System.out.println("enter the employee phoneno:");
	phoneno=s.nextLong();
	System.out.println("enter the employee sales_amount:");
	sales_amount=s.nextLong();
	
	}
	public void calccommission() {
		if(sales_amount>=100000)
		   System.out.println("commission=10%");
	    else if(50000>=sales_amount && sales_amount<=100000)
		   System.out.println("commission=5%");
		else if(30000>=sales_amount && sales_amount<=10000)
		   System.out.println("commission=3%");
		   else
			   System.out.println("no commission");   
	}

	public static void main(String[] args) {
	Commission commission=new Commission();
	commission.acceptdetail();
    commission.calccommission();
	}

}
