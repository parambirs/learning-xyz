#include <iostream>

using namespace std;

int main() 
{
	double* pd = nullptr;
	// int x = nullptr;	// error: nullptr is a pointer not an integer	
}

// count the number of occurrences of x in p[]
// p is assumed to point to a zero-terminated array of char (or to nothing)
int count_x(const char* p, char x)
{
	if (p == nullptr)
		return 0;

	int count = 0;
	while (*p) {	// equivalent to while (*p != 0)
		if (*p == x)
			++count;
		++p;
	}

	return count;
}

// There is no "null reference". A reference must refer to a valid object (and implementations
// assume that it does). There are obscure and clever ways to violate that rule; don't do that.
