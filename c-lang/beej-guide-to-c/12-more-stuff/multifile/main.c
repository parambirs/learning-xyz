#include <stdio.h>
#include "simplemath.h"	// double quotes tells the preprocessor to include this file from the current directory
						// instead of the standard system directory.

int main(void) {
	int a = 10, b;
	
	b = plus_one(a);	// make that processor work!
	
	printf("%d\n", b);
	
	return 0;
}

// to build: 
// cc main.c simplemath.c -o main