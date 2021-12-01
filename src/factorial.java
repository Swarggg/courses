public class factorial {
    public static void main(String[] args) {
        int b=6;
        int factorial = 1;

        for (int i=1; i<=b; i++) {

            factorial = factorial*i;

        }
        System.out.println("!"+b+"="+factorial);

    }
}
