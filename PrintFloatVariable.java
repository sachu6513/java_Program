//Declare and print a float variable

import java.util.Scanner;
public class PrintFloatVariable{
	public static void main(String[] args){
		Scanner sahi = new Scanner(System.in);
		System.out.println("Enter the value of  your float variable");
		float ab = sahi.nextFloat();
		System.out.println("your float value is :" + ab);
		sahi.close();
   }


}