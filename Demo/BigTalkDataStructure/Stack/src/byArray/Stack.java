package byArray;

public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e); // 入栈
    E pop(); // 出栈
    E peek();  // 查看栈顶
}
