#include <stdio.h>

int main(void) {
	int i;	// i's type is "int"
	int* p;	// p's type is "pointer to an int", or "int pointer"
			// p is a pointer, but is uninitialized and points to garbage
	
	p = &i;	// p now "points to" i
	
	i = 10;		// i is now 10
	*p = 20;	// i (yes i!) is now 20!
	
	printf("i is %d\n", i);	// "20"
	printf("i is %d\n", *p);	// "20"! dereference-p is same as i!
	
	return 0;
}