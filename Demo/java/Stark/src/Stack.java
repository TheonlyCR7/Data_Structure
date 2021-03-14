
public interface Stack<E> {

    int getSize();
    boolean isEmpty();
    void push(E e);   // 入栈操作
    E pop();  // 出栈操作
    E peek(); //获取最后一位数据

}
