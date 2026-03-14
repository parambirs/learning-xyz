#include <stdio.h>

// NULL means a pointer to nothing. Sometimes it's useful to know if the pointer is valid,
// or if it needs to be initialized.

int main(void) {
	int* p = NULL;
	
	if (p == NULL) {
		printf("p is uninitialized!\n");
	} else {
		printf("p points to %d\n", *p);
	}
	
	// Note that pointers aren't preinitialized to NULL when you declare them - you
	// have to explicitly do it. No non-static local variables are preinitialized,
	// pointers included.
	
	return 0;
}