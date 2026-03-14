#include <stdio.h>

int foo(void);	// this is the prototype!

int main(void) {
	int i;
	
	i = foo();
	
	return 0;
}

int foo(void) {	// this is the definition, just like the prototype!
	return 3490;
}