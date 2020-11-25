package GBJava;

import GBJava.arr.ArrShift;
import GBJava.box.Box;
import GBJava.fruit.Apple;
import GBJava.fruit.Orange;

public class Main {

    public static void main(String[] args) {
        Integer arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrShift<Integer> ch = new ArrShift<Integer>(arr,0);
        ch.shift(1,5);
        ch.arrToList(arr);
        Apple apple = new Apple(1);
        Orange orange = new Orange(2);

        Box box1 = new Box(10);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.fruitPut(apple);
        box1.isFull();
        box1.getWeight();
    }
}
