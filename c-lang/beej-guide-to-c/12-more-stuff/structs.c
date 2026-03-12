#include <stdio.h>

// Many ways to declare structs:

// standalone:
struct antelope {
	int legcount;
	float angryfactor;
};

// with typedef:
typedef struct _goatcheese {
	char victim_name[40];
	float cheesecount;
} GOATCHEESE;

// can also declare variables along with the struct declaration by putting them directly afterward:
struct breadtopping {
	int type;	// BUTTER, MARGARINE or MARMITE
	float amount;
} mytopping;
// just like if you'd later declared:
struct breadtopping mytopping;

// you can actually omit the struct name in many cases:
typedef struct {	
	char name[100];
	int num_movies;
} ACTOR_PRESIDENT;

// It's more right to name all your structs, even if you don't use the proper name and only use the typedef'd name.

int main(void) {
	return 0;
}
