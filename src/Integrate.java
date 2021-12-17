import java.util.function.DoubleUnaryOperator;

public class Integrate {

//метод левых прямоугольников

    public static void main(String[] args) {
        System.out.println(integrate(x -> 1, 0, 10));//10.0
        System.out.println(integrate(x -> x + 2, 0, 10));//70.0
        System.out.println(integrate( x -> Math.sin(x) / x , 1, 5));//0.603848
    }
    public static double integrate(DoubleUnaryOperator f, double a, double b) {

        double res=0;
        while (a<=b) {
            double step=Math.pow(10, -7);

            res=res+ f.applyAsDouble(a);
            a=a+step;
        }
        return res;
    }
}