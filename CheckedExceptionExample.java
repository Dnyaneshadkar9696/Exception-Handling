import java.io.*;
import java.sql.*;

/**
 * Demonstrates Checked Exceptions in Java
 * Checked exceptions must be handled at compile-time using try-catch or throws
 */
public class CheckedExceptionExample {

    // Example 1: IOException - Handling with try-catch
    public static void readFileWithTryCatch() {
        System.out.println("\n=== Example 1: IOException with try-catch ===");
        BufferedReader reader = null;
        try {
            // Attempting to read a file that may not exist
            reader = new BufferedReader(new FileReader("nonexistent.txt"));
            String line = reader.readLine();
            System.out.println("File content: " + line);
        } catch (FileNotFoundException e) {
            System.out.println("Caught FileNotFoundException: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Caught IOException: " + e.getMessage());
        } finally {
            // Clean up resources
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException e) {
                System.out.println("Error closing reader: " + e.getMessage());
            }
        }
    }

    // Example 2: IOException - Using throws keyword
    public static void readFileWithThrows() throws IOException {
        System.out.println("\n=== Example 2: IOException with throws ===");
        // This method declares that it throws IOException
        // Caller must handle this exception
        BufferedReader reader = new BufferedReader(new FileReader("example.txt"));
        String line = reader.readLine();
        System.out.println("File content: " + line);
        reader.close();
    }

    // Example 3: Creating and writing to a file (proper exception handling)
    public static void writeToFile() {
        System.out.println("\n=== Example 3: Writing to file with proper handling ===");
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
            // try-with-resources automatically closes the resource
            writer.write("Hello, this is a test file for checked exceptions!");
            writer.newLine();
            writer.write("This demonstrates proper exception handling.");
            System.out.println("Successfully wrote to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Example 4: SQLException simulation
    public static void simulateSQLException() {
        System.out.println("\n=== Example 4: SQLException example ===");
        try {
            // Simulating a database connection error
            throw new SQLException("Database connection failed", "08001", 1045);
        } catch (SQLException e) {
            System.out.println("Caught SQLException:");
            System.out.println("  Message: " + e.getMessage());
            System.out.println("  SQL State: " + e.getSQLState());
            System.out.println("  Error Code: " + e.getErrorCode());
        }
    }

    // Example 5: ClassNotFoundException
    public static void demonstrateClassNotFoundException() {
        System.out.println("\n=== Example 5: ClassNotFoundException ===");
        try {
            // Attempting to load a class that doesn't exist
            Class.forName("com.nonexistent.ClassName");
        } catch (ClassNotFoundException e) {
            System.out.println("Caught ClassNotFoundException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        System.out.println("=================================================");
        System.out.println("    CHECKED EXCEPTIONS DEMONSTRATION");
        System.out.println("=================================================");
        System.out.println("Checked exceptions must be handled at compile-time");
        System.out.println("using try-catch or throws keyword.");
        
        // Example 1: IOException with try-catch
        readFileWithTryCatch();
        
        // Example 2: IOException with throws (wrapped in try-catch here)
        try {
            readFileWithThrows();
        } catch (IOException e) {
            System.out.println("Caught exception from readFileWithThrows: " + e.getMessage());
        }
        
        // Example 3: Writing to file
        writeToFile();
        
        // Example 4: SQLException
        simulateSQLException();
        
        // Example 5: ClassNotFoundException
        demonstrateClassNotFoundException();
        
        System.out.println("\n=================================================");
        System.out.println("All checked exception examples completed!");
        System.out.println("=================================================");
    }
}
