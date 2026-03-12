////////////////////////////
// Lambda Expressions
////////////////////////////

// New to Java 8 are lambda expressions. Lambdas are more commonly found
// in functional programming languages, which means they are methods which
// can be created without belonging to a class, passed around as if it were
// itself an object, and executed on demand.

// Final note - lambdas must implement a functional interface. A functional
// interface is one which has only a single abstract method declared. It can
// have any number of default methods. Lambda expressions can be used as an
// instance of that functional interface. Any interface meeting the requirements
// is treated as a functional interface. 

public static void main() {   
    // Lambda declaration syntax:
    // <zero or parameters> -> <expression body or statement block>

    // We will use this hashmap in our examples below.
    Map<String, String> planets = Map.of(
        "Mercury", "87.969",
        "Venus", "224.7",
        "Earth", "365.2564",
        "Mars", "687",
        "Jupiter", "4,332.59",
        "Saturn", "10,759",
        "Uranus", "30,688.5",
        "Neptune", "60,182");

    // Lambdas with zero parameters using the Supplier functional interface
    // from java.util.function.Supplier. The actual lambda expression is
    // what comes after numPlanets =.
    Supplier<String> numPlanets = () -> Integer.toString(planets.size());
    IO.println("Number of planets: %s%n%n".formatted(numPlanets.get()));

    // Lambda with one parameter and using the Consumer functional interface
    // from java.util.function.Consumer. This is because planets is a Map,
    // which implements both Collection and Iterable. The forEach used here,
    // found in iterable, applies the lambda expression to each member of
    // the collection. The default implementation of forEach behaves as if:
    /*
        for (T t : this)
            action.accept(t);
    */

    // The actual lambda expression is the parameter passed to forEach.
    planets.keySet().forEach((p) -> IO.println(p));

    // If you are only passing a single argument, then the above can also be
    // written as (note absent parentheses around p):
    planets.keySet().forEach(p -> IO.println(p));

    // Tracing the above, we see that planets is a HashMap, keySet() returns
    // a set of its keys, forEach applies each element as the lambda
    // expression of: (parameter p) -> IO.println(p). Each time, the element
    // is said to be "consumed" and the statement(s) referred to in the lambda
    // body is applied. Remember the lambda body is what comes after the ->.

    // The above without use of lambdas would look more traditionally like:
    for (String planet : planets.keySet()) {
        IO.println(planet);
    }

    // This example differs from the above in that a different forEach
    // implementation is used: the forEach found in the HashMap class
    // implementing the Map interface. This forEach accepts a BiConsumer,
    // which generically speaking is a fancy way of saying it handles 
    // the set of each key->value pairs. This default implementation 
    // behaves as if:
    /*
    for (Map.Entry<K,V> entry : map.entrySet())
        action.accept(entry.getKey(), entry.getValue());
    */

    // The actual lambda expression is the parameter passed to forEach.
    String orbits = "%s orbits the Sun in %s Earth days.";
    planets.forEach((k, v) -> IO.println(orbits.formatted(k, v)));

    // The above, without use of lambdas would look more traditionally like:
    for (String planet : planets.keySet()) {
        IO.println(orbits.formatted(planet, planets.get(planet)));
    }

    // Or, if following more closely the specification provided by the
    // default implementation:
    for (Map.Entry<String, String> planet : planets.entrySet()) {
        IO.println(orbits.formatted(planet.getKey(), planet.getValue()));
    }

    // These examples cover only the very basic use of lambdas. It might not
    // seem like much or even very useful, but remember that a lambda can be
    // created as an object that can later be passed as parameters to other methods.
}
