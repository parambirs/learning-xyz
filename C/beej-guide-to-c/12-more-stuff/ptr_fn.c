#include <stdio.h>
#include <stdlib.h>

// Instructions are held in addresses, and therefore, you can have a pointer to a block of instructions.
// A block of instructions in C is held in a function, and, therefore, you can have a pointer
// to a function.

// Similar to arrays, where the name of the array without square brackets is a pointer to the
// first element in the array; the name of the function without parens is a pointer to the first
// instruction in the function.

// Declare p as a pointer to a function that takes two int
// parameters and returns a float:
float (*p)(int, int);

int deliver_fruit(char* address, float speed) {
	printf("Delivering fruit to %s at speed %.2f\n", address, speed);

	return 3490;
}
	
int main(void) {
	int (*p)(char*, float);	// declare a function pointer variable
	p = deliver_fruit;	// p now points to the deliver_fruit() function

	deliver_fruit("My house", 5280.0);	// a normal call
	p("My house", 5280.0);	// the same call, but using the pointer	
		
	return 0;
}
