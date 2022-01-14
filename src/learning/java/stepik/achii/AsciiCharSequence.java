package learning.java.stepik.achii;

public class AsciiCharSequence implements CharSequence {

    byte[] b;

    //Конструктор
    public AsciiCharSequence (byte[] incomeByteMassive) {

        b= incomeByteMassive;
    }

    @Override
    public String toString () {
       StringBuilder d= new StringBuilder();
        for (int i=0; i<b.length; i++) {
            d.append((char)this.b[i]);

                }
        return d.toString();
    }

    @Override
    public int length() {
        int lengthOfStringed = b.length;
        return lengthOfStringed;
    }

    @Override
    public AsciiCharSequence subSequence(int start, int end) {

        byte[] z= new byte[end-start];
       for (int i=0; i<end-start; i++) {z[i]=b[i+start];}
        return new AsciiCharSequence(z);
    }


    @Override
    public char charAt(int index) {
        return (char)b[index];
    }

}

