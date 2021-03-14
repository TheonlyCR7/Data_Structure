public class own_LoopQueue<E> implements Queue<E> {

    private Array<E> array;
    private int front;   // 指向队首
    private int tail;	// 指向队尾

    public own_LoopQueue(int capacity){
        array = new Array<>(capacity);
    }

    public own_LoopQueue(){
        array = new Array<>();
    }

    @Override
    public int getSize(){
        return array.getSize();
    }

    @Override
    public boolean isEmpty(){
        return array.isEmpty();
    }

    public int getCapacity(){
        return array.getCapacity();
    }

    @Override
    public void enqueue(E e){
    	if (front = capacity)
    		throw new IllegalArgumentException("Add is failed. The Queue is full.");
        array.addLast(e);
        front = front + 1;
    }

    @Override
    public E dequeue(){
        E delelement = array.remove(front);

        if (front != capacity)
        	front = front - 1;
        else
        	front = 0;
        return delelement;
    }

    @Override
    public E getFront(){
        return array[front];
    }

    @Override
    public String toString(){
        StringBuilder res = new StringBuilder();
        res.append("Queue: ");
        res.append("front [");
        for(int i = 0 ; i < array.getSize() ; i ++){
            res.append(array.get(i));
            if(i != array.getSize() - 1)
                res.append(", ");
        }
        res.append("] tail");
        return res.toString();
    }

    public static void main(String[] args) {

        ArrayQueue<Integer> queue = new ArrayQueue<>();
        for(int i = 0 ; i < 10 ; i ++){
            queue.enqueue(i);
            System.out.println(queue);
            if(i % 3 == 2){
                queue.dequeue();
                System.out.println(queue);
            }
        }
    }
}
