#include <stdio.h>
#include <stdlib.h>

// malloc() - allocate some memory for us to use
// free() - release some memory that malloc() gave us earlier
// realloc() - change the size of some previously allocated memory
// calloc() - like malloc() except clears the memory to zero

// calloc() - just like malloc(), except that it 1) clears the memory to zero for you, and
// 	2) it takes two parameters instead of one. The two parameters are the number of elements
// that are to be in the memory block, and the size of each element.

int main(void) {
	int *p;
	
	// this:
	p = malloc(10 * sizeof(int));
	
	// is just like this:
	p = calloc(10, sizeof(int));
	// (and the memory is cleared to zero when using calloc())
	
	// The pointer returned by calloc() can be used with realloc() and free() just as if you had used malloc().
	
	// Drawback: it takes time to clear memory, and in most cases, you don't need it clear since you'll just be
	// writing over it anyway.
}