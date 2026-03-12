#include <stdio.h>

// When we pass parameters to functions, we're doing something commonly referred
// to as 'passing by value'.
// When you pass a value to a function, a copy of that value gets made in the stack.

void increment(int a) {
	a++;
}

int main(void) {
	int i = 10;
	
	increment(i);	// Value of i doesn't change.
	
	return 0;
}