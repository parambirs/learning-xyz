////////////////////////////
// Operators
////////////////////////////

public static void main() {

	IO.println("\n -> Operators");

	int i1 = 1, i2 = 2;

	// Arithmetic is straightforward
	IO.println("1+2 = " + (i1 + i2));	// => 3
	IO.println("2-1 = " + (i2 - i1));	// => 1
	IO.println("1*2 = " + (i1 * i2));	// => 2
	IO.println("1/2 = " + (i1 / i2));	// => 0 (int/int returns int)
	IO.println("1/2.0 = " + (i1 / (double)i2));	// => 0.5

	// Modulo
	IO.println("11 % 3 = " + (11 % 3));	// => 2

	// Comparison operators
	IO.println("3 == 2? " + (3 == 2));	// => false
	IO.println("3 != 2? " + (3 != 2));	// => true
	IO.println("3 > 2? " + (3 > 2));	// => true
	IO.println("3 < 2? " + (3 < 2));	// => false
	IO.println("2 <= 2? " + (2 <= 2));	// => true
	IO.println("2 >= 2? " + (2 >= 2));	// => true

	// Boolean oeprators
	IO.println("3 > 2 && 2 > 3? " + ((3 > 2) && (2 > 3)));	// => false
	IO.println("3 > 2 || 2 > 3? " + ((3 > 2) || (2 > 3)));	// => true
	IO.println("!(3 == 2)? " + (!(3 == 2)));	// => true

	// Bitwise operators!
	/*
	~	Unary bitwise complement
	<<	Signed left shift
	>>	Signed/Arithmetic right shift
	>>>	Unsigned/Logical right shift
	&	Bitwise AND
	^	Bitwise exclusive OR
	|	Bitwise inclusive OR
	*/

	// Increment operators
	int i = 0;
	IO.println("\n->Inc/Dec-rementation");
	// The ++ and -- operators increment and decrement by 1 respectively.
	// If they are placed before the variable, they increment then return;
	// after the variable they return then increment.
	IO.println(i++);	// i = 1, prints 0 (post-increment)
	IO.println(++i);	// i = 2, prints 2 (pre-increment)
	IO.println(i--);	// i = 1, prints 2 (post-decrement)
	IO.println(--i);	// i = 0, prints 0 (pre-decrement)
}
