#include <stdio.h>
#include <stdlib.h>
#include <stdarg.h>

// All the arguments are pushed onto the stack when passed to a function. Some macros have been set up to 
// help you walk along the stack and pull arguments off one at a time. In this way, you don't need to know
// at compile time what the argument list will look like.

// The first argument must be specified, but that's all:
float average(int count, ...);
	
// There is a special type declared in the header stdarg.h called va_list. It holds data about the stack and
// about what arguments have been parsed off so far. But first you have to tell it where the stack for 
// this function starts.	
	
// We operate on our va_list using a number of preprocessor macros.
// First, we use va_start() to tell our va_list where the stack starts.
// Then we use va_arg() repeatedly to pull arguments off the stack.
// Finally we use va_end() to tell our va_list that we're done with it.
// The language spec says we must call va_end(), and we must call it in the same function from
// which we called va_start().

float average(int count, ...) {
	float ave = 0;
	int i;
	va_list args;	// here's our va_list!
	
	va_start(args, count);	// tell it the stack starts with "count"
	
	// inside the while(), pull int args off the stack:
	for (i = 0; i < count; i++) {
		int val = va_arg(args, int);	// get the next int argument
		ave += (float) val;	// cast the value to a float and add to total
	}
	
	va_end(args);	// clean this up
	
	return ave/count;	// calc and return the average
}	
	
int main(void) {
	float avg = average(5, 1, 2, 3, 4, 5);
	printf("average = %.2f\n", avg);
	
	return 0;
}
