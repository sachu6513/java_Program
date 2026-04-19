//Declare and print a double variable

import java.util.Scanner;
public class PrintDoubleVariable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the double value");
		double ac = sc.nextDouble();
		System.out.println("It is the value of you entered : " + ac);
		sc.close();
	}

}