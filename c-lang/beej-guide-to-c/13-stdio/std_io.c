#include <stdio.h>

int main(void) {
    // this line:
    scanf("%d", &x);

    // is just like this line:
    fscanf(stdin, "%d", &x);

    printf("Hello, world!\n");
    fprintf(stdout, "Hello, world!\n"); // same as previous line!
}