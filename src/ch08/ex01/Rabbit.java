package ch08.ex01;


public class Rabbit implements Runnable{

    @Override
    public void run(){
        System.out.println("The rabbit is running fast!");
    }
    @Override
    public void sing(){
        System.out.println("The bird is singing");
    }
}
