package Array;

// 实现动态数组
public class arrayList<E> implements array {

    private E[] data;
    private int size;  // 数组中非空元素的个数

    public arrayList(){
        data = (E[])new Object[10];  // default size is 10
    }

    public arrayList(int Capacity){
        data = (E[])new Object[Capacity];
        this.size = 0;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getLength(){
        return data.length;
    }

    @Override
    public boolean isEmpty() {
        if(data.length == 0)
            return true;
        return false;
    }

    @Override
    public void add(int index, Object o) {
        if(index >= data.length)
            throw new ArrayIndexOutOfBoundsException("Array is not enough long.");
        if(data == null){
            data[0] = (E)o;
            return;
        }

        if(size >= data.length*0.75)
            resize(size*2);

        for(int i = size+1; i > index; i --)
            data[i] = data[i-1];

        data[index] = (E)o;
        size ++;
    }

    private void resize(int newCapacity){
        E[] newData = (E[])new Object[newCapacity];
        for(int i = 0; i < size; i ++)
            newData[i] = data[i];
        data = newData;
    }

    public void addFirst(Object o){
        add(0, o);
    }

    public void addLast(Object o){
        add(size, o);
    }

    @Override
    public void delete(int index) {
        if(index >= data.length)
            return;
        for(int i = index+1; i <= size; i ++)
            data[i-1] = data[i];
        data[size] = null;
        size --;

        if(size < data.length/2)
            resize(data.length/2);
    }

    @Override
    public Object getEle(int index) {
        return data[index];
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append(String.format("Array size = %d, capacity = %d\n", size, data.length));
        res.append('[');
        for(int i = 0; i < size; i++){
            res.append(data[i]);
            if(i != size - 1)
                res.append(",");
        }
        res.append(']');
        return res.toString();
    }
}
