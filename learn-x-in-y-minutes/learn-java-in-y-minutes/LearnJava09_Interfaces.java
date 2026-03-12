////////////////////////////
// Interfaces
////////////////////////////

/* 
Interface declaration syntax
<access level> interface <interface-name> extends <super-interfaces> {
    // constants
    // method declarations  
}
*/

// Example - Food:
interface Edible {
    void eat();  // Any class that implements this interface, must implement this method.
}

interface Digestible {
    void digest();
    // Since Java 8, interfaces can have default methods
    default void defaultMethod() {
        IO.println("Hi from default method...");
    }
}

// We can now create a class that implements both of these interfaces.
class Fruit implements Edible, Digestible {
    @Override
    void eat() {
        // ...
    }

    @Override
    void digest() {
        // ...
    }
}

// In Java, a class can extend only one class, but can implement many interfaces:
/*
public class ExampleClass extends ExampleClassParent implements InterfaceOne, InterfaceTwo {
    @Override
    public void interfaceOneMethod() {
    }

    @Override
    public void interfaceTwoMethod() {
    }
}
*/

public static void main() {   
}
