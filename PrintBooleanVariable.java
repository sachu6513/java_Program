//Declare and print a boolean variable

import java.util.Scanner;
public class PrintBooleanVariable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Boolean value");
		boolean ab = sc.nextBoolean();
		System.out.println("This is a boolean value you have entered : " + ab);
		sc.close();
	}

}