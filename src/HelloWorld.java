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


        boolean e = a^b;
        System.out.println("a^b "+e);
        boolean f = c^d;
        System.out.println("c^d "+f);

        System.out.println();

        boolean g= a&b;
        System.out.println("a&b "+g);
        boolean h= c&d;
        System.out.println("c&d "+h);

        System.out.println();

        boolean i = e&f;
        System.out.println("a^b & c^d "+i);
        boolean j = g^h;
        System.out.println("a&b ^ c&d "+j);

        System.out.println();

        boolean cool = i^j;

        System.out.println("bool = "+bool);
        System.out.println("cool = "+cool);

        double x, y,z;

        x=1E-1;
        y=0.2;
        z=0.3;

        x=Math.abs(x);
        y=Math.abs(y);

        z=x+y;

        System.out.println(x);
        System.out.println("x+y="+(x+y));
        System.out.println("z="+Math.abs(z));
*/


       public static void main(String[] args) {


           System.out.println("bla");

           //Djiga.startEngine();
           //Car.startEngine();

           Car car = new Car();
           Djiga djiga = new Djiga();

           djiga.headLights();
           djiga.startEngine();
           car.startEngine();

          // car.headLights();

       }


    public static class Djiga extends Car {
        public void  startEngine () {
            System.out.println("Врум как Жига");

        }
    }


}

