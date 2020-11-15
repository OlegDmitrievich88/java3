package lesson1;

import java.util.ArrayList;

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
    }//считаем вес


    public void addFruit(T fruit, int size){
        for (int i = 0; i<size; i++){
            box.add(fruit);
        }
    }//добавляем фрукты
    public void print(){
        System.out.println(box);
    }// печать
    public boolean compare(Box<?> fruit){
        return (getWeight() == fruit.getWeight());//Math.abs(this.getWeight() - fruit.getWeight()) < 0.0001;
    }
    public void boxINbox(Box<T> fruit){
        fruit.box.addAll(box);
        box.clear();
    }


}
