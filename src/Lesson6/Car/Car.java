package Lesson6.Car;

public class Car {
    protected int weight;
    protected int maxSpeed;
    protected String color;

    public Car(int weight, int maxSpeed, String color) {
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.color = color;
    }

    public void go() {
        System.out.println("Машина едет");
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "weight=" + weight +
                ", maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                '}';
    }
}
