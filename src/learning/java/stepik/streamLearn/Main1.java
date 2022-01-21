package learning.java.stepik.streamLearn;

import java.io.IOException;

public class Main1 {

        public static void main (String[] args) throws IOException {
            int k= 107;
            int l= 108;

            int previous=0;
            int readed=0;

            readed = System.in.read();
            while (true) {
                previous=readed;
               readed = System.in.read();
                if (previous==k&readed==l) {
                    continue;
                }
                else {
                   System.out.write(previous);

                }

            } //while close

        }
}


