package ch07;

public class Main {
    public static void main(String[] args) {
        Person p = new Person("한상혁", 26);
        Student s = new Student("홍영기", 28, "1722038");
        Student ss = new Student("권상훈", 27,"1111");
        Lecturer l = new Lecturer("이상준", 11,100);
        s.introduce();
        s.study();
        l.introduce();
        l.teach();
        // 업캐스팅
        // Student 객체를 Person 타입으로 변환(부모타입으로 변환);
        // 자식 객체를 부모 객체에 대입
        Person pp1 = l;  // Lectuer라는 자식 클래스의 l이라는 객체가 pp1로 형변환 됨.
        Person pp2 = s;  // Student라는 자식 클래스의 s라는 객체가 pp2로 형변환 됨.
        System.out.println("----------------------------------------------");
        PersonManager personManager = new PersonManager(); // 메서드가 존재하는 PersonManager 클래스의 객체 생성(입력을 받기 위해? 메서드 실행을 위해?)
        personManager.work(pp2); // ()안에 들어갈 수 있는 객체는 형변환이 되어 Person 객체가 된 pp1,pp2와 원래 Person객체였던 p(출력값이 안나올듯? 안나옴)
        System.out.println("------------------------------------------------");
        // 부모 객체의 자식 객체에서 재정의된 메서드 호출
        // 자식 객체의 메서드가 호출
//        Person p2 = ss;
//        p2.work(); // Student의 study()
//        p2.introduce(); // Student의 introduce가 호출되었음.
        // 자식 객체의 추가한 메서드/필드는 접근 불가
        // p2.study() // 호출불가 (부모객체로 바뀌었기 때문)

        Person p3 = new Lecturer("조병훈", 25, 333);
//        p3.work(); // Lecturer에 teach()
        personManager.work(p3);
        // 부모 객체를 자식 객체에 대입
        // 명시적 형변환
        // 그냥 형변환 하면 에러발생 가능성이 존재함.
        // 부모객체변수 instanceof 자식클래스타입
        // Student -> Person, 원래 Person, Lecturer -> Person
//        if(p2 instanceof Student){
//            Student s2 = (Student) p2;
//            s2.study();
//        }
//
//        if(p3 instanceof Student){
//            Student s3 = (Student) p3;
//            s3.study();
        }
}