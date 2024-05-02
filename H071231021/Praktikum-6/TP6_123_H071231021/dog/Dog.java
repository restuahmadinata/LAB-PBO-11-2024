package TP6_1_H071231021.dog;

public abstract class Dog implements DogDescription {
    public int position;
    public int averageLenght;

    public Dog(int position, int averageLenght) {
        this.position = position;
        this.averageLenght = averageLenght;
    }
 
    public abstract void move();
}