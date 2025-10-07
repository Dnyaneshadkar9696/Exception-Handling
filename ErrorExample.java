/**
 * Demonstrates Errors in Java
 * Errors are serious system-level problems that applications should not catch
 */
public class ErrorExample {

    // Example 1: StackOverflowError
    public static void demonstrateStackOverflowError() {
        System.out.println("\n=== Example 1: StackOverflowError ===");
        System.out.println("WARNING: This will cause a StackOverflowError!");
        System.out.println("Uncommenting this code will crash the JVM.");
        System.out.println("\nCaused by: Infinite recursion with no base case");
        System.out.println("Code example:");
        System.out.println("  public static void infiniteRecursion() {");
        System.out.println("      infiniteRecursion(); // Calls itself indefinitely");
        System.out.println("  }");
        System.out.println("\nFix: Always provide a proper base case for recursion");
        
        // Uncomment to see actual StackOverflowError (will crash the program)
        // try {
        //     infiniteRecursion();
        // } catch (StackOverflowError e) {
        //     System.out.println("Caught StackOverflowError (rare to catch)");
        // }
    }

    // Helper method for StackOverflowError (commented for safety)
    // private static void infiniteRecursion() {
    //     infiniteRecursion(); // No base case - will cause StackOverflowError
    // }

    // Example 2: OutOfMemoryError simulation
    public static void demonstrateOutOfMemoryError() {
        System.out.println("\n=== Example 2: OutOfMemoryError ===");
        System.out.println("WARNING: This can cause an OutOfMemoryError!");
        System.out.println("Uncommenting this code may crash the JVM.");
        System.out.println("\nCaused by: Attempting to allocate more memory than available");
        System.out.println("Code example:");
        System.out.println("  List<byte[]> list = new ArrayList<>();");
        System.out.println("  while (true) {");
        System.out.println("      list.add(new byte[1024 * 1024]); // 1MB each");
        System.out.println("  }");
        System.out.println("\nFix: Manage memory efficiently, avoid memory leaks");
        
        // Uncomment to see actual OutOfMemoryError (will crash the program)
        // try {
        //     List<byte[]> list = new ArrayList<>();
        //     while (true) {
        //         list.add(new byte[1024 * 1024]); // Allocate 1MB arrays
        //     }
        // } catch (OutOfMemoryError e) {
        //     System.out.println("Caught OutOfMemoryError (rare to catch)");
        // }
    }

    // Example 3: Demonstrating proper recursion (to prevent StackOverflowError)
    public static void demonstrateProperRecursion() {
        System.out.println("\n=== Example 3: Proper Recursion (Preventing StackOverflowError) ===");
        System.out.println("Calculating factorial of 5 using proper recursion:");
        int result = factorial(5);
        System.out.println("5! = " + result);
        System.out.println("This recursion has a base case, so no StackOverflowError");
    }

    // Proper recursive method with base case
    private static int factorial(int n) {
        // Base case prevents infinite recursion
        if (n <= 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    // Example 4: NoClassDefFoundError simulation
    public static void demonstrateNoClassDefFoundError() {
        System.out.println("\n=== Example 4: NoClassDefFoundError ===");
        System.out.println("This error occurs when a class was available at compile-time");
        System.out.println("but not found at runtime.");
        System.out.println("\nCommon causes:");
        System.out.println("  - Missing JAR files in classpath");
        System.out.println("  - Class initialization failure");
        System.out.println("  - Static initializer throws exception");
        System.out.println("\nExample scenario:");
        System.out.println("  // Class compiled successfully");
        System.out.println("  // But JAR removed from classpath before running");
        System.out.println("  MyClass obj = new MyClass(); // NoClassDefFoundError");
        System.out.println("\nFix: Ensure all required classes are in classpath at runtime");
    }

    // Example 5: VirtualMachineError info
    public static void demonstrateVirtualMachineError() {
        System.out.println("\n=== Example 5: VirtualMachineError ===");
        System.out.println("VirtualMachineError is thrown when JVM has serious problems:");
        System.out.println("  - OutOfMemoryError");
        System.out.println("  - StackOverflowError");
        System.out.println("  - InternalError");
        System.out.println("  - UnknownError");
        System.out.println("\nThese indicate JVM-level failures and should not be caught");
        System.out.println("in normal application code.");
    }

    // Example 6: Why you shouldn't catch Errors
    public static void whyNotCatchErrors() {
        System.out.println("\n=== Example 6: Why NOT to Catch Errors ===");
        System.out.println("Reasons NOT to catch Error types:");
        System.out.println("  1. They indicate serious system problems");
        System.out.println("  2. Application cannot recover from them");
        System.out.println("  3. Catching them may mask serious issues");
        System.out.println("  4. JVM may be in an unstable state");
        System.out.println("  5. Best practice is to let them propagate and crash");
        System.out.println("\nBad practice example:");
        System.out.println("  try {");
        System.out.println("      // some code");
        System.out.println("  } catch (Error e) { // DON'T DO THIS!");
        System.out.println("      // Error should not be caught");
        System.out.println("  }");
    }

    // Example 7: Exception vs Error
    public static void exceptionVsError() {
        System.out.println("\n=== Example 7: Exception vs Error ===");
        System.out.println("\nException:");
        System.out.println("  - Conditions that applications can catch");
        System.out.println("  - Can be recovered from");
        System.out.println("  - Should be handled appropriately");
        System.out.println("  - Examples: IOException, SQLException");
        System.out.println("\nError:");
        System.out.println("  - Serious problems in the JVM");
        System.out.println("  - Usually unrecoverable");
        System.out.println("  - Should NOT be caught");
        System.out.println("  - Examples: OutOfMemoryError, StackOverflowError");
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("           ERRORS DEMONSTRATION");
        System.out.println("=================================================");
        System.out.println("Errors are serious system-level problems that");
        System.out.println("applications should NOT catch or handle.");
        
        // Example 1: StackOverflowError
        demonstrateStackOverflowError();
        
        // Example 2: OutOfMemoryError
        demonstrateOutOfMemoryError();
        
        // Example 3: Proper recursion
        demonstrateProperRecursion();
        
        // Example 4: NoClassDefFoundError
        demonstrateNoClassDefFoundError();
        
        // Example 5: VirtualMachineError
        demonstrateVirtualMachineError();
        
        // Example 6: Why not catch Errors
        whyNotCatchErrors();
        
        // Example 7: Exception vs Error
        exceptionVsError();
        
        System.out.println("\n=================================================");
        System.out.println("All error examples completed!");
        System.out.println("Remember: Errors should NOT be caught in normal code.");
        System.out.println("They indicate serious system problems.");
        System.out.println("=================================================");
    }
}
