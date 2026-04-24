public class Java05_StringDataType {
    public static void main(String[] args) {
        /*
         * String is a sequence of characters and is used to represent text in Java. It
         * is a reference type and is immutable, meaning that once a String object is
         * created, it cannot be changed. Here are some examples of how to use the
         * String data type in Java:
         */

        String name = "John Doe";
        String greeting = "Hello, " + name + "!";
        System.out.println(greeting);

        String multiLineString = "This is a multi-line string.\nIt can span multiple lines.";
        System.out.println(multiLineString);

        String upperCaseName = name.toUpperCase(); // Convert the name to uppercase
        System.out.println("Uppercase Name: " + upperCaseName);

        String lowerCaseName = name.toLowerCase(); // Convert the name to lowercase
        System.out.println("Lowercase Name: " + lowerCaseName);

        int nameLength = name.length(); // Get the length of the name string
        System.out.println("Length of Name: " + nameLength);
    }
}
