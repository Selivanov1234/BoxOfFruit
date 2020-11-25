package GBJava.fruit;

public abstract class Fruit {
    protected int weight;

    public Fruit (int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }
}
