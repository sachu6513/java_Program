//Print all primitive data types with example values

import java.util.Scanner;
public class PrintAllDataTypes{
	public static void main(String[] allu){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter byte type value");
		byte a = sc.nextByte();
		System.out.println("Enter a short type value");
		short b = sc.nextShort();
		System.out.println("Enter a int type value");
		int c = sc.nextInt();
		System.out.println("Enter a long type value");
		long d = sc.nextLong();
		System.out.println("Enter a float type value");
		float e = sc.nextFloat();
		System.out.println("Enter a double type value");
		double f = sc.nextDouble();
		System.out.println("Enter a char type value");
		char g = sc.next().charAt(0);
		System.out.println("Enter a boolean type value");
		boolean h = sc.nextBoolean();
		System.out.println("byte value : " + a );
		System.out.println("short value : " + b );
		System.out.println("int value : " + c );
		System.out.println("long value : " + d );
		System.out.println("float value : " + e );
		System.out.println("double value : " + f );
		System.out.println("char value : " + g );
		System.out.println("boolean value : " + h );
		sc.close();
	
	}
		
}