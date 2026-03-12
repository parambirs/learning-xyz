#include <stdio.h>
#include <stdarg.h>
#include <time.h>	// for time() and ctime();

int timestamp_printf(char* format, ...) {
	va_list args;
	time_t system_time;
	char* timestr;
	int return_value;
	
	system_time = time(NULL);	// system time in seconds since epoch
	timestr = ctime(&system_time);	// ready-to-print timestamp
	
	// print the timestamp:
	printf("%s", timestr);	// timestr has a newline on the end already
	
	// get our va_list:
	va_start(args, format);
	
	// call vprintf() with our arg list:
	return_value = vprintf(format, args);
	
	// done with list, so we have to call va_end():
	va_end(args);
	
	// since we want to be *exactly* like printf(), we have saved its
	// return value, and we'll pass it on right here:
	return return_value;
}
	
int main(void) {
	// example call:
	timestamp_printf("Brought to you by the number %d\n", 3490);
	
	return 0;
}
