#include <iostream>

using namespace std;

class Person {
public:
	char strLastName[25];
	int intAge;
	float flSalary;

	void dispName(void) {
		cout << "The last name is ";
		cout << strLastName << endl;
	}

	void compTaxes(float taxRate) {
		float taxes = taxRate * flSalary;
		cout << "The taxes are ";
		cout << taxes << endl;
	}

	char* getName(void) {
		return strLastName;
	}

	int getAge(void) {
		return intAge;
	}

	float getSalary(void) {
		return flSalary;
	}
};

int main() {
	Person mike;

	mike.intAge = 32;
	strcpy(mike.strLastName, "Johnson");

	cout << mike.strLastName << ", " << mike.intAge << ", " << mike.flSalary << endl;
}