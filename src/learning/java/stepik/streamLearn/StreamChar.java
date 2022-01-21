package learning.java.stepik.streamLearn;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;


public class StreamChar {

   static byte[] testByteArray1 = {49, 117, 50, 51};
   static InputStream inputStream = new ByteArrayInputStream(testByteArray1);
   static Charset charset1 = StandardCharsets.UTF_8;
   static Charset charset2 = StandardCharsets.UTF_16BE;

    public static String readAsString (InputStream inputStream, Charset charset) throws IOException {
       StringBuilder resulString=new StringBuilder();
       int buffer;
       InputStreamReader inputStreamReader= new InputStreamReader(inputStream, charset);


        while ((buffer=inputStreamReader.read())!=-1) {
            System.out.println("bukvi="+(char)buffer);
            resulString.append((char)buffer);


        }
        return resulString.toString();
    }

    public static void main(String[] args) throws IOException {
       System.out.println(readAsString(inputStream, charset1));
        System.out.println("=====================================");
         InputStream inputStream = new ByteArrayInputStream(testByteArray1);
        System.out.println(readAsString(inputStream, charset2));

    }
}
