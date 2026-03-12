// #if directive operates like the C if, and you can pass it an expression to be evaluated. It is most commonly
// used to block off huge chunks of code like a comment, when you don't want it to get built:
void set_hamster_speed(int warpfactor) {
#if 0
		uh this code isn't written yet. someone should really write it.
#endif
}

// You can't nest comments in C, but you can nest #if directives.

// #ifdef is true if the subsequent macro is already defined. There's a negative version of this
// directive called #ifndef.
// #ifndef is very commonly used with header files to keep them from being included multiple times.

#ifndef _AARDVARK_H_
#define _AARDVARK_H_

int get_nose_length(void);
void set_nose_length(int len);

#endif

// Another extremely useful thing to do here is to have certain code compile for a certain platform,
// and have other code compile for a different platform.
void run_command_shell(void) {
#ifdef WIN32
	system("COMMAND.EXE");
#elifdef LINUX
	system("/bin/bash");
#else
#error We don't have no steenkin shells!
#endif
}