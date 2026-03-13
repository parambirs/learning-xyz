#include <iostream>

using namespace std;

int main() {
	cout << "Hello, world!" << endl;

	cout << "Here is the total: " << 1000.0 << endl;

	cout << "Line 1" << '\n' << "Line 2" << '\n' << "Line 3" << endl;

	int intAge;

	cout << "How old are you? ";
	cin >> intAge;
	cout << "Next year, you will be " << (intAge + 1) << endl;
}