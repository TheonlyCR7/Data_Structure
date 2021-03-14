package Array;

// 数组接口
public interface array<E> {

    int getSize();
    int getLength();
    boolean isEmpty();
    void add(int index, E e);
    void delete(int index);
    E getEle(int index);
}
