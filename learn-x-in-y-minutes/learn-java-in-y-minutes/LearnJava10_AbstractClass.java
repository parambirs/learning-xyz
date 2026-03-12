////////////////////////////
// Abstract Classes
////////////////////////////

/*
Abstract class declaration syntax:
<access level> abstract class <abstract-class-name> extends <super-abstract-classes> {
    // constants and variables
    // method declarations
}
*/

// Abstract classes cannot be instantiated.
// Abstract methods may define abstract methods.
// Abstract methods have no body and are marked abstract.
// Non-abstract child classes must @Override all abstract methods
//      from their super-classes.

abstract class Animal {
    private int age;

    abstract void makeSound();

    // Method can have a body
    void eat() {
        IO.println("I'm an animal and I am eating.");
        // Note: we can access private variables here
        age = 30;
    }

    void printAge() {
        IO.println(age);
    }

    // abstract classes can have main method
    public static void main(String[] args) {
        IO.println("I'm abstract!");
    }
}

class Dog extends Animal {
    // Override the abstract method in the abstract superclass
    @Override
    void makeSound() {
        IO.println("Bark!");
        // age = 30;    ==> ERROR! age is private to Animal
    }

    // Note: You will get an error if you used the
    // @Override annotation here, since java doesn't allow
    // overriding of static methods.
    // What is happening here is called METHOD HIDING.
    public static void main(String[] args) {
        Dog pluto = new Dog();
        pluto.makeSound();
        pluto.eat();
        pluto.printAge();
    }
}

// Final Classes

/*
Final class declaration syntax
<access level> final <final-class-name> {
    // constants and variables
    // method declarations
}
*/

// Final classes are classes that cannot be inherited from and are therefore a
// final child. In a way, final classes are the opposite of abstract classes
// because abstract classes must be extended, but final classes cannot be extended.
final class SaberToothedCat extends Animal {
    // Note: still have to override the abstract methods in the abstract parent class.
    @Override
    void makeSound() {
        IO.println("Roar");
    }
}

// Final methods
abstract class Mammal {
    // final method syntax:
    // <access modifier> final <return type> <function name>(<args>)

    // Final methods, like, final classes cannot be overridden by a child
    // class, and are therefore the final implementation of the method.
    final boolean isWarmBlooded() {
        return true;
    }
}

public static void main() {   
    
}
