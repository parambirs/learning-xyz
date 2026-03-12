#include <stdio.h>

// An incomplete type is simply the declaration of the name of a particular struct,
// put there so that you can use pointers to the struct without actually knowing the
// fields stored therein. It most often comes up when people don't want to #include 
// another header file.

struct foo;	// incomplete type.

int main(void) {
	struct foo *w;
	
	w = get_next_wombat();
	process_wombat(w);
		
	return 0;
}