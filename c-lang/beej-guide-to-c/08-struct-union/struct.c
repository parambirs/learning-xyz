#include <stdio.h>

// Here we declare the type so we can use it later:
struct stuff {
	int val;
	float b;
};

struct antelope {
	int val;
	float something;
};

int main(void) {
	// ok, now let's declare a variable "s" of type "struct stuff"
	struct stuff s;
	
	s.val = 3490;	// assignment into a struct!
	s.b = 3.14159;
	
	printf("The val field in s is: %d\n", s.val);
	
	struct antelope a;
	struct antelope* b;	// this is a pointer to a struct antelope
	
	b = &a;
	
	a.val = 3490;
	
	// since b is a pointer, we have to dereference it before we can use it:
	(*b).val = 3491;
	
	// but that looks kinda bad, so let's do the exact same thing except this 
	// time we'll use the "arrow operator", which is a bit of syntactic sugar:
	b->val = 3492;
	
	printf("The val field in a is: %d\n", a.val);
	
	return 0;
	
	return 0;
}