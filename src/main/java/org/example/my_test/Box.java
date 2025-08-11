package org.example.my_test;

import java.util.Objects;

public class Box<T> {
    private T num;
    public String s;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Box<?> box = (Box<?>) o;
        return Objects.equals(num, box.num) && Objects.equals(s, box.s);
    }

    @Override
    public int hashCode() {
        return Objects.hash(num, s);
    }

    public T getNum() {
        return num;
    }

    public void setNum(T num) {
        this.num = num;
    }
}
