package Generics;

public class Pair<T,V>{

    T x;
    V y;

    public Pair(){

    }

    public Pair(T x, V y) {
        this.x = x;
        this.y = y;
    }

    public T getX() {
        return x;
    }

    public void setX(T x) {
        this.x = x;
    }

    public V getY() {
        return y;
    }

    public void setY(V y) {
        this.y = y;
    }

    public static <S> void doSomething(S x) {
        System.out.println(x);
    }
}
