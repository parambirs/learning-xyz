#include <stdio.h>

// you can use an enum to make symbolic names for integer numbers that programmers can use later in their code
// in place of ints

enum fishtypes {
	HALIBUT,
	TUBESNOUT,
	SEABASS,
	ROCKFISH
};

enum frogtypes {
	THREELEGGED = 3,
	FOUREYED,
	SIXHEADED = 6
};

int main(void) {
	enum fishtypes fish1 = SEABASS;
	enum fishtypes fish2;
	
	if (fish1 == SEABASS) {
		fish2 = TUBESNOUT;
	}
	
	printf("%d\n", fish1);
	printf("%d\n", THREELEGGED == FOUREYED);
	
	return 0;
}
