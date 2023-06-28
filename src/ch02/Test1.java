package ch02;

public class Test1 {
    public static void main(String[] args){

        int price = 187000;
        int oman = price / 50000;
        price -= 50000 * oman;
        System.out.println(price);
        int man = price / 10000;
        price -= 10000 * man;
        System.out.println(price);
        int ochun = price / 5000;
        price -= 5000 * ochun;
        System.out.println(price);
        int chun = price / 1000;

        System.out.println("5만원권 :" + oman + "장");
        System.out.println("1만원권 :" + man + "장");
        System.out.println("5천원권 :" + ochun + "장");
        System.out.println("1천원권 :" + chun + "장");
        /*
        int price1 = 187000;
        int oman1 = price1 / 50000;
        int man1 = price1 % 50000 / 10000;
        int ochun1 = price1 % 50000 % 10000 / 5000;
        int chun1 = price1 % 50000 % 10000 % 5000 / 1000;

        System.out.println("5만원권 :" + oman1 + "장");
        System.out.println("1만원권 :" + man1 + "장");
        System.out.println("5천원권 :" + ochun1 + "장");
        System.out.println("1천원권 :" + chun1 + "장");
        */
        int ochun2 = price % 50000 % 10000;
        int ochun3 = price % 10000; // 두 가지 모두 같음. 최종적으로는 10000으로 나누기 때문

    }
}
