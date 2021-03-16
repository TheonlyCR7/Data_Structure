package byArray;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    static ArrayList<Character> charArray;
    public static void main(String[] args) {

        ArrayStack<Character> array = new ArrayStack<>(10);

        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();

        char[] chararray = str.toCharArray();
    }

    // 将中缀运算式转换为 后缀计算式
    static void change(char[] array){
        for(char i : array){
            if(Character.isDigit(i))
                charArray.add(i);
            if(i.equal(')'))

        }
    }

    // change 的辅助函数
    static void changeAss(){

    }
}
