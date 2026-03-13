/* Initial C program that demonstrates the C comments
and shows a few variables and their declarations */

#include <stdio.h>

int main()
{
	int i, j;	// these 3 lines declare 4 variables
	char c;
	float x;

	i = 4;	// i and j are assigned integer values
	j = i + 7;
	c = 'A';	// All character constants are enclosed in single quotes
	x = 9.087;	// x requires a floating-point value since it was declared as a floating-point variable
	x = x * 4.5;	// change what was in x with a formula

	// Sends the values of the variables to the screen
	printf("%d %d %c %f\n", i, j, c, x);

	return 0;	// end program and functions with return
}

/*
> make cfirst
> ./cfirst
*/
