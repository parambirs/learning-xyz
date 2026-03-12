// stdio.h
// printf(), fprintf()

// Print a formatted string to the console or to a file.

#include <stdio.h>

int main(void) {
	printf("%10d\n", 123);	// prints '123' on the right side of the 10-space field
	printf("%-10d\n", 123);	// prints '123' on the left side of the 10-space field
		
	int width = 12;
	int value = 3490;
	
	// dynamic width
	printf("%*d\n", width, value);
	
	// padded with zeros:
	printf("%05d\n",  17);	// "00017"
	
	float f = 3.1415926535;
	
	printf("%.2f\n", f);	// "3.14"
	printf("%7.3f\n", f);	// "  3.141"
	
	// %n
	int numChars;
	float a = 3.14159;
	int b = 3490;
	
	printf("%f %d%n\n", a, b, &numChars);
	printf("The above line contains %d characters.\n", numChars);
		
	return 0;
}