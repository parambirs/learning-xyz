#include <stdio.h>

// A void pointer is a pointer to any type. It is automatically cast to whatever type
// you assign into it, or copy from it.
// You cannot dereference a void pointer. Before you can use it, you have to cast it to
// another pointer type.

void* pointer_array[10];	// we can hold up to 10 void-pointers
int idx = 0;

void append_pointer(void* p) {
	pointer_array[idx++] = p;
}

void* get_pointer(int i) {
	return pointer_array[i];
}

int main(void) {
	char* s = "some data!";	// s points to a constant string (char*)
	int a = 10;
	int* b;
	
	char* s2;	// when we call get_pointer(), we'll store them back here
	int* b2;
	
	b = &a;	// b is a pointer to a
	
	// now let's store them both, even though they're different types
	append_pointer(s);
	append_pointer(b);
	
	// they're stored! let's get them back!
	s2 = get_pointer(0);
	b2 = get_pointer(1);
	
	// C will let you convert the void* into any other pointer with impunity, and it
	// really is up to you to make sure you're getting them back to the type they were
	// originally.
	
	printf("%s\n", s2);
	printf("%d\n", *b2);
	
	return 0;
}