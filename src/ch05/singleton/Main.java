package ch05.singleton;

public class Main {
    public static void main(String[] args) {
        // 생성자 private라 생성 불가능
        // Singleton s1 = new Singleton();

        // static으로 쓸 때와 다른 점은
        // 우리가 필요한 시점에 생성할 수 있음.
        // getInstance()

//        Singleton s1 = Singleton.getInstance(); // 이때 객체 생성
//        Singleton s2 = Singleton.getInstance(); // 이전 생성된 것을 반환
//        Singleton s3 = Singleton.getInstance(); // 이전 생성된 것을 반환
//        System.out.println(s1); // ch05.singleton.Singleton@682a0b20
//        System.out.println(s2); // ch05.singleton.Singleton@682a0b20
//        System.out.println(s3); // ch05.singleton.Singleton@682a0b20
//        int [] arr = {1,2,3,4,5};
//        s1.multiply(arr);
//        s2.multiply(arr);

        Test1 t1 = new Test1();
        t1.test();

        Test2 t2 = new Test2();
        t2.test();
    }
}
