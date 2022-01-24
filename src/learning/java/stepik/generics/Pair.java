package learning.java.stepik.generics;

import java.util.Objects;


public class Pair <T1, T2> {

    private final T1 value1;
    private final T2 value2;

    //constructor
    private Pair (T1 value1, T2 value2) {

        this.value1 = value1;
        this.value2 = value2;
    }

    public <T1, T2> Pair<T1, T2> of(T1 value1, T2 value2) {

        return new Pair<>(value1, value2);
    }



    public T1 getValue1() {
        return value1;
    }

    public T2 getValue2() {
        return value2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pair<?, ?> pair = (Pair<?, ?>) o;
        return Objects.equals(value1, pair.value1) && Objects.equals(value2, pair.value2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value1, value2);
    }



}