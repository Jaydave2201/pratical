public class practical13 {
    public static void main(String[] args) {

        String str = "Hello, World!";
        char firstChar = str.charAt(0);
        System.out.println("First character of the string: " + firstChar);

        boolean containsWorld = str.contains("World");
        System.out.println("Does the string contain 'World'? " + containsWorld);

        String formattedString = String.format("The string \"%s\" has length %d", str, str.length());
        System.out.println(formattedString);

        int lengthOfString = str.length();
        System.out.println("Length of the string: " + lengthOfString);

        String[] parts = str.split(",");
        System.out.println("Splitting the string by comma:");
        for (String part : parts) {
            System.out.println(part.trim());
        }
    }
}
