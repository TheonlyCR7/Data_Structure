package Array;

// 测试
public class main {
    public static void main(String[] args) {
        arrayList<Integer> array1 = new arrayList<Integer>();
        System.out.println("array.length: " + array1.getLength());
        System.out.println("array.size: " + array1.getSize());
        System.out.println("array:" + array1.toString());
        System.out.println("----");

        for(int i = 0; i < 11; i ++)
            array1.addLast(i);
        System.out.println("array.length: " + array1.getLength());
        System.out.println("array.size: " + array1.getSize());
        System.out.println("array:" + array1.toString());

        for(int j = 0; j < 11; j ++){
            array1.delete(0);
            System.out.println("array:" + array1.toString());
        }

    }
}
