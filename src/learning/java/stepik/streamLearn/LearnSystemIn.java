package learning.java.stepik.streamLearn;

import java.io.*;

public class LearnSystemIn {

    public static InputStream getInputStream () {
        byte[] testInputMassive= {65, 13, 10, 10, 13}; //В System.out должны быть выведены байты: 65 10 10 13
        InputStream inputStream = new ByteArrayInputStream (testInputMassive);
        return inputStream;
    }

        public static void main (String[] args) throws IOException {


        //InputStreamReader isr = new InputStreamReader(getInputStream());

        DataInputStream dataInputStream = new DataInputStream(getInputStream());

        //OutputStream os = new OutputStreamWriter(System.out);



          for (int i=0; i<getInputStream().available(); i++) {
              int x = dataInputStream.read();

              System.out.println(x);
          }

        }

}
