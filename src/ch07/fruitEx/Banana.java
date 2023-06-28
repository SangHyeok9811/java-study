package ch07.fruitEx;

public class Banana extends Fruit {
    public Banana(String name) {
        super(name);
    }

    @Override
    public void getColor() {
        super.getColor();
        System.out.println("노란색일거에요");
    }
}
