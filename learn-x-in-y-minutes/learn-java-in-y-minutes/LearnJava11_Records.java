////////////////////////////
// Records
////////////////////////////

// Java records are a concise way to define immutable data carrier classes, automatically
// generating boilerplate code like constructors, equals(), hashCode() and toString().
// This automatically creates an immutable class Person with fields name and age.
record Person(String name, int age) {}

public static void main() {   
    Person p = new Person("Alice", 30);
    IO.println(p);
}
