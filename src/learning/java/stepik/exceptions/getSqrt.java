package learning.java.stepik.exceptions;

public class getSqrt {

    public static double sqrt(double x) {
        double san = 0;
        if (x<0) throw new IllegalArgumentException ("Expected non-negative number, got "+x);

            san= Math.sqrt(x);

        return san;
    }

    public static void main(String[] args) {
        System.out.println("Root: "+sqrt(-2));
    }

}
