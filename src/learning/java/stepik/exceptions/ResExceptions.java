package learning.java.stepik.exceptions;

public class ResExceptions{

static class A extends B {
    byte a;
}


static class B  {
    byte b;

}

    public static void main(String[] args) {
        //A a = new A();
       B b = new B();
         A a = (A) b;
    }



}


