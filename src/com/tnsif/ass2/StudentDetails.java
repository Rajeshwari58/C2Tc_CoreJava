package com.tnsif.ass2;

import java.util.Scanner;

public class StudentDetails {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner s=new Scanner(System.in);
 System.out.println("enter your rollno:");
 int roll_no=s.nextInt();
 System.out.println("enter your name:");
 String name=s.next();
 System.out.println("enter your initial:");
 char initial=s.next().charAt(0);
 System.out.println("enter your grade:");
 char grade=s.next().charAt(0);
 System.out.println("enter your percentage:");
 float percentage=s.nextFloat();
 System.out.println("view Details:");
 System.out.println("\troll_no:"+roll_no);
 System.out.print("\tname:"+name);
 System.out.println(" "+initial);
 System.out.println("\tgrade:"+grade);
 System.out.println("\tpercentage:"+percentage);
	}

}
