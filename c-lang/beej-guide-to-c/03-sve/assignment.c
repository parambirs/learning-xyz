#include <stdio.h>

int main(void) {
	/* Write a program that repeatedly accepts user input and then prints 
	the numbers between 0 and the entered number. If the user enters a number 
	less than or equal to zero, the program will exit. */
	
	int i;
	
	do {
		printf("Enter a number (greater than 0): ");
		scanf("%d", &i);
		for (int j = 0; j < i; j++) {
			printf("%d\n", j);
		}
	} while (i > 0); 
	
	return 0;
}
