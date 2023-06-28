package ch07.fruitEx;

public class Fruit {
    String name;

    public Fruit(String name) {
        this.name = name;
    }

    public void getColor() {
        System.out.println("\n" + name + "의 색상은");
    }
}
