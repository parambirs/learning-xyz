#include <stdio.h>

int main(void) {
	int i;
	int age[5] = {10, 20, 25, 8, 2};
	
	for (i = 0; i < 5; i++) {
		printf("age %d is %d\n", i, age[i]);	
	}
	
	return 0;
}