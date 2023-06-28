package ch05;

public class UserPlay {
    public static void main(String[] args) {
        User user1 = new User("한상혁", 26, "hansh7hsh@gamil.com");
        user1.userDetailInfo();

        user1.setName("sanghyeok");

        String name = user1.getName();
        user1.userDetailInfo();

        System.out.println("---------------------");

        user1.setEmail("hansh7hsh@naver.com");

        user1.userDetailInfo();

    }
}
