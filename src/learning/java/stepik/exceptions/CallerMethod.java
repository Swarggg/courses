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
    StackTraceElement[] met = Thread.currentThread().getStackTrace();
    if (met.length>3)    {return met[3].getClassName()+"#"+met[3].getMethodName();}
    /*
        System.out.println();
        for (int i=0; i< met.length; i++) {
            System.out.println(i+":"+met[i]);
        }
        System.out.println(met[met.length-2].getClassName());
*/
        return null;
    }
}
