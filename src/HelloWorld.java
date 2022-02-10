import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * A programm that print "bla"
 * @author SwarG
 */
public class HelloWorld {

       /* //System.out.println("Hello World!");
        boolean a = true;
        boolean b = true;
        boolean c = false;
        boolean d = false;

        boolean bool = ((a^b)&(c^d))|((a^c)&(d^b));

*/


       public static void main(String[] args) {

           Car car = new Car();
           Car car2 = new Car();
           Djiga djiga = new Djiga();



           //output bla
           System.out.println("bla");

           //use functional interface & lambda
           Predicate pre = t-> t==car.getType();

           String n= djiga.type;
           if(pre.test(n)) {
               System.out.println("Это жига");
           } else System.out.println("Это не жига");

           //use functional interface & lambda
           Supplier sup = ()->car.getCarCount();
           System.out.println(sup.get()+" car are prodused at all");

            //????
           djiga.headLights();

           //use parent method
           car.startEngine();

           //use override method
           djiga.startEngine();



           System.out.println("Vin car = "+car.getVinNumber());

           System.out.println("Vin car 2 = "+car2.getVinNumber());

           System.out.println("Vin= djiga = "+djiga.getVinNumber()+". It is a "+Djiga.getCarCount()+" of produced car");

           //use ternary operator
           int k = 0;
           for (int i=1; i<5; i++) {
               System.out.print("i="+i+" ");
                k = i<3 ? i : 0;
               System.out.println("k="+k);
           }

           System.out.print(1.0/0.0);
           System.out.println(Math.sqrt(-2.0));





       }


    public static class Djiga extends Car {


        public String type = "Djiga";

        public void  startEngine () {
            System.out.println("Врум как Жига");
        }

     }

}

