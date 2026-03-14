// stdio.h
// freopen()
// Reopen an existing FILE*, associating it with a new path
// FILE* freopen(const char* filename, const char* mode, FILE* stream);

// Let's say you have an existing FILE* stream that's already open, but you want
// it to suddenly use a different file than the one it's using. You can use
// freopen() to "re-open" the stream with a new file.

// Most common reason - if you had a program that normally would read from 
// stdin, but instead you wanted it to read from a file. Instead of changing all
// you scanf()s to fscanf()s, you could simply reopen stdin on the file you wanted
// to read from.

// Another usage that is allowed on some systems is that you can pass NULL for
// filename, and specify a new mode for stream. So you could change a file from
// "r+" (read and write) to just "r" (read). It's implementation dependent.

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int i, i2;
	
	scanf("%d", &i);	// read i from stdin
	
	// now change stdin to refer to a file instead of the keyboard
	freopen("someints.txt", "r", stdin);
	
	scanf("%d", &i2);	// now this reads from the file "someints.txt"
	
	printf("Hello, world!\n");	// print to the screen
	
	// change stdout to go to a file instead of the terminal:
	freopen("output.txt", "w", stdout);
	
	printf("This goes to the file \"output.txt\"\n");
	
	// this is allowed on some systems -- you can change the mode of a file:
	freopen(NULL, "wb", stdout);		// change to "wb" instead of "w"
	
	return 0;
}