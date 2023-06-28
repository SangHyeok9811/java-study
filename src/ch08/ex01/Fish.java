package ch08.ex01;

public class Fish implements Swimmable {
    private String name;

    public Fish(String name){
        this.name = name;
    }


    @Override
    public void swim() {
        System.out.println("The " + name + " is swimming");
    }
}
