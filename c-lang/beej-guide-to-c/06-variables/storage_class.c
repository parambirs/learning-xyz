#include <stdio.h>

// storage class declaration: tells the compiler where to store the data, such as on the
// stack or on the heap, or if variable data storage is already declared elsewhere.
// if you simply define a local variable as static, it'll be initialized automatically
// to zero unless you specify otherwise.

// other storage classes:
//	- auto: the default
//	- extern: tells the compiler that the definition of the variable is in a different file.
//		allows you to reference a global variable from a file, even if its definition is 
// 		somewhere else. It would be illegal to define it twice.

void print_plus_one(void) {
	static int a = 0;	// static storage class!
	printf("%d\n", a);
	a++;	// increment the static value
}

int main(void) {
	print_plus_one();	// 0
	print_plus_one();	// 1
	print_plus_one();	// 2
	print_plus_one();	// 3
	print_plus_one();	// 4
	
	return 0;
}