#include <stdlib.h>

int main(void) {
	int a = 12;
	
	if (a == 2) {
		exit(3);	// just like running (from main()) "return 3;"
	}
	
	return 2;	// just like calling exit(2);
}