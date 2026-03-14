#include <stdio.h>
#include <stdlib.h>

void get_string(int a, char **s) {
	switch (a) {
		case 0:
			*s = "everybody";
			break;

		case 1:
			*s = "was";
			break;

		case 2:
			*s = "kung-foo fighting";
			break;
		
		default:
			*s = "errrrrrrnt!";
	}
}

int main(void) {
	char *s;	
	get_string(2, &s);
	printf("s is \"%s\"\n", s);
	
	char** p;
	p = malloc(sizeof(char*) * 10);	// allocate 10 char*s-worth of bytes
	
	int i;
	for (i = 0; i < 10; i++) {
		*(p+i) = malloc(30);	// 30 bytes for each pointer
		
		// alternatively we could have written, above:
		// p[i] = malloc(30);
		sprintf(*(p+i), "this is string #%d", i);
	}
	
	for (i = 0; i < 10; i++) {
		printf("%d: %s\n", i, p[i]);	// p[i] same as *(p+i)
	}
	
	return 0;
}
