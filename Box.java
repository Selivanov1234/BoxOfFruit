package GBJava.box;

import GBJava.fruit.Fruit;

import java.util.ArrayList;
import java.util.List;

    public class Box<T extends Fruit> {

       private int boxCapacity;
       private List<T> fruitList;

        public Box(int boxCapacity) {
            this.boxCapacity = boxCapacity;
            fruitList = new ArrayList<>();
        }

        public void fruitPut(T fr) {
            fruitList.add(fr);
        }

        public float getWeight() {
            float weight = 0;
            for (Fruit x : fruitList) {
                weight = weight + x.getWeight();
            }
            System.out.println("Box weight is: " + weight);
            return  weight;
        }

        public boolean isFull() {
            if (fruitList.size() >= boxCapacity) {
                System.out.println("This box is full!");
                return true;
            } else {
                System.out.println("The box is: " + (fruitList.size()) + "/" + boxCapacity + " full" );
                return false;
            }
        }

        public void fruitTransfer(Box<T> newBox) {
            for (T fr : fruitList) {
                if (fruitList.size() >= boxCapacity)
                newBox.fruitPut(fr);
            }
        }

//        public void boxWork (T fr) {
//            fruitPut(fr);
//            isFull();
//            if (isFull()) fruitTransfer();
//        }

        public boolean compare(Box newBox) {
            if (newBox.getWeight() > this.getWeight()) {
                System.out.println("New box is heavier!");
                return true;
            } else if (newBox.getWeight() < this.getWeight()) {
                System.out.println("This box is heavier!");
                return true;
            } else {
                System.out.println("The boxes are equal!");
                return true;
            }
        }
    }


