package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        String[] strings = {"red","white"};
        System.out.println(Arrays.toString(strings));
        swap(strings,1,0);

        ArrayList<String> arrayString = new ArrayList<>();
        arrayString.addAll(Arrays.asList(strings));
        System.out.println(arrayString);

        Box<Apple> box = new Box<>();
        box.addFruit(new Apple(), 7);
        box.print();
        System.out.println(box.getWeight());
        Box<Orange> box1 = new Box<>();
        box1.addFruit(new Orange(), 9);
        box1.print();
        System.out.println(box1.getWeight());
        System.out.println(box.compare(box1));
    }
    public static void swap(String[] strings, int a, int b){
        String box = strings[a];
        strings[a] = strings[b];
        strings[b] = box;
        System.out.println(Arrays.toString(strings));

    }




    
}

