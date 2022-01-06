package learning.java.stepik.mailing;

import java.util.logging.Level;
import java.util.logging.Logger;

public class MainMailingClass {
    public static final String AUSTIN_POWERS = "Austin Powers";
    public static final String BOB_ITKINS = "Bob Itkins";
    public static final String PENTAGON = "Pentagon";
    public static final String WEAPONS = "weapons";
    public static final String BANNED_SUBSTANCE = "banned substance";

    public  static  final Logger LOGGER = Logger.getLogger(MainMailingClass.class.getName());

    public interface Sendable {
        String getFrom();
        String getTo();
    }

    public interface MailService {
        /*
        Интерфейс, который задает класс, который может каким-либо образом обработать почтовый объект.
        */
        Sendable processMail(Sendable mail);
    }

    public static class AbstractSendable implements Sendable {
        protected final String from;
        protected final String to;

        public AbstractSendable(String from, String to) {
            this.from = from;
            this.to = to;
        }

        @Override
        public String getFrom() {
            return from;
        }

        @Override
        public String getTo() {
            return to;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            AbstractSendable that = (AbstractSendable) o;

            if (!from.equals(that.from)) return false;
            if (!to.equals(that.to)) return false;

            return true;
        }
    }

    public static class MailPackage extends AbstractSendable{
        /*
        Посылка, содержимое которой можно получить с помощью метода `getContent`
        */
        private final Package content;

        public MailPackage(String from, String to, Package content) {
            super(from, to);
            this.content = content;
        }

        public Package getContent() {
            return content;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailPackage that = (MailPackage) o;

            if (!content.equals(that.content)) return false;

            return true;
        }
    }

    public static class MailMessage  extends AbstractSendable{
        /*
        Письмо, у которого есть текст, который можно получить с помощью метода `getMessage`
        */
        private final String message;

        public MailMessage(String from, String to, String message) {
            super(from, to);
            this.message = message;
        }

        public String getMessage() {
            return message;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            if (!super.equals(o)) return false;

            MailMessage that = (MailMessage) o;

            if (message != null ? !message.equals(that.message) : that.message != null) return false;

            return true;
        }

    }

    public static class Package {
    /*
    Класс, который задает посылку. У посылки есть текстовое описание содержимого и целочисленная ценность.
    */
        private final String content;
        private final int price;

        public Package(String content, int price) {
            this.content = content;
            this.price = price;
        }

        public String getContent() {
            return content;
        }

        public int getPrice() {
            return price;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Package aPackage = (Package) o;

            if (price != aPackage.price) return false;
            if (!content.equals(aPackage.content)) return false;

            return true;
        }
    }

    public static class RealMailService implements MailService {
    /*
    Класс, в котором скрыта логика настоящей почты
    */

        @Override
        public Sendable processMail(Sendable mail) {
            // Здесь описан код настоящей системы отправки почты.
            return mail;
        }
    }


    public static class UntrustworthyMailWorker {
        private MailService[] allMail=null;

        private UntrustworthyMailWorker (MailService[] allMail){
        this.allMail=allMail;
        }

        public void mailing () {

            for (MailService i: allMail) {

                //spy.spyingMail(i);
                //thief.thiefStealing(i);
               // inspector.insp(i);

            }

        }

    }   //UntrustworthyMailWorker closing

    public static class Spy implements MailService {

    private MailMessage message = null;
    private Logger spyLogger= null;

    //constructor
    public Spy (Logger LOGGER) {
        this.spyLogger=LOGGER;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            //массив для подстановки его элементов в сообщения ЛОГГЕРА по индексу элемента
            //Object[] insert= new Object[] {mail.getFrom(), mail.getTo()};

            if (mail.getFrom().equals(AUSTIN_POWERS)) {spyLogger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"message??????\"", new Object[] {mail.getFrom(), mail.getTo()});}
            else {spyLogger.log(Level.INFO, "Usual correspondence: from {0} to {1}", new Object[] {mail.getFrom(), mail.getTo()});}
            return mail;
        }
    }//Spy closing

    public static class Thief {

    private int mustSteal;
    private int allStolenCost=0;
    public Package stealedPackage;

    //constructor
    public Thief (int mustSteal) {
        this.mustSteal=mustSteal;
    }

    public Package thiefStealing (Package stealingPackage) {

        if(stealingPackage.getPrice()>=mustSteal) {
            allStolenCost+=stealingPackage.getPrice();

            stealedPackage=new Package("stones instead of "+stealingPackage.getContent(), 0);

        }
        return stealedPackage;
    }

    public int getStolenValue () {
        return allStolenCost;
    }

    }//Thief closing

    public static class  Inspector {

    }// Inspector closing

/// M A I N ////

    //MailPackage firstPackage = new MailPackage());
    public static MailMessage firstLetter = new MailMessage(AUSTIN_POWERS, PENTAGON, "You all gonna die");
    public static MailMessage secondLetter = new MailMessage(BOB_ITKINS, PENTAGON, "All products are delivered");


    public static Package justPackage1 = new Package(WEAPONS,10000);
    public static Package justPackage2 = new Package(WEAPONS,20000);
    public static Package justPackage3 = new Package(WEAPONS,1000);
    //public static MailPackage firstPackage = new MailPackage("Queen", PENTAGON, justPackage);

    public static Spy spy = new Spy(LOGGER);
    public static Thief thief = new Thief(10000);



    public static void main(String[] args) {


    spy.processMail(secondLetter);
        spy.processMail(firstLetter);
   // thief.thiefStealing(justPackage1);
   // thief.thiefStealing(justPackage2);
    //thief.thiefStealing(justPackage3);
     //   System.out.println(thief.stealedPackage.getContent());

    }// main closing




} //MainMailingClass closing


