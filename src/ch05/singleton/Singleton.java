package ch05.singleton;
// singleton
// 메서드로만 객체에 접근하기 위해서 사용?
public class Singleton {
    // private static 클래스 객체
    private static Singleton instance;

    // 외부에서 객체 생성 안 됨.
    // private 생성자
    private Singleton() {
        // private 생성자
    }

//    public Singleton(Singleton instance) {
//        this.instance = instance;
//    }
//    생성자 오버로딩

    // getInstance 메서드로 처음에 생성한 객체만 접근하게 하는 방법
    // 객체 생성은 메서드 호출시에 한 번만
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public int multiply(int x, int y) {
        System.out.println("(int, int)");
        return x * y;
    }
    public int multiply(int [] nums) {
        if(nums == null || nums.length == 0) {
            return 0;
        }
        int mulResult = 1;
        for(int num : nums) {
            mulResult *= num;
        }
        return mulResult;
    }

}
