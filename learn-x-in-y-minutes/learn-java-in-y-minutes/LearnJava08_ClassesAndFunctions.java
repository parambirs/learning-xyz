////////////////////////////
// Classes and Functions
////////////////////////////

public static void main() {
    
    IO.println("\n->Classes & Functions");

    // (definition of the Bicycle class follows)

    // Use new to instantiate a new class
    Bicycle trek = new Bicycle();

    // Call object methods
    trek.speedUp(3);    // You should always use setter and getter methods
    trek.setCadence(100);

    // toString() returns this Object's string representation
    IO.println("trek info: " + trek.toString());
}

private static class TestInitialization {
    // Double-brace initialization
    // Before Java 11, the Java language had no syntax for how to create
    // static Collections in an easy way. Usually you end up like this:
    private static final Set<String> COUNTRIES = new HashSet<String>();
    static {
        COUNTRIES.add("DENMARK");
        COUNTRIES.add("SWEDEN");
        COUNTRIES.add("FINLAND");
    }

    // There's a nifty way to achieve the same thing,
    // by using something that is called double-brace initialization.
    private static final Set<String> COUNTRIES_DOUBLE_BRACE =
        new HashSet<String>() {{
            add("DENMARK");
            add("SWEDEN");
            add("FINLAND");
        }};

    // The first brace is creating a new Anonymous Inner Class and the 
    // second one declares an instance initializer block. This block
    // is called when the anonymous inner class is created.
    // This does not only work for Collections, it works for all
    // non-final classes.

    // Another option was to initialize the collection from an array,
    // using Arrays.asList() method:
    private static final List<String> COUNTRIES_AS_LIST =
        Arrays.asList("SWEDEN", "DENMARK", "NORWAY");
    // This has one catch: the list we get is internally backed by the array,
    // and since arrays can't change their size, the list backed by the array
    // is not resizable, which means we can't add new elements to it:
    public static void main(String[] args) {
        COUNTRIES_AS_LIST.add("FINLAND");   // throws UnsupportedOperationException!
        // However, we can replace elements by index, just like in array:
        COUNTRIES_AS_LIST.set(1, "FINLAND");
        IO.println("COUNTRIES_AS_LIST");    // => [SWEDEN, FINLAND, NORWAY]
    }

    // The resizing problem can be circumvented 
    // by creating another Collection from the list:
    private static final Set<String> COUNTRIES_SET =
        new HashSet<>(Arrays.asList("SWEDEN", "DENMARK", "NORWAY"));
    // It's perfectly fine to add anything to the set of countries now.
}

private static class TestJava11Initialization {
    // Since Java 11, there is a convenient option to initialize collections:
    // Set.of() and List.of() methods.
    private static final Set<String> COUNTRIES =
        Set.of("SWEDEN", "DENMARK", "NORWAY");

    // There is a massive catch, though: lists and sets initialized like this
    // 1) are immutable
    // 2) can't contain null elements (even check for null element fails)!
    public static void main(String[] args) {
        COUNTRIES.add("FINLAND");   // throws UnsupportedOperationException
        COUNTRIES.remove("NORWAY"); // throws UnsupportedOperationException
        COUNTRIES.contains(null);   // throws NullPointerException
    }

    private static final Set<String> COUNTRIES_WITH_NULL =
        Set.of("SWEDEN", null, "NORWAY");   // throws NullPointerException
}

// You can include other, non-public outer-level classes in a .java file,
// but it is not good practice. Instead, split classes into separate files.

/* Class declaration syntax:
<public/private/protected> class <class name> {
    // data fields, constructors, functions all inside.
    // functions are called methods in Java.  
}
*/
static class Bicycle {
    // Bicycle's fields/variables
    public int cadence; // public: can be accessed from anywhere
    private int speed;  // private: only accessible from within the class
    protected int gear; // protected: accessible from the class and subclasses
    String name;        // default: only accessible from within this package
    static String className;  

    // Static block
    // Java has no implementation of static constructors, but
    // has a static block that can be used to initialize static variables.
    // This block will be executed when the class is loaded.
    static {
        className = "Bicycle";
    }

    // Constructors are a way of creating classes
    // This is a constructor
    public Bicycle() {
        // You can also call another constructor:
        // this(1, 50, 5, "Bontrager");
        gear = 1;
        cadence = 50;
        speed = 5;
        name = "Bontrager";
    }

    // This is a constructor that takes arguments
    public Bicycle(int startCadence, int startSpeed, int startGear, String name) {
        this.gear = startGear;
        this.cadence = startCadence;
        this.speed = startSpeed;
        this.name = name;
    }

    // Method syntax:
    // <public/private/protected> <return type> <function name>(<args>)

    // Java classes often implement getters and setters for their fields

    // Method declaration syntax:
    // <access modifier> <return type> <method name>(<args>)
    public int getCadence() {
        return cadence;
    }    

    // void methods require no return statement
    public void setCadence(int newValue) {
        cadence = newValue;
    }

    public void setGear(int newValue) {
        gear = newValue;
    }

    public void speedUp(int increment) {
        speed += increment;
    }

    public void slowDown(int decrement) {
        speed -= decrement;
    }

    public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    // Method to display the attribute values of this Object.
    @Override // Inherited from the Object class.
    public String toString() {
        return "gear: " + gear + " cadence: " + cadence + " speed: " + speed +
            " name: " + name;
    }
}

// PennyFarthing is a subclass of Bicycle
class PennyFarthing extends Bicycle {
    // (Penny Farthings are those bicycles with the big front wheel. They have no gears.)

    public PennyFarthing(int startCadence, int startSpeed) {
        // Call the parent constructor with super
        super(startCadence, startSpeed, 0, "PennyFarthing");
    }

    // You should mark a method you're overriding with an @annotation.
    // To learn more about what annotations are and their purpose check this
    // out: http://docs.oracle.com/javase/tutorial/java/annotations/
    @Override
    public void setGear(int gear) {
        this.gear = 0;
    }
}

// Object casting
// Since PennyFarthing class is extending the Bicycle class, we can say
// a PennyFarthing is a Bicycle and write:
// Bicycle bicycle = new PennyFarthing();
// This is called object casting where an object is taken for another one. There
// are lots of details and deals with some more intermediate concepts here:
// https://docs.oracle.com/javase/tutorial/java/IandI/subclasses.html