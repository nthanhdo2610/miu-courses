package org.example;

import java.util.Objects;

public class Main {
    public static void main(String[] args) {

    }
}
class S{
    int i, j;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getJ() {
        return j;
    }

    public void setJ(int j) {
        this.j = j;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        S s = (S) o;
        return getI() == s.getI() && getJ() == s.getJ();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getI(), getJ());
    }
}