#include <stdio.h>

// A global variable is visible throughout the entire file that it is defined in (or 
// declared in).
// global variables go on the heap.

// this is a global variable
int g = 10;

void afunc(int x) {
	g = x;	// this sets the global to whatever x is
}

int main(void) {
	g = 10;		// global g is now 10
	afunc(20);	// but this function will set it to 20
	printf("%d\n", g);	// so this will print "20"
	
	return 0;
}