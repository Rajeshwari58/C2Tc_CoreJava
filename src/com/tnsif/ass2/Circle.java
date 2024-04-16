package com.tnsif.ass2;
import java.util.Scanner;
public class Circle {
		private double radius;
		private String color;
		public void getInput() {
			Scanner scanner=new Scanner(System.in);
			System.out.println("enter the radius of the circle:");
			radius=scanner.nextDouble();
			System.out.println("enter the color of the circle:");
			color=scanner.nextLine();
			scanner.close();
		}
		public void calcArea() {
			double area=Math.PI*radius*radius;
			System.out.println("the area of the circle is:"+area);
		}
		public static void main(String[]args) {
			Circle circle1=new Circle();
			circle1.getInput();
			circle1.calcArea();
			
		}


}
