import java.lang.reflect.Array;
import java.util.Arrays;

public class ForAscii {

    public static void main(String[] args) {

        byte [] test= {65, 66, 67, 68, 69};
        AsciiCharSequence aascii = new AsciiCharSequence(test);

        System.out.print("Out b from aascii: "+Arrays.toString(aascii.b));
        if (test.equals(aascii.b)) {
            System.out.println("     .... ok");
        } else System.out.println("    .... not ok");

        System.out.println("Вывод aascii length: "+aascii.length());
        System.out.println("Вывод aascii toString: "+aascii.toString());
        System.out.println("Вывод aascii charAt: "+aascii.charAt(3));
    }

}
