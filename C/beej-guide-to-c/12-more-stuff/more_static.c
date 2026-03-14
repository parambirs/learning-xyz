#include <stdio.h>

// At the global scope, static means that the variable or function declared static is only visible in this
// particular source file, and cannot be referenced from other source files.
static void* pointer_array[10];	// now no one can see it except this file!
static int index = 0;	// same for this one!

// but these functions are NOT static, so they can be used from other files:

void append_pointer(void* p) {
	pointer_array[index++] = p;
}

void* get_pointer(int i) {
	return pointer_array[i];
}

int main(void) {
	return 0;
}

// What would be proper would be to make a file called more_static.h that has the function prototypes for the
// two functions in it. Then the file that has main() in it can #include more_static.h and use the functions
// when it is all linked together.