#include <stdio.h>

struct creature {
	float x;
	float y;
};

void execute_behavior(struct creature *c) {
	// does nothing now
}

int main(void) {
	int i;
	struct creature guys[12];
	
	// initialize them -- could be its own function:
	for (i = 0; i < 12; i++) {
		guys[i].x = (float) i;
		guys[i].y = (float) i;
	}
	
	// main loop
	
	for (;;) {	// loop forever
		
		// have them do their thing
		for (i = 0; i < 12; i++) {
			execute_behavior(&(guys[i]));
		}
		
		// output the result
		for (i = 0; i < 12; i++) {
			printf("creature %d: (%.2f, %.2f)\n", i, guys[i].x, guys[i].y);
		}
	}
	
	return 0;
}