package byArray;

import java.util.ArrayList;

// 基于动态数组实现的栈
public class ArrayStack<E> implements Stack<E>{

    private int size = 0;
    private ArrayList<E> array;

    public ArrayStack(){
        array = new ArrayList<E>();
    }

    public ArrayStack(int Capacity){
        array = new ArrayList<E>(Capacity);
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        if(size == 0)
            return true;
        return false;
    }

    @Override
    public void push(E e) {
        array.set(size, e);
    }

    @Override
    public E pop() {
        E top = array.get(size - 1);
        array.set(size - 1, null);
        return top;
    }

    @Override
    public E peek() {
        return array.get(size - 1);
    }
}
