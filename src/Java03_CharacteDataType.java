public class Java03_CharacteDataType {

    public static void main(String[] args) {
        // Declare and initialize a char variable

        char charValue = 'A'; // A single character enclosed in single quotes

        // Unicode character
        char unicodeChar = '\u03A9'; // Unicode for Greek capital letter Omega (Ω)

        // Escape sequences
        char newlineChar = '\n'; // Newline character
        char tabChar = '\t'; // Tab character

        // Print the values to the console
        System.out.println("Character value: " + charValue);
        System.out.println("Unicode character: " + unicodeChar);
        System.out.println("Newline character: " + newlineChar + "This is on a new line.");
        System.out.println("Tab character: " + tabChar + "This is after a tab.");

        // Convert char to int (ASCII/Unicode value)
        int asciiValue = charValue; // Implicit conversion from char to int
        System.out.println("ASCII/Unicode value of '" + charValue + "': " + asciiValue);

        // Convert int to char
        char charFromInt = (char) 66; // Explicit conversion from int to char (66 is 'B')
        System.out.println("Character from ASCII/Unicode value 66: " + charFromInt);
    }
}