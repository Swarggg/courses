package learning.java.stepik.generics;

public class DraftGeneric <T> {

    private T t;

    public DraftGeneric (T obj) {
        this.t=obj;
    }

    public T getT () {
        return t;
    }

    public void setT (T obj) {
        t=obj;
    }

    public void printT () {
        System.out.println("t="+t);
    }


    public static void main(String[] args) {
        int i = 234234;
        String str = "ksdlfkjsdkfj";

        DraftGeneric<Integer> intT = new DraftGeneric<>(i);

        DraftGeneric<String> strT= new DraftGeneric<>(str);

        intT.printT();
        strT.printT();

    }


}
