#include <stdio.h>

// #define directive

// You can declare constants to be substituted into the source code before the compiler
// even sees them.
// Typically, #defines are all capitals, by convention.

#define PI 3.14159265358979	// more pi than you can handle

int main(void) {
	float r = 10.0;
	
	printf("pi: %f\n", PI);
	printf("pi/2: %f\n", PI/2);
	printf("area: %f\n", PI*r*r);
	printf("circumference: %f\n", 2*PI*r);
	
	return 0;
}

// You can use #define to write little macros that are like miniature functions that the preprocessor
// evaluates, again, before the C compiler sees the code. To make a macro, you give an argument list
// (without types, because the preprocessor knows nothing about types), and then you list how that
// is to be used.
#define TIMES3490(x) ((x) * 3490)	// no semicolons, notice!

void evaluate_fruit(void) {
	printf("40 * 3490 = %d\n", TIMES3490(40));
}

// Programmers with good practices will automatically put a set of parens around each usage of the
// parameter variable in the macro, as well as a set of parens around the outside of the macro itself.