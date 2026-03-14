#include <stdio.h>

// when you pass the "whole" array by putting its name in as a parameter to the function,
// it's actually a pointer to the first element of the array that gets passed in for you.

// An array in C has no built-in concept of how big it is.

void init_array(int a[], int count) {
	int i;
	
	// for each element, set it equal to its index number times 10:
	for (i = 0; i < count; i++)
		a[i] = i * 10;
}

int main(void) {
	int mydata[10];
	
	init_array(mydata, 10);	// note lack of [] notation - it's a pointer to the first element of the array
	
	return 0;
}