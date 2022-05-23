public class CallerMethod {
    public static void main(String[] args) {
        System.out.println(" from main: "+getCallerClassAndMethodName());
        anotherMethod();
    }

    private static void anotherMethod() {
        System.out.println(" from anozer: "+getCallerClassAndMethodName());
    }

    public static String getCallerClassAndMethodName() throws RuntimeException {
        String s= null;
        //String b=null;
        try {
            if (s == null) {throw new NullPointerException();}
        } catch (NullPointerException e) {
            System.out.println(e.getClass());
           s=e.getMessage();
        }
        return s;
    }
}