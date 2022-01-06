package myMethod;

import java.util.Scanner;

public class MethodEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int x = 5;
		int y = 6; 
		
		System.out.println("Introduction for Method");
		showMessage(); //call Method
		System.out.println("Hello Sungai Petani");
		showMessage1();
		showMessage("Danial");
		showMessage(5);
		showMessage("Asyraaf", 20);
		showMessage(x,y);
		int total = showSum(x,y);
		System.out.println("Total sum is " + total);
		int avg = total/2;
		System.out.println("Average is " + avg);
		double total2 = showSum(3.4, 10.6);
		System.out.println("Total2 of Double is " + total2);
		double avg2 = total2/2;
		System.out.println("Average is " + avg2);
		int total3 = showSum();
		System.out.println("Total3 " + total3);
		double total4 = showSumDouble(x,y);
		System.out.println("Total4 " + total4);
	} //main method
	
	public static void showMessage() {
		System.out.println("Hello Malaysia");
	}

	public static void showMessage1() {
		System.out.println("Hello UUM");
	}
	
	public static void showMessage(String name) {
		System.out.println("Name is " + name);
	}
	
	public static void showMessage(int num) {
		System.out.println("Number is " + num);
	}
	
	public static void showMessage(String name, int num) {
		System.out.println("Name is " + name + ", age is " + num);
	}
	
	public static void showMessage(int a, int b) {
		int sum = 0;
		System.out.println("First number is " + a);
		System.out.println("Second number is " + b);
		sum = a + b;
		System.out.println("Sum is " + sum);
	}
	
	public static int showSum(int a, int b) {
		int c = 0;
		c = a + b;
		return c;
	}
	
	public static double showSum(double c, double d) {
		double e = 0;
		e = c + d;
		return e;
	}
	
	public static int showSum() {
		int sum = 0;
		int [] num = new int [5];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter five numbers: ");
		for (int i=0; i<num.length; i++) 
		{
	    	num[i] = input.nextInt();
	    	sum = sum + num[i];
		}
		return sum;
	}
	
	public static double showSumDouble(int x, int y) {
		double sum = 0;
		double[][] num  = new double [x][y];
		Scanner input = new Scanner(System.in);
		System.out.println("Enter six numbers: ");
		for (int i = 0; i<x; i++)
		{
			for (int j = 0; j<num.length; j++)
			{
				num [i][j] = input.nextDouble();
				sum = sum + num [i][j];
			}
		}
		return sum;
	}
}
