package learning.java.stepik.streamLearn;

import java.io.*;

public class LearnSystemIn {

    public static InputStream getInputStream () throws IOException {
        byte[] testInputMassive= {65, 13, 10, 10, 13, 24, 45, 13, 10, 45}; //В System.out должны быть выведены байты: 65 10 10 13
        InputStream inputStream = new ByteArrayInputStream (testInputMassive);
        return inputStream;

       // InputStream is = new ByteArrayInputStream (testInputMassive);


    }

        public static void main (String[] args) throws IOException {


        //InputStreamReader isr = new InputStreamReader(getInputStream());

        DataInputStream dataInputStream = new DataInputStream(getInputStream());


        //OutputStream os = new OutputStreamWriter(System.out);
        int qb = getInputStream().available();

        int [] bufferIn = new int[qb+1];
        int [] bufferOut = new int[qb];

        int y= 0;

          for (int i=0; i<qb; i++) {
              int x = dataInputStream.read();
                bufferIn[i]=x;
              System.out.println(x);
          }
            System.out.println("===================================================");

            for (int i=0, j=0; i<bufferIn.length-1; i++, j++) {

                if(bufferIn[i]==13&bufferIn[i+1]==10) {
                    System.out.println(bufferIn[i+1]);
                    bufferOut[j]=bufferIn[i+1];
                    i++;
                } else
                System.out.println(bufferIn[i]);
                bufferOut[j]=bufferIn[i];
                y++;
            }

            //System.out.println("y="+(bufferIn.length-1-y));
            System.out.println("y="+y);
            System.out.println("bufferOut.length="+bufferOut.length);
            System.out.println("-----------------------");

                for (int i=0; i<y; i++) {
                    System.out.write(bufferOut[i]);
                }


        }

}
