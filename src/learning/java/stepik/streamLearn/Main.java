package learning.java.stepik.streamLearn;

import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Main {

        public static void main (String[] args) throws IOException, InterruptedException {
            int flag= 0;
            int readed=0;
            int previsius=0;

            while (true) {
               readed = System.in.read();

               if (previsius==0) {
                   System.out.println("prev=0");
                   previsius = readed;
               } else {
                   if (previsius==107&readed==108) {
                       System.out.write(readed);
                   } else {
                       System.out.write(previsius);
                       System.out.write(readed);
                       previsius = readed;
                   }

               }

            }

        }


}


