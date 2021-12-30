package learning.java.stepik.exceptions;

public class CallerMethod {
    public static void main(String[] args) {
        System.out.println(" from main: "+getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(" from anozer: "+getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() {
        String s= null;
        try {
            if (s == null) throw new NullPointerException();
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
           s=e.getMessage();
        }


        return s;
    }
}
