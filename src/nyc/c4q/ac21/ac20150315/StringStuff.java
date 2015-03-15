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

    public static String repeat(char c, int count) {
        String result = "";
        for (int i = 0; i < count; ++i) {
            result += c;
        }
        return result;
    }

    public static void underline(String text, char underlineChar) {
        System.out.println(text);
        String underline = repeat(underlineChar, text.length());
        System.out.println(underline);
    }

    public static void main(String[] args) {
        underline("I love Access Code!", '*');
    }

}
