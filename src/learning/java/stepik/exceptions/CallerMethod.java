package learning.java.stepik.exceptions;

public class CallerMethod {
    public static void main(String[] args) {
        System.out.println(getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String s= null;
        if (s==null) throw new NullPointerException("!");



        return null;
    }
}
