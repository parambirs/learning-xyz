#include <stdio.h>

int frotz(int a) {
	int b;
	
	b = 10;	// in scope (from the local definition)
	a = 20;	// in scope (from the parameter list)
	c = 30;	// ERROR, out of scope (declared in another block, in main())
}

int main(void) {
	int c;
	
	c = 20;	// in scope
	b = 30;	// ERROR, out of scope (declared above in frotz())
	
	return 0;
}