public class Java02_NumberDataType {
    public static void main(String[] args) {
        // Declare and initialize variables of different number data types

        // Integer types
        byte byteValue = 100; // 8-bit signed integer
        short shortValue = 30000; // 16-bit signed integer
        int intValue = 2000000000; // 32-bit signed integer
        long longValue = 9000000000000000000L; // 64-bit signed integer; note the 'L' suffix for long literals

        // Floating-point types
        float floatValue = 3.14f; // 32-bit floating-point number; note the 'f' suffix for float literals
        double doubleValue = 3.141592653589793; // 64-bit floating-point number

        // Literals
        int decimalLiteral = 42; // Decimal literal
        int hexadecimalLiteral = 0x2A; // Hexadecimal literal (42 in decimal)
        int octalLiteral = 052; // Octal literal (42 in decimal)
        int binaryLiteral = 0b101010; // Binary literal (42 in decimal)

        // Underscored literals for better readability
        int largeInt = 1_000_000; // Underscored decimal literal
        long largeLong = 9_000_000_000_000_000_000L; // Underscored long literal

        // Print the values to the console
        System.out.println("Byte value: " + byteValue);
        System.out.println("Short value: " + shortValue);
        System.out.println("Int value: " + intValue);
        System.out.println("Long value: " + longValue);
        System.out.println("Float value: " + floatValue);
        System.out.println("Double value: " + doubleValue);
        System.out.println("Decimal literal: " + decimalLiteral);
        System.out.println("Hexadecimal literal: " + hexadecimalLiteral);
        System.out.println("Octal literal: " + octalLiteral);
        System.out.println("Binary literal: " + binaryLiteral);
        System.out.println("Large int with underscores: " + largeInt);
        System.out.println("Large long with underscores: " + largeLong);

        // Conversion between number data types
        int intFromByte = byteValue; // Implicit widening conversion (byte to int)
        byte byteFromInt = (byte) intValue; // Explicit narrowing conversion (int to byte)

        System.out.println("Int from byte: " + intFromByte);
        System.out.println("Byte from int (after narrowing): " + byteFromInt);
    }
}
