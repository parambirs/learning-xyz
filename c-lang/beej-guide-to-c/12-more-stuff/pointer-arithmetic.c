#include <stdio.h>

// You can add to and subtract from pointers. The number of bytes of memory the pointer moves differs
// depending on the type of pointer.

int main(void) {
	int a[4] = {50, 99, 3490, 0};
	int *p;
	
	p = a;
	while (*p > 0) {
		printf("%i\n", *p);
		p++;	// go to the next int in memory
	}
	
	// copy a string:
	char *source = "Copy me!";
	char dest[20];	// we'll copy that string into here
	
	char *sp;	// source pointer
	char *dp;	// destination pointer
	
	for (sp = source, dp = dest; *sp != '\0'; sp++, dp++) {
		*dp = *sp;
	}
	
	printf("%s\n", dest);	// prints "Copy me!"
	
	return 0;
	
	// comma operator: allows you to stick expressions together. The total value of the expression is the
	// rightmost expression after the comma, but all parts of the expression are evaluated, left to right.
}