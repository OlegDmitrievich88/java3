package lesson1;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> box= new ArrayList<>();

    public Box() {

    }
    public float getWeight() {
        float boxWeight = 0.0f;
        for (T fruit : box) {
            boxWeight += fruit.getWeight();
        }
        return boxWeight;
    }


    public void addFruit(T fruit, int size){
        for (int i = 0; i<size; i++){
            box.add(fruit);
        }
    }
    public void print(){
        System.out.println(box);
    }


}
