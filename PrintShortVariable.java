//Declare and print a short variable

import java.util.Scanner;
public class PrintShortVariable{
	public static void main(String[] allu){
	Scanner sachu = new Scanner(System.in);
	System.out.println("Enter a short value");
	short a = sachu.nextShort();
	System.out.println("short value is : " + a);
	sachu.close();
	
	}
}