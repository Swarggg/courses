import java.util.Arrays;

public class AsciiCharSequence implements CharSequence {

    byte[] b;

    //Конструктор
    public AsciiCharSequence (byte[] incomeByteMassive) {

        b= incomeByteMassive;
    }

    @Override
    public String toString () {
        String stringedByteMassive="";
        for (int i=0; i<b.length; i++) {

            stringedByteMassive += Byte.toString(b[i]);
                }
        return stringedByteMassive;
    }

    @Override
    public int length() {
        int lengthOfStringed = b.length;

        return lengthOfStringed;
    }

    @Override
    public char charAt(int index) {
        return 0;
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        return null;
    }




}

