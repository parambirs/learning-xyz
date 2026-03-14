#include <stdio.h>

int main(int argc, char **argv) {
	int a[2][5] = {	// [2][5] = [rows][cols]
		{10, 20, 30, 40, 55},
		{10, 18, 21, 30, 44}
	};
	
	int i, j;
	
	for (i = 0; i < 2; i++) {	// for all the rows...
		for (j = 0; j < 5; j++) {	// print all the columns!
			printf("%d ", a[i][j]);
		}
		
		// at the end of the row, print a newline for the next row
		printf("\n");
	}	
		
	// same example using a single-dimensional array:
	int b[10] = {10, 20, 30, 40, 55, 
				10, 18, 21, 30, 44};
				
	for (i = 0; i < 2; i++) {	// for all the rows...
		for (j = 0; j < 5; j++) {	// print all the columns!
			int index = i*5 +j;	// calc the index
			printf("%d ", b[index]);
		}
		
		// at the end of the row, print a newline for the next row
		printf("\n");
	}
		
	return 0;
}