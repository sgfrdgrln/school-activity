public class EnumMethodsExample {

    // pre-final
    public static void main(String[] args) {

        Color color1 = Color.RED;
        Color color2 = Color.GREEN;
        Color color3 = Color.RED;

        // values() method - returns an array of the enumerated constants
        Day[] days = Day.values();
        for (Day day : days) {
            System.out.println(day);
        }
        
        // valueOf(String name) method - accepts a string parameter and returns an enumeration constant
        Day monday = Day.valueOf("MONDAY");
        System.out.println("The value of MONDAY is: " + monday);
        
        // ordinal() method - returns an integer that represents the constants' position in the list of constants.
        System.out.println("The ordinal of TUESDAY is: " + Day.TUESDAY.ordinal());
        
        // toString() method - returns the name of the calling constant object
        System.out.println("The name of WEDNESDAY is: " + Day.WEDNESDAY.toString());
        
        // name() method - 
        System.out.println("The name of THURSDAY is: " + Day.THURSDAY.name());

        // compareTo() method
        System.out.println("Comparison using compareTo():");
        System.out.println(color1.compareTo(color2)); // Output: -1 (RED < GREEN)
        System.out.println(color1.compareTo(color3)); // Output: 0 (RED == RED)
        System.out.println(color2.compareTo(color1)); // Output: 1 (GREEN > RED)
        
        // equals() method - returns true if its argument is equal to the calling object's value
        System.out.println("\nComparison using equals():");
        System.out.println(color1.equals(color2)); // Output: false
        System.out.println(color1.equals(color3)); // Output: true
    }
}

// Enum representing different days
enum Day {
    SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

// Enum representing different colors
enum Color {
    RED, GREEN, BLUE;
}