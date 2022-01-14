package learning.java.stepik.streamLearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DraftStream {
    static String inputFile = "G:\\IntelliJ\\HelloWorld\\src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileSource";
    static String outputFile = "G:\\IntelliJ\\HelloWorld\\src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileTarget";

    public static void main(String[] args) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)){

            byte[] byteBuffer1 = fis.readAllBytes();
            byte[] byteBuffer2 = { 0b00100000/*space, bin*/, 35/*#, dec*/,  0x21/*!, hex*/};

            fos.write(byteBuffer1);
            fos.write(byteBuffer2);

        }
    }

}
