package AVLMap;

import RedBlackTree.FileOperation;
import Map.LinkedListMap;
import Map.Map;

import java.util.ArrayList;

public class Main {

    private static double testMap(Map<String, Integer> map, String filename){

        long startTime = System.nanoTime();

        System.out.println(filename);
        ArrayList<String> words = new ArrayList<>();
        if(FileOperation.readFile(filename, words)) {
            System.out.println("Total words: " + words.size());

            for (String word : words){
                if(map.contains(word))
                    map.set(word, map.get(word) + 1);
                else
                    map.add(word, 1);
            }

            System.out.println("Total different words: " + map.getSize());
            System.out.println("Frequency of PRIDE: " + map.get("pride"));
            System.out.println("Frequency of PREJUDICE: " + map.get("prejudice"));
        }

        long endTime = System.nanoTime();

        return (endTime - startTime) / 1000000000.0;
    }

    public static void main(String[] args) {

        String filename = "pride-and-prejudice.txt";

        BSTMap<String, Integer> bstMap = new BSTMap<>();
        double time1 = testMap(bstMap, filename);
        System.out.println("BST Map: " + time1 + " s");

        System.out.println();

        Map.LinkedListMap<String, Integer> linkedListMap = new LinkedListMap<>();
        double time2 = testMap(linkedListMap, filename);
        System.out.println("Linked List Map: " + time2 + " s");

        System.out.println();

        AVLMap<String, Integer> avlMap = new AVLMap<>();
        double time3 = testMap(avlMap, filename);
        System.out.println("AVLMap List Map: " + time3 + " s");
    }
}

//输出
//        pride-and-prejudice.txt
//        Total words: 125901
//        Total different words: 6530
//        Frequency of PRIDE: 53
//        Frequency of PREJUDICE: 11
//        BST Map: 0.3109137 s
//
//        pride-and-prejudice.txt
//        Total words: 125901
//        Total different words: 6530
//        Frequency of PRIDE: 53
//        Frequency of PREJUDICE: 11
//        Linked List Map: 10.021093 s
