//Declare and print a char variable

import java.util.Scanner;
public class PrintCharVariable{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name here");
		char sb = sc.next().charAt(1);
		System.out.println("This is the 2nd later from your name : " + sb);
		sc.close();
	}
}