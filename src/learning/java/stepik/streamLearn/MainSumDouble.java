package learning.java.stepik.streamLearn;
/*
Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных
 в тексте вещественных чисел с точностью до шестого знака после запятой.
 Числом считается последовательность символов, отделенная от окружающего текста пробелами или
  переводами строк и успешно разбираемая методом Double.parseDouble.



* */


import java.io.*;
import java.util.Scanner;

public class MainSumDouble {
    static byte[] byteArr1 = {49, 32, 50, 32, 51, 10}; //1 2 3  Output 1: 6.000000
    static byte[] byteArr2 = {97, 49, 32, 98, 50, 32, 99, 51, 10}; //a1 b2 c3 Output 2: 0.000000
    static byte[] byteArr3 = {45, 49, 101, 51, 10, 49, 56, 32, 46, 49, 49, 49, 32, 49, 49, 98, 98, 98};
    static String string1 = "1 2 3";
                                                                                // -1e3
                                                                                //18 .111 11bbb
                                                                                // Output 3: -981.889000

    static  InputStream inputStream1 = new ByteArrayInputStream(byteArr1);
    static  InputStream inputStream2 = new ByteArrayInputStream(byteArr2);
    static  InputStream inputStream3 = new ByteArrayInputStream(byteArr3);
    static  StringReader sr1 = new StringReader(string1);
    //static DataInputStream dis = new DataInputStream(System.in);
    //static Reader reader = new StringReader(dis.toString());


    public static void main(String[] args) throws IOException {
        double dSum =0;
        Scanner s = new Scanner(System.in);

        while (s.hasNext()==true) {
            try {
               dSum += Double.parseDouble(s.next());
                //System.out.println( dSum);

            } catch (NumberFormatException ime) {
                
            }

        }
        String result= String.format("%.6f", dSum);
        System.out.print(result);

        /*
        while (s.hasNextDouble()) {
            

            
        }*/









        /*       int readedFromSI;

        try (InputStream inputStreamSI = System.in;
             InputStreamReader isr = new InputStreamReader(inputStreamSI)) {

            //в этот объект будет складываться всё, что введено в System.in
            StringBuilder stringFromSI = new StringBuilder();

            //читаем из System.in и собираем строку для разбора
            while ((readedFromSI=isr.read())!=47) {
                stringFromSI.append((char) readedFromSI);
            }

            System.out.print("stringFromSI="+stringFromSI.toString()+" ");
            System.out.println("stringFromSI length="+stringFromSI.length());

            //разбираем строку

                try {
                    double d = Double.parseDouble(stringFromSI.toString());
                    System.out.println("d="+d);
                } catch (NumberFormatException nfe) {

                }

            //System.out.println("d="+d);
        }
        //InputStreamReader isr = new InputStreamReader();

        //System.out.println(dis.readDouble());
        /*Reader reader = new StringReader(dis.readUTF());

        Scanner scanner = new Scanner(reader);
        d =scanner.nextDouble();
        System.out.println (d );
            //Scanner scanner = new Scanner(System.in);
/*
            try {double d = scanner.nextDouble();
                System.out.println("d=" + d);}
            catch (InputMismatchException ime) {
                double d = scanner.nextDouble();
                System.out.println("d=" + d);
            }
*/
            }

  /*
        //System.out.print("Inputted stream: ");
        while ( (b=inputStream3.read())!=-1) {
          // System.out.print(b+" ");

           // System.out.write(b);
        }
*/
    }


