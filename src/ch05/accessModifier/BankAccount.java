package ch05.accessModifier;

public class BankAccount {
    private int balance;    // private 필드

    // private 메서드
    // 클래스 만든사람만 가져다 쓰기 위해서

    private void deductFunds(int amount) {  // 메서드를 생성하면 그 안에서 기능을 정의할 수 있음
        if (amount <= balance) {
            balance -= amount;
        } else{
            // insufficient: 불충분
            System.out.println("Insufficient funds!");
        }
    }
}
