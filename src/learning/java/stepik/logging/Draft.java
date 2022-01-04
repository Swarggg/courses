package learning.java.stepik.logging;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Draft {

    private static final Logger LOGGER = Logger.getLogger(Draft.class.getName());


    public static void main(String[] args) {
        try {
            LOGGER.log(Level.INFO, "Start Main method");
            randomErroring();
        } catch (IllegalStateException ise) {
            LOGGER.log(Level.WARNING, "Random number less then 0.5: ");
          }
          catch (IllegalArgumentException iae) {
            LOGGER.log (Level.SEVERE, "JOPA!!! Random less then 0.1");
          }
    }

    public static void randomErroring () {

        for (int i=0; i<100; i++) {
            double randomNumber = Math.random();
            LOGGER.log (Level.INFO, "Iteration "+i+"| randomNumber="+randomNumber);
            if (randomNumber < 0.5 & randomNumber > 0.01) throw new IllegalStateException("Random number < 0.5");
            if (randomNumber < 0.01) throw new IllegalArgumentException("sdfsdf");
        }//for close
    } //randomErroring close


} //Draft class close


