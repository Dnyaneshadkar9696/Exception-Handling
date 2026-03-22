# Exception-Handling

In Java, exceptions handle unexpected runtime events. They are of **three types**:

## 1. Checked Exceptions
**Checked at compile-time** - These exceptions must be either caught using a `try-catch` block or declared using the `throws` keyword in the method signature.

**Examples:**
- `IOException` - Input/Output operations failure
- `SQLException` - Database access errors
- `ClassNotFoundException` - Class not found in classpath
- `FileNotFoundException` - File not found

**Key Points:**
- Must be handled at compile-time
- If not handled, code will not compile
- Use `try-catch` or `throws` to handle these exceptions

## 2. Unchecked Exceptions (Runtime Exceptions)
**Occur at runtime** - These exceptions extend `RuntimeException` and are not checked at compile-time. They usually indicate programming errors or logic flaws.

**Examples:**
- `NullPointerException` - Accessing a null object reference
- `ArithmeticException` - Arithmetic errors like division by zero
- `ArrayIndexOutOfBoundsException` - Accessing invalid array index
- `IllegalArgumentException` - Invalid method arguments
- `NumberFormatException` - Invalid number format conversion

**Key Points:**
- Not required to be caught or declared
- Usually indicate programming bugs
- Should be fixed by correcting the code logic

## 3. Errors
**Serious system-level issues** - These are serious problems that applications should not try to catch. They indicate critical failures in the JVM or system.

**Examples:**
- `OutOfMemoryError` - JVM runs out of memory
- `StackOverflowError` - Stack overflow due to excessive recursion
- `VirtualMachineError` - JVM crashes
- `NoClassDefFoundError` - Class definition not found at runtime

**Key Points:**
- Should not be caught or handled in normal circumstances
- Indicate serious system or JVM failures
- Usually unrecoverable

## Exception Hierarchy

```
Throwable
├── Exception
│   ├── Checked Exceptions (IOException, SQLException, etc.)
│   └── RuntimeException (Unchecked)
│       ├── NullPointerException
│       ├── ArithmeticException
│       └── ...
└── Error
    ├── OutOfMemoryError
    ├── StackOverflowError
    └── ...
```

## How to Run Examples

Compile and run the Java example files:

```bash
javac CheckedExceptionExample.java
java CheckedExceptionExample

javac UncheckedExceptionExample.java
java UncheckedExceptionExample

javac ErrorExample.java
java ErrorExample
```

## Best Practices

1. **Handle Checked Exceptions**: Always handle checked exceptions using try-catch or declare them with throws
2. **Prevent Unchecked Exceptions**: Write defensive code to prevent unchecked exceptions
3. **Don't Catch Errors**: Generally, don't catch Error types as they indicate serious problems
4. **Specific Exception Handling**: Catch specific exceptions rather than generic Exception
5. **Clean Up Resources**: Use try-with-resources for automatic resource management
