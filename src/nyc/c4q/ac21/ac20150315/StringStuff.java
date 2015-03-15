package nyc.c4q.ac21.ac20150315;

public class StringStuff {

    /**
     * @param input
     *   The string to reverse.
     * @return
     *   A new string constructed by reversing `input`.
     */
    public static String reverse(String input) {
        int numChars = input.length();
        String result = "";
        for (int i = numChars - 1; i >= 0; i--) {
            result += input.charAt(i);
        }
        return result;
    }

    /**
     * Prints a string reversed, i.e. back to front.
     */
    public static void printReverse(String input) {
        System.out.println(reverse(input));
    }

    public static void main(String[] args) {
        printReverse("Hello, world!");
    }

}
