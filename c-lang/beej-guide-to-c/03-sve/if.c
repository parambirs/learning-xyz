#include <stdio.h>

int main(void) {
	int i = 10;

	if (i > 10) {
		printf("Yes, i is greater than 10.\n");
		printf("And this will also print if i is greater than 10.\n");
	}
	
	if (i <= 10) {
		printf("i is less than or equal to 10.\n");
	}
	
	// Conditions:
	i == 10;	// true if i is equal to 10
	i != 10;	// true if i is not equal to 10
	i > 10;
	i < 10;
	i >= 10;
	i <= 10;
	
	// C doesn't have a "true" keyword like C++ does. In C, any non-zero value is true,
	// and a zero value is false.
	if (1) {
		printf("This will always print.\n");
	}
	if (-3490) {
		printf("This will always print.\n");
	}
	if (0) {
		printf("This will never print. Ever.\n");
	}
	
	// The following will print 1 followed by 0:
	i = 10;
	printf("%d\n", i == 10);	// i == 10 is true, so it's 1
	printf("%d\n", i > 20);		// i is not > 20, so this is false, 0
	
	return 0;
}
