package Stark;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);   // 入栈操作

    E peek();  // 出栈操作

}
