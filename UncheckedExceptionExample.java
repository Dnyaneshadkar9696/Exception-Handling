/**
 * Demonstrates Unchecked Exceptions (Runtime Exceptions) in Java
 * These exceptions occur at runtime and don't need to be declared or caught
 */
public class UncheckedExceptionExample {

    // Example 1: NullPointerException
    public static void demonstrateNullPointerException() {
        System.out.println("\n=== Example 1: NullPointerException ===");
        try {
            String str = null;
            System.out.println("Attempting to call method on null object...");
            int length = str.length(); // This will throw NullPointerException
            System.out.println("String length: " + length);
        } catch (NullPointerException e) {
            System.out.println("Caught NullPointerException: Cannot call method on null object");
            System.out.println("Fix: Check if object is null before using it");
        }
    }

    // Example 2: ArithmeticException
    public static void demonstrateArithmeticException() {
        System.out.println("\n=== Example 2: ArithmeticException ===");
        try {
            int numerator = 10;
            int denominator = 0;
            System.out.println("Attempting division: " + numerator + " / " + denominator);
            int result = numerator / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
            System.out.println("Fix: Check if denominator is zero before division");
        }
    }

    // Example 3: ArrayIndexOutOfBoundsException
    public static void demonstrateArrayIndexOutOfBoundsException() {
        System.out.println("\n=== Example 3: ArrayIndexOutOfBoundsException ===");
        try {
            int[] numbers = {1, 2, 3, 4, 5};
            System.out.println("Array length: " + numbers.length);
            System.out.println("Attempting to access index 10...");
            int value = numbers[10]; // This will throw ArrayIndexOutOfBoundsException
            System.out.println("Value: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Fix: Ensure array index is within valid range (0 to length-1)");
        }
    }

    // Example 4: IllegalArgumentException
    public static void demonstrateIllegalArgumentException() {
        System.out.println("\n=== Example 4: IllegalArgumentException ===");
        try {
            System.out.println("Calling method with invalid age: -5");
            setAge(-5); // This will throw IllegalArgumentException
        } catch (IllegalArgumentException e) {
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
            System.out.println("Fix: Validate input before processing");
        }
    }

    // Helper method for IllegalArgumentException example
    private static void setAge(int age) {
        if (age < 0 || age > 150) {
            throw new IllegalArgumentException("Age must be between 0 and 150, got: " + age);
        }
        System.out.println("Age set to: " + age);
    }

    // Example 5: NumberFormatException
    public static void demonstrateNumberFormatException() {
        System.out.println("\n=== Example 5: NumberFormatException ===");
        try {
            String invalidNumber = "abc123";
            System.out.println("Attempting to parse: '" + invalidNumber + "'");
            int number = Integer.parseInt(invalidNumber); // This will throw NumberFormatException
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Caught NumberFormatException: " + e.getMessage());
            System.out.println("Fix: Validate string format before parsing");
        }
    }

    // Example 6: StringIndexOutOfBoundsException
    public static void demonstrateStringIndexOutOfBoundsException() {
        System.out.println("\n=== Example 6: StringIndexOutOfBoundsException ===");
        try {
            String text = "Hello";
            System.out.println("String: '" + text + "' (length: " + text.length() + ")");
            System.out.println("Attempting to access character at index 10...");
            char ch = text.charAt(10); // This will throw StringIndexOutOfBoundsException
            System.out.println("Character: " + ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught StringIndexOutOfBoundsException: " + e.getMessage());
            System.out.println("Fix: Check string length before accessing characters");
        }
    }

    // Example 7: Preventing exceptions with defensive programming
    public static void demonstrateDefensiveProgramming() {
        System.out.println("\n=== Example 7: Defensive Programming ===");
        System.out.println("Preventing exceptions through validation:");
        
        // Safe null check
        String str = null;
        if (str != null) {
            System.out.println("String length: " + str.length());
        } else {
            System.out.println("String is null - handled safely");
        }
        
        // Safe division
        int numerator = 10;
        int denominator = 0;
        if (denominator != 0) {
            System.out.println("Result: " + (numerator / denominator));
        } else {
            System.out.println("Cannot divide by zero - handled safely");
        }
        
        // Safe array access
        int[] numbers = {1, 2, 3};
        int index = 10;
        if (index >= 0 && index < numbers.length) {
            System.out.println("Value: " + numbers[index]);
        } else {
            System.out.println("Index out of bounds - handled safely");
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("  UNCHECKED EXCEPTIONS DEMONSTRATION");
        System.out.println("=================================================");
        System.out.println("Unchecked exceptions occur at runtime and");
        System.out.println("usually indicate programming errors.");
        
        // Example 1: NullPointerException
        demonstrateNullPointerException();
        
        // Example 2: ArithmeticException
        demonstrateArithmeticException();
        
        // Example 3: ArrayIndexOutOfBoundsException
        demonstrateArrayIndexOutOfBoundsException();
        
        // Example 4: IllegalArgumentException
        demonstrateIllegalArgumentException();
        
        // Example 5: NumberFormatException
        demonstrateNumberFormatException();
        
        // Example 6: StringIndexOutOfBoundsException
        demonstrateStringIndexOutOfBoundsException();
        
        // Example 7: Defensive Programming
        demonstrateDefensiveProgramming();
        
        System.out.println("\n=================================================");
        System.out.println("All unchecked exception examples completed!");
        System.out.println("Best practice: Prevent these exceptions through");
        System.out.println("proper validation and defensive programming.");
        System.out.println("=================================================");
    }
}
