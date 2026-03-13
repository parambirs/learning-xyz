#include <stdio.h>
#include <string.h>

int main() {
	char month[10];	// defines a character array
	printf("'%s'\n", month);

	// char month[10] = "September";	// declare and initialize the string
	strcpy(month, "September");	// Assigns September to the month array
	printf("'%s'\n", month);

	return 0;
}
