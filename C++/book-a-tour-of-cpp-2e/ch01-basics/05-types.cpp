#include <iostream>

using namespace std;

int main() 
{
	int inch;

	cout << "sizeof(bool) = " << sizeof(bool) << endl;	// Boolean, possible values are true and false
	cout << "sizeof(char) = " << sizeof(char) << endl;	// character, for example 'a', 'z', and '9'
	cout << "sizeof(int) = " << sizeof(int) << endl;	// integer, for example, -273, 4, and 1066
	cout << "sizeof(double) = " << sizeof(double) << endl;	// double-precision floating-point number, for example, -273.15, 3.14, and 6.626e-34
	cout << "sizeof(unsigned) = " << sizeof(unsigned) << endl;	// non-negative integer, for example, 0, 1, and 999 (use for bitwise logical operations)
}