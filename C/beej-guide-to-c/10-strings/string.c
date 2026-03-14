// A string in C is a sequence of bytes in memory that usually contains a bunch of letters.
// Constant strings in C are surrounded by double quotes (").

#include <stdio.h>

int main(void) {
	printf("Hello, world!\n");
	
	// A constant string is of type char*. But you can also put a string into a
	// char array. The char* points at the first character in the string.
	char *s = "Hello!";
	printf("%s\n", s);		// "Hello!"
	printf("%c\n", *s);		// 'H'
	printf("%c\n", s[0]);	// 'H'
	printf("%c\n", s[1]);	// 'e'
	printf("%c\n", s[4]);	// 'o'
	
	// Can initialize char arrays during their definition, just like other arrays:
	char s2[20] = "Give me $10!";
	printf("%s\n", s2);
	
	// You can change the array elements on the fly:
	s2[9] = '8';
	printf("%s\n", s2);
	
	// When you specify an array by name without the square brackets, it's just like using a pointer
	// to the beginning of the array. So, you can do assignments like:
	char a[20] = "Cats are better.";
	char *p;
	
	p = a;	// p now points to the first char in array a
	printf("%s\n", p);
	
	// strings in C end with a NUL character - most properly written as '\0'.
	// You can truncate a string to zero length by assigning '\0' to the first byte
	// in the string.
	
	return 0;
}