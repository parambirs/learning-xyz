// #include directive
// Each compiler has a set of directories it looks in for header files when you specify the
// file name in angle brackets. (On unix, it commonly searches the /usr/include directory).
// If you want to include a file from the same directory as the source, use double quotes.

// include from the system include directory:
#include <stdio.h>
#include <sys/types.h>

// include from the local directory:
#include "mutants.h"
#include "fishies/halibut.h"
