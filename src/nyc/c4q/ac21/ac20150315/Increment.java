package nyc.c4q.ac21.ac20150315;

/**
 * Created by samuel on 2015-03-15.
 */
public class Increment {

    public static void main(String[] args) {
        int i = 17;
        System.out.println(i);

        int x = i++;  // postincrement
        System.out.println(i);
        System.out.println("x = " + x);

        int y = ++i;  // preincrement
        System.out.println(i);
        System.out.println("y = " + y);
    }
}
