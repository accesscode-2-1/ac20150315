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

    public static void printBoxTop(String text) {
        System.out.println("+" + repeat('-', text.length() + 2) + "+");
    }

    public static void printInBox(String text) {
        printBoxTop(text);
        System.out.println("| " + text + " |");
        printBoxTop(text);
    }

    public static String pad(String text, int length, char padChar, boolean left) {
        String padding = repeat(padChar, length - text.length());
        if (left)
            return padding + text;
        else
            return text + padding;
    }

    public static String pad(String text, int length, char padChar) {
        return pad(text, length, padChar, false);
    }

    public static String substring(String text, int start, int end) {
        String result = "";
        for (int i = start; i < end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    public static String substring(String text, int start) {
        return substring(text, start, text.length());
    }

    public static String swapHalves(String text) {
        int midpoint = text.length() / 2;
        return text.substring(midpoint) + text.substring(0, midpoint);
    }

    public static void printTriangle(String text) {
        for (int i = 1; i <= text.length(); i++) {
            System.out.println(text.substring(0, i));
        }
    }

    public static void printUpperTriangle(String text) {
        int len = text.length();
        for (int i = 0; i < len; i++) {
            // String substr = text.substring(i);
            // String paddedSubstr = repeat('#', i) + substr;
            // System.out.println(paddedSubstr);

            System.out.println(pad(text.substring(i), len, ' ', true));
        }
    }

    public static void main(String[] args) {
        printUpperTriangle("Hello, world!");
    }

}
