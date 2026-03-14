#include <stdio.h>

int main(void) {
	// print numbers between 0 and 9, inclusive:
	int i;
	
	for (i = 0; i < 10; i++) {
		printf("i is %d\n", i);
	}
	
	/*
	// An empty for will run forever:
	for (;;) {
		printf("I will print this again and again and again\n");
		printf("for all eternity until the cold-death of the universe.\n");
	}
	*/
	
	return 0;
}
