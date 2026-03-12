////////////////////////////
// Input/Output
////////////////////////////

// In order to run a java program, it must have a main method as an entry point.
public static void main(String[] args) {
	
	/*
	Output
	*/

	// Use System.out.println() to print lines.
	System.out.println("Hello, world!");
	System.out.println(
		"Integer: " + 10 +
		" Double: " + 3.14 +
		" Boolean: " + true);

	// IO.println() is available in Java 25+
	IO.println("Hello Java 25!");

	// To print without a newline, use System.out.print()
	System.out.print("Hello ");
	System.out.println("world!!!");

	// Use System.out.printf() for easy formatted printing
	System.out.printf("pi = %.5f %n", Math.PI);	// => pi = 3.14159

	/*
	Input
	*/

	// Use IO.readln() or IO.readln(prompt) to
	// read a line of string input:
	String input = IO.readln("Name: ");
	IO.println("Hello, " + input + "!");

	// use Scanner to read input
	// must import java.util.Scanner;
	Scanner scanner = new Scanner(System.in);

	// read string input
	String name = scanner.next();

	// read byte input
	byte numByte = scanner.nextByte();

	// read int input
	int numInt = scanner.nextInt();

	// read long input
	long numLong = scanner.nextLong();

	// read float input
	float numFloat = scanner.nextFloat();

	// read double input
	double numDouble = scanner.nextDouble();

	// read boolean input
	boolean bool = scanner.nextBoolean();
}