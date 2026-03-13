#include <iostream>

using namespace std;

class Person {
public:
	char strLastName[25];
	int intAge;
	float flSalary;

	// Member functions appear next
	void dispName(void);
	void compTaxes(float taxRate);
	char* getName(void);
	int getAge(void);
	float getSalary(void);
};

void Person::dispName(void) {
	cout << "The last name is ";
	cout << strLastName << endl;
}

void Person::compTaxes(float taxRate) {
	float taxes = taxRate * flSalary;
	cout << "The taxes are ";
	cout << taxes << endl;
}

char* Person::getName(void) {
	return strLastName;
}

int Person::getAge(void) {
	return intAge;
}

float Person::getSalary(void) {
	return flSalary;
}

int main() {
	Person mike;

	mike.intAge = 32;
	mike.flSalary = 65000.0;
	strcpy(mike.strLastName, "Johnson");

	cout << mike.strLastName << ", " << mike.intAge << ", " << mike.flSalary << endl;
	
	mike.dispName();
	mike.compTaxes(0.25);
	cout << mike.getName() << ", " << mike.getAge() << ", " << mike.getSalary() << endl;
}