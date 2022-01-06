package learning.java.stepik.logging;

import java.util.Formatter;
import java.util.logging.*;

public class Draft {

    //private static final Logger LOGGER = Logger.getLogger(Draft.class.getName());
    private static final Logger LOGGERA = Logger.getLogger(Draft.class.getName());
   // private static ConsoleHandler handlerA= new ConsoleHandler();

    private static void configureLogging() {
        Handler handlerA = new ConsoleHandler();
        handlerA.setLevel(Level.ALL);
        LOGGERA.addHandler(handlerA);
        LOGGERA.setLevel(Level.ALL);
        XMLFormatter formatterUP = new XMLFormatter();
        handlerA.setFormatter(formatterUP);
        LOGGERA.addHandler(handlerA);
        //LOGGERA.

    }

    public static void main(String[] args) {
        configureLogging();
        try {
            LOGGERA.log(Level.INFO, "Start Main method");
            randomErroring();
        } catch (IllegalStateException ise) {
            LOGGERA.log(Level.WARNING, "Random number less then 0.5: ");
          }
          catch (IllegalArgumentException iae) {
            LOGGERA.log (Level.SEVERE, "JOPA!!! Random less then 0.1");
          }
    }

    public static void randomErroring () {

        for (int i=0; i<100; i++) {
            double randomNumber = Math.random();
            LOGGERA.log(Level.FINE, "random variable is set");
            Object[] insertions = new Object[]{ i, randomNumber};
            LOGGERA.log (Level.INFO, "Iteration {0}| randomNumber={1}", insertions );
            if (randomNumber < 0.5 & randomNumber > 0.01) throw new IllegalStateException("Random number < 0.5");
            if (randomNumber < 0.01) throw new IllegalArgumentException("sdfsdf");
        }//for close
    } //randomErroring close


} //Draft class close

/*
Пример настройки Logger'а в коде:

    Logger logger = Logger.getLogger(Stepik.class.getName());
    Handler handler;
    try {
      handler = new FileHandler("log.xml");
    } catch (Exception e) {
      handler = new ConsoleHandler();
    }
    Formatter formatter = new XMLFormatter();

    handler.setFormatter(formatter);
    handler.setLevel(Level.WARNING);
    logger.addHandler(handler);

    logger.log(Level.INFO, "test info");
    logger.log(Level.WARNING, "test warning"); // Выводится в файл

 */


/* НА Степик.орг решил так
private static void configureLogging() {

        //for classA
        Logger loggerA=Logger.getLogger("org.stepic.java.logging.ClassA");
        loggerA.setLevel(Level.ALL);

        Handler handlerA = new ConsoleHandler();
        handlerA.setLevel(Level.ALL);

        //for classB
        Logger loggerB=Logger.getLogger("org.stepic.java.logging.ClassB");
        loggerB.setLevel(Level.WARNING);

        Handler handlerB = new ConsoleHandler();
        handlerB.setLevel(Level.WARNING);

        Logger loggerUP=Logger.getLogger("org.stepic.java");
        Handler handlerUP = new ConsoleHandler();
        XMLFormatter formatterUP = new XMLFormatter();
        handlerUP.setLevel(Level.ALL);
        handlerUP.setFormatter(formatterUP);
        loggerUP.addHandler(handlerUP);
        loggerUP.setUseParentHandlers(false);


}
 */