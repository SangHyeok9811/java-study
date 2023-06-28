package ch05;

public class User {
    private String name;
    private int age;
    private String email;

    public User(String name, int age, String email){
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public void userDetailInfo() {
        System.out.println("학생 이름은: " + name);
        System.out.println("학생 나이는: " + age);
        System.out.println("학생 이메일: " + email);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setEmail(String email) {
        this.email = email;
    }

}
