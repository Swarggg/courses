package learning.java.stepik.generics;

import java.util.HashSet;
import java.util.Set;

public class SymetricDiff <T> {

    public static void main(String[] args) {

        Set<? super Object> set1 = new HashSet<>();
        set1.add(0);
        set1.add(1);
        set1.add(2);

        Set<? super Object> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);

        System.out.println(symmetricDifference(set1, set2));
    }

    public static <T> Set<T> symmetricDifference(Set<? extends T> set1, Set<? extends T> set2) {
        System.out.println("set1: "+set1);
        System.out.println("set1 size="+set1.size());

        System.out.println("set2: "+set2);
        System.out.println("set2 size="+set2.size());

        Set<T> set3 = new HashSet<>(set1);
        set3.removeAll(set2);
        System.out.println("set3"+set3);

        Set<T> set4 = new HashSet<>(set2);
        set4.removeAll(set1);
        System.out.println("set4"+set4);

        Set<T> set5 = new HashSet<>();
        set5.addAll(set3);
        set5.addAll(set4);

        return set5;

    }



}
