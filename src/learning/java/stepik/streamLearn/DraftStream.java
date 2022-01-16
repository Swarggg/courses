package learning.java.stepik.streamLearn;

import java.io.*;

public class DraftStream {
    static String inputFile = "src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileSource";
    static String outputFile = "src\\learning\\java\\stepik\\streamLearn\\SimpleTextFileTarget";

    public static void main(String[] args) throws IOException {

        System.out.println("CheckSum="+checkSumOfStream(getInputStream2(inputFile, outputFile)));

        System.out.println("===========================================================");

        System.out.println("CheckSum="+checkSumOfStream2(getInputStream2(inputFile, outputFile)));

    }// main close


    static InputStream getInputStream (String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile)){
            InputStream inputStream = new FileInputStream(inputFile);
            return inputStream;
        }
    }


    static InputStream getInputStream2 (String inputFile, String outputFile) throws IOException {
        byte[] testByteMassive = {0x33, 0x45, 0x01};
        InputStream inputStream = new ByteArrayInputStream(testByteMassive);
            return inputStream;
    }

    public static int checkSumOfStream (InputStream inputStream) throws IOException {
        int checkSum=0;
        int byteFromStream;

        try {
            while ((byteFromStream=inputStream.read())!=-1) {
                checkSum = Integer.rotateLeft(checkSum, 1)^byteFromStream;
                System.out.println("OcheckSum ="+checkSum);
            }

        } catch (IOException ioe) {
            throw new IOException();
        }
        return checkSum;
    }



    public static int checkSumOfStream2 (InputStream inputStream) throws IOException {
        int checkSum=0;

        try {
        int quantityByteInStream = inputStream.available();
        System.out.println("inputStream.available="+quantityByteInStream);

        byte[] byteBuffer2 = new byte[quantityByteInStream];
        inputStream.read(byteBuffer2, 0, quantityByteInStream);

        //checkSum = byteBuffer2[1];

        if (quantityByteInStream>0) {
            checkSum = byteBuffer2[0];
            System.out.println("checkSum"+checkSum);
                for (int i = 1; i < quantityByteInStream; i++) {

                    int rotatedCheckSum = Integer.rotateLeft(checkSum, 1);
                    checkSum = rotatedCheckSum ^ byteBuffer2[i];
                    System.out.println("checkSum"+checkSum);
                }
                return checkSum;

        }
        } catch (IOException io) {
            throw new IOException();
        }
        return checkSum;
    }



    /*
    static void copyFileContent (String inputFile, String outputFile) throws IOException {
        try (FileInputStream fis = new FileInputStream(inputFile);
             FileOutputStream fos = new FileOutputStream(outputFile)){

            byte[] byteBuffer1 = fis.readAllBytes();
            InputStream inputStream = new FileInputStream(inputFile);
            //byte[] byteBuffer2 = {0x33, 0x45, 0x01};



                int quantityByteInStream = inputStream.available();

            byte[] byteBuffer2 = new byte[quantityByteInStream+1];

                inputStream.read(byteBuffer2, 0, quantityByteInStream);

                for (int z = 0; z < quantityByteInStream + 1; z++) {
                    System.out.println("байт из потока=" + byteBuffer2[z]);
                }

                int checkSum = byteBuffer2[0];
                for (int i = 1; i < quantityByteInStream; i++) {
                    int rotatedCheckSum = Integer.rotateLeft(checkSum, 1);
                    checkSum = rotatedCheckSum ^ byteBuffer2[i];
                }


/*
             //int rotatedNumber = Integer.rotateLeft(byteBuffer2[0], 1);
            //int xoredNumber = byteBuffer2[0]^rotatedNumber;

            String rotatedNumberS = Integer.toBinaryString(rotatedNumber);
            String number = Integer.toBinaryString(byteBuffer2[0]);
            String xxoredNumberS = Integer.toBinaryString(xoredNumber);

            System.out.println("namber:          "+number);
            System.out.println("rotated namber: "+rotatedNumberS);
            System.out.println("xored number:   "+xxoredNumberS);


  */
            //System.out.println("checkSum: "+ checkSum);
            //byte[] byteBuffer2 = { 0b00100000/*space, bin*/, 35/*#, dec*/, 040/*space, oct(start from 0)*/, 0x21/*!, hex*/};
/*
            fos.write(byteBuffer1);
            System.out.println("file content is copied");
            //fos.write(byteBuffer2);

        }

    }
*/

}// DraftStream close
