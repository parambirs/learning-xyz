#include <stdio.h>
#include <stdlib.h>

// malloc() - allocate some memory for us to use
// free() - release some memory that malloc() gave us earlier
// realloc() - change the size of some previously allocated memory
// calloc() - like malloc() except clears the memory to zero

// realloc() - takes a chunk of memory you allocated with malloc() (or calloc()) and changes the size
// of the memory chunk. realloc() might have to move your data to another place in memory if it can't,
// for whatever reason, increase the size of the current block.
// You should use realloc() sparingly since it could be an expensive operation. Usually the procedure is to
// keep track of how much room you have in the memory block, and then add another big chunk to it if you
// run out.

#define INITIAL_SIZE 10
#define BUCKET_SIZE 5

static int data_count;	// how many ints we have stored
static int data_size;	// how many ints we *can* store in this block
static int *data;		// the block of data itself

void add_data(int new_data);	// function prototype

int main(void) {
	int i;
	
	// first, initialize the data area:
	data_count = 0;
	data_size = INITIAL_SIZE;
	data = malloc(data_size * sizeof(int));	// allocate initial area
	
	// now add a bunch of data
	for (i = 0; i < 23; i++) {
		add_data(i);
	}
	
	return 0;
}

void add_data(int new_data) {
	// if data_count == data_size, the area is full and
	// needs to be realloc()'d before we can add another:
	
	if (data_count == data_size) {
		// we're full up, so add a bucket
		data_size += BUCKET_SIZE;
		printf("realloc() to size: %d\n", data_size);
		data = realloc(data, data_size * sizeof(int));
	}
	
	// now store the data
	*(data+data_count) = new_data;
	
	// ^^^ the above line could have used array notation, like so:
	// data[data_count] = new_data;
	
	data_count++;
}