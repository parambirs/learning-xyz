#include <iostream>

using namespace std;

int main() 
{
	int x = 7;
	int& r {x};			// bind r to x (r refers to x)
	r = 70;				// assign to whatever r refers to
	cout << r << endl;	// => 70

	int& r2;	// error: uninitialized reference
	r2 = 99;	
}
