package ch07;

public class Person {
    String name;
    int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public void introduce() {
        System.out.println("제 이름은 " + name + " 이고 나이는 " + age + " 입니다");
    }

}
