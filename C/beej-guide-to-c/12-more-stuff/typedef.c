#include <stdio.h>

// typedef: allows you to make up an alias for a certain type, so you can reference it by that name instead.

struct a_structure_with_a_large_name {
	int a;
	float b;
};

typedef struct a_structure_with_a_large_name NAMESTRUCT;

int main(void) {
	// we can make a variable of the structure like this:
	struct a_structure_with_a_large_name one_variable;
	
	// OR, we can do it like this:
	NAMESTRUCT another_variable;
	
	return 0;
}

// you can also typedef "anonymous" structs:
typedef struct {
	int a;
	float b;
} SomeData;
