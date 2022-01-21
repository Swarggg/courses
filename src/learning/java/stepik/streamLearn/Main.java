package learning.java.stepik.streamLearn;
/*
Напишите программу, читающую текст из System.in и выводящую в System.out сумму всех встреченных
 в тексте вещественных чисел с точностью до шестого знака после запятой.
 Числом считается последовательность символов, отделенная от окружающего текста пробелами или
  переводами строк и успешно разбираемая методом Double.parseDouble.



* */


import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {
    static byte[] byteArr1 = {49, 32, 50, 32, 51, 10}; //1 2 3  Output 1: 6.000000
    static byte[] byteArr2 = {97, 49, 32, 98, 50, 32, 99, 51, 10}; //a1 b2 c3 Output 2: 0.000000
    static byte[] byteArr3 = {45, 49, 101, 51, 10, 49, 56, 32, 46, 49, 49, 49, 32, 49, 49, 98, 98, 98};
                                                                                // -1e3
                                                                                //18 .111 11bbb
                                                                                // Output 3: -981.889000

    static  InputStream inputStream1 = new ByteArrayInputStream(byteArr1);
    static  InputStream inputStream2 = new ByteArrayInputStream(byteArr2);
    static  InputStream inputStream3 = new ByteArrayInputStream(byteArr3);

    public static void main(String[] args) throws IOException {
        int b;

        System.out.print("Inputted stream: ");
        while ( (b=inputStream1.read())!=-1) {
           // System.out.print(b+" ");

            System.out.write(b);
        }

    }

}
