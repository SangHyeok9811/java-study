package ch07.fruitEx;

public class Apple extends Fruit {
    public Apple(String name) {
        super(name);
    }

    @Override
    public void getColor(){
        super.getColor();
        System.out.println("빨간색일거에요");
    }
}
