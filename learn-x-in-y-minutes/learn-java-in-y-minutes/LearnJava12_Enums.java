////////////////////////////
// Enum Types
////////////////////////////

// An enum type is a special data type that enables for a variable to be a set
// of predefined constants. The variable must be equal to one of the values
// that have been predefined for it. Because they are constants, the names of
// an enum type's fields are in uppercase letters. In the Java programming
// language, you can define an enum type by using the enum keyword. For example,
// you would specify a days-of-the-week enum type as:
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY,
    THURSDAY, FRIDAY, SATURDAY
}

// We can use our enum Day like this:
static class EnumTest {
    // Variable enum
    Day day;

    EnumTest(Day day) {
        this.day = day;
    }

    public void tellItLikeItIs() {
        switch (day) {
        case MONDAY -> IO.println("Mondays are bad.");
        case FRIDAY -> IO.println("Fridays are better.");
        case SATURDAY, SUNDAY -> IO.println("Weekends are best.");
        default -> IO.println("Midweek days are so-so.");
        }
    }
}

public static void main() {   
    EnumTest firstDay = new EnumTest(Day.MONDAY);
    firstDay.tellItLikeItIs();  // => Mondays are bad.
    EnumTest thirdDay = new EnumTest(Day.WEDNESDAY);
    thirdDay.tellItLikeItIs();  // => Midweek days are so-so.
}

// Enum types are much more powerful than we show above.
// The enum body can include methods and other fields.