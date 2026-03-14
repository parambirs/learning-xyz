// stdio.h
// fclose()

// When your program exits normally, it closes all open files for you.

#include <stdio.h>
#include <stdlib.h>

int main(void) {
	FILE* fp;
	
	fp = fopen("spoonDB.dat", "r");	// you should error-check this
	// sort_spoon_database(fp);
	fclose(fp);
	
	return 0;
}