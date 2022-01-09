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
        /*
        Интерфейс: сущность, которую можно отправить по почте.
        У такой сущности можно получить от кого и кому направляется письмо.
        */
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

//--------------------------U N T R U S T------------------------------------//
    public static class UntrustworthyMailWorker implements MailService {

        MailService[] allAgents;
        //Logger LOGGER1 = null;

        //Spy spy = new Spy(LOGGER1);
        Thief thief = new Thief(1000);
        RealMailService realMailService = new RealMailService();
        Inspector inspector = new Inspector();

        //constructor
        private UntrustworthyMailWorker (MailService[]/*так по условию*/ allAgents ){
        this.allAgents=allAgents;
        }

        @Override
        public Sendable processMail (Sendable mail) {

          for (MailService m : allAgents){
              m.processMail(mail);
          }
          realMailService.processMail(mail);
            return mail;
        }

        public RealMailService getRealMailService () {

            return realMailService;
        }

    }   //UntrustworthyMailWorker closing
//---------------------------S P Y------------------------------------//
    public static class Spy implements MailService {

    private Logger spyLogger;

    //constructor
    public Spy (Logger LOGGER) {
        this.spyLogger=LOGGER;
        }

        @Override
        public Sendable processMail(Sendable mail) {
            //массив для подстановки его элементов в сообщения ЛОГГЕРА по индексу элемента

            if (mail instanceof MailMessage) {
                Object[] insert= new Object[] {((MailMessage) mail).getFrom(), ((MailMessage) mail).getTo(), ((MailMessage) mail).getMessage()};
                if (mail.getFrom().equals(AUSTIN_POWERS) || mail.getTo().equals(AUSTIN_POWERS)) {spyLogger.log(Level.WARNING, "Detected target mail correspondence: from {0} to {1} \"{2}\"", insert);}
                else {spyLogger.log(Level.INFO, "Usual correspondence: from {0} to {1}", insert);}
            }
            return mail;
        }

    }//Spy closing
//---------------------------T H I E F--------------------------------//
    public static class Thief implements MailService {

    private int mustSteal;
    private int allStolenCost;

    //constructor
    public Thief (int mustSteal) {
        this.mustSteal=mustSteal;
    }

    @Override
    public Sendable processMail(Sendable mail) {

        if (mail instanceof MailPackage) {

            if (((MailPackage) mail).getContent().getPrice() >= mustSteal) {
                allStolenCost += ((MailPackage)mail).getContent().getPrice();
                Package thiefedPackage = new Package("stones instead of " + ((MailPackage) mail).getContent().getContent(), 0);
                //LOGGER.log(Level.INFO, "Я украл "+((MailPackage)mail).getContent().getPrice());
                MailPackage thiefedMail = new MailPackage (mail.getFrom(),  mail.getTo(), thiefedPackage);
                return thiefedMail;
            }

        }
        return mail;
    }

    public int getStolenValue () {
        return allStolenCost;
    }

    }//Thief closing


//------------------------E x c e n t i o n s--------------------------//
    public static class IllegalPackageException extends RuntimeException {
        public IllegalPackageException (String message) {

        }
    }

    public static class StolenPackageException extends RuntimeException {
        public StolenPackageException (String message) {

        }
    }

//----------------------------I N S P E C T O R-------------------------//
    public static class  Inspector implements MailService{

    @Override
    public Sendable processMail (Sendable mail) {

    if (mail instanceof MailPackage) {
        if (((MailPackage) mail).getContent().getContent().equals(WEAPONS)||
        ((MailPackage) mail).getContent().getContent().equals(BANNED_SUBSTANCE))
        {
           // throw new IllegalPackageException ("here we have weapons");
            //LOGGER.log(Level.INFO, "Inspector detect weapon");
        }

        if (((MailPackage) mail).getContent().getContent().contains("stones")) {
            // throw new StolenPackageException("here we have weapons stones");
        }
    }
        return mail;
    }


    }// Inspector closing

/// M A I N ////

    //MailPackage firstPackage = new MailPackage());

    public static Package justPackage1 = new Package(WEAPONS,900);
    public static Package justPackage2 = new Package(WEAPONS,2000);
    public static Package justPackage3 = new Package("Fruits",100);

    public static MailPackage jp1 = new MailPackage("Queen", PENTAGON, justPackage1);
    public static MailPackage jp2 = new MailPackage("Queen", PENTAGON, justPackage2);


    public static MailMessage firstLetter = new MailMessage(AUSTIN_POWERS, PENTAGON, "You all gonna die");
    public static MailMessage secondLetter = new MailMessage(BOB_ITKINS, PENTAGON, "All products are delivered");


    //public static Sendable[] mail = {firstLetter, secondLetter};
    //public static MailPackage firstPackage = new MailPackage("Queen", PENTAGON, justPackage);


    //public static RealMailService realMailService = new RealMailService();

   public static Spy spy = new Spy(LOGGER);
    public static  Thief thief = new Thief(1000);



    public static void main(String[] args) {

        MailService[] allAgents={spy, thief};

        Sendable[] mail = {firstLetter, secondLetter, jp1, jp2};

        UntrustworthyMailWorker untrustworthyMailWorker = new UntrustworthyMailWorker(allAgents);

        for (Sendable m : mail) {
            untrustworthyMailWorker.processMail(m);
            System.out.println("Это было "+m.getClass()+" From: "+m.getFrom()+" To: "+m.getTo());
        }




   // spy.processMail(secondLetter);
       // spy.processMail(firstLetter);
   // thief.thiefStealing(justPackage1);
   // thief.thiefStealing(justPackage2);
    //thief.thiefStealing(justPackage3);
     //   System.out.println(thief.stealedPackage.getContent());

    }// main closing




} //MainMailingClass closing


