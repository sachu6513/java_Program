//Declare and print a byte variable

import java.util.Scanner;
public class PrintByteVariable{
	public static void main(String[] allu){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a byte value");
		byte s = sc.nextByte();
		System.out.println(" byte value is : " + s );
		sc.close();
	}
}