#include <stdio.h>
#include <stdlib.h>

// malloc() - allocate some memory for us to use
// free() - release some memory that malloc() gave us earlier
// realloc() - change the size of some previously allocated memory
// calloc() - like malloc() except clears the memory to zero

// free() - takes as its argument a pointer that you've picked up using malloc() (or calloc()). And it
// releases the memory associated with that data. You really should never use memory after it has been 
// free()'d 

int main(void) {
	int *p;

	p = malloc(sizeof(int) * 12);	// allocate for me 12 ints!
	
	free(p);	
}