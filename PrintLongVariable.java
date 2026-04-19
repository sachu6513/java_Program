//Declare and print a long variable

import java.util.Scanner;
	public class PrintLongVariable{
		public static void main(String[] args){
		Scanner helo = new Scanner(System.in);
		System.out.println("Enter a long value");
		long a = helo.nextLong();
		System.out.println("your long value is : " + a);
		helo.close();
		}
	}