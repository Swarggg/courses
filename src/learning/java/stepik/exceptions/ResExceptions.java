package learning.java.stepik.exceptions;

public class ResExceptions {
     class A {
        Byte a;

        public void setA(byte a) {
            this.a = a;
        }

        public Byte getA() {
            return a;
        }
    }

    class B extends A {
        Byte a;


    }


   A a = new A();

     a = (A) b;
}
