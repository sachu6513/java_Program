//Declare and print an int variable

import java.util.Scanner;
	public class PrintIntVariable{
		public static void main(String[] args){
		Scanner hi = new Scanner(System.in);
		System.out.println("Enter an int value");
		int a = hi.nextInt();
		System.out.println("your int value is : " + a);
		hi.close();
		
		}
	
	}