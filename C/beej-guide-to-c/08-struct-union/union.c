#include <stdio.h>

// unions share the same memory space for all their members. e.g.:
union misc_stuff {	// all 3 fields are stored in the same place in memory.
	int train_type;
	char *crab_name;
	float cups_of_coffee;
};

// The reason union exists is to all you to save memory in a struct-like construct when you
// know you won't be using the fields at the same time. E.g. store data and its type:
struct variable {
	// 0 = int, 1 = float, 2 = string
	int type;
	
	union {
		int i;
		float f;
		char *s;
	} data;
};

void print_variable(struct variable *v) {
	switch (v->type) {
		case 0: 	// int
			printf("%d\n", v->data.i);
			break;
		case 1: 	// float
			printf("%f\n", v->data.f);
			break;
		case 2:
			printf("%s\n", v->data.s);
			break;
	}
}

int main(void) {
	struct variable v;
	
	v.type = 1;
	v.data.f = 0.8;
	
	print_variable(&v);
	
	return 0;
}