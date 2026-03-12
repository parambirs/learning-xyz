////////////////////////////
// Control Structures
////////////////////////////

public static void main() {
    IO.println("\n-> Control Structures");

    // If statements are C-like
    int j = 10;
    if (j == 10) {
        IO.println("I get printed");
    } else if (j > 10) {
        IO.println("I don't");
    } else {
        IO.println("I also don't");
    }

    // While loop
    int fooWhile = 0;
    while (fooWhile < 5) {
        IO.println(fooWhile);
        // Increment the counter
        // Iterated 5 times, fooWhile 0, 1, 2, 3, 4
        fooWhile++;
    }
    IO.println("fooWhile value: " + fooWhile);

    // Do while loop
    int fooDoWhile = 0;
    do {
        IO.println(fooDoWhile);
        // Increment the counter
        // Iterated 5 times, fooDoWhile 0->4
        fooDoWhile++;
    } while (fooDoWhile < 5);
    IO.println("fooDoWhile Value: " + fooDoWhile);

    // For loop
    // for loop structure => for(<start_statement>; <conditional>; <step>)
    for (int fooFor = 0; fooFor < 5; fooFor++) {
        IO.println(fooFor);
        // Iterated 5 times, fooFor 0->4
    }
    // IO.println("fooFor value: " + fooFor);   <== fooFor not visible outside the loop

    // Nested for loop exit with label
    outer: for (int i = 0; i < 10; i++) {
        for (j = 0; j < 10; j++) {
            if (i == 5 && j == 5) {
                break outer;
                // breaks out of outer loop instead of only the inner one
            }
        }
    }

    // for-each loop
    // The for loop is also able to iterate over arrays as well as objects
    // the implement the Iterable interface.
    int[] fooList = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    // for-each loop structure => for (<object> : <iterable>)
    // reads as: for each element in the iterable
    // note: the object type must match the element type of the iterable.
    for (int bar : fooList) {
        IO.println(bar);
        // iterates 9 times and prints 1-9 on new lines
    }

    // Switch case
    // A switch works with the byte, short, char, and int data types.
    // It also works with enumerated types (discussed in Enum types), the
    // String class, and a few special classes that wrap primitive types:
    // Character, Byte, Short, and Integer.
    // Starting in Java 7 and above, we can also use the String type.
    // Note: Do remember that not adding "break" at end of any particular case
    // ends up in executing the very next case (given it satisfies the condition
    // provided) as well.
    int month = 3;
    String monthString;
    switch (month) {
        case 1: monthString = "January";
            break;
        case 2: monthString = "February";
            break;
        case 3: monthString = "March";
            break;
        default: monthString = "Some other month";
            break;
    }
    IO.println("Switch case result: " + monthString);

    monthString = switch (month) {
        case 1 -> "January";
        case 2 -> "February";
        case 3 -> "March";
        default -> "Some other month";
    };
    IO.println("Switch case result: " + monthString);

    // Try-with-resources (Java 7+)
    // Try-catch-finally statements work as expected in Java but in Java 7+
    // the try-with-resources statement is also available. Try-with-resources
    // simplifies try-catch-finally statements by closing resources automatically.

    // In order to use a try-with-resources, include an instance of a class 
    // in the try statement. The class must implement java.lang.AutoCloseable.
    try (BufferedReader br = new BufferedReader(new FileReader("foo.txt"))) {
        // You can attempt to do something that could throw an exception.
        IO.println(br.readLine());
        // In Java 7, the resource will always be closed, even if it throws an Exception.
    } catch (IOException | RuntimeException e) {
        // Java 7+ multi-catch block handles both exceptions
        IO.println("readLine() failed!");
    } catch (Exception e) {
        // The resource will be closed before the catch statement executes.
        IO.println("readLine() failed!!");
    }
    // No need for a finally statement in this case, the BufferedReader is already 
    // closed. This can be used to avoid certain edge cases where a finally 
    // statement might not be called.
    // To learn more:
    // https://docs.oracle.com/javase/tutorial/essential/exceptions/tryResourceClose.html

    // Conditional Shorthand
    // You can use the `?` operator for quick assignments or logic forks.
    // Reads as "if (statement) is true, use <first value>, otherwise, use <second value>"
    int foo = 5;
    String bar = (foo < 10) ? "A" : "B";
    IO.println("bar: " + bar);  // => bar: A, because the statement is true.
    // Or simply
    IO.println("bar: " + (foo < 10 ? "A" : "B"));
}
