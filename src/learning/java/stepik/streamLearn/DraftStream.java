package learning.java.stepik.streamLearn;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DraftStream {
    static String inputFile = "src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileSource";
    static String outputFile = "src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileTarget";

    public static void main(String[] args) throws IOException {

        copyFileContent(inputFile, outputFile);
        //copyFileContent(inputFile, outputFile);

    }// main close

    static void copyFileContent (String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)){

            byte[] byteBuffer1 = fis.readAllBytes();
            byte[] byteBuffer2 = {0x33, 0x45, 0x01};
            int rotatedNumber = Integer.rotateLeft(byteBuffer2[0], 1);
            int xoredNumber = byteBuffer2[0]^rotatedNumber;

            String rotatedNumberS = Integer.toBinaryString(rotatedNumber);
            String number = Integer.toBinaryString(byteBuffer2[0]);
            String xxoredNumberS = Integer.toBinaryString(xoredNumber);

            System.out.println("namber:          "+number);
            System.out.println("rotated namber: "+rotatedNumberS);
            System.out.println("xored number:   "+xxoredNumberS);


            //System.out.println("checkSum: "+ checkSum);
            //byte[] byteBuffer2 = { 0b00100000/*space, bin*/, 35/*#, dec*/, 040/*space, oct(start from 0)*/, 0x21/*!, hex*/};

            fos.write(byteBuffer1);
            System.out.println("file content is copied");
            //fos.write(byteBuffer2);

        }




    }

}// DraftStream close
