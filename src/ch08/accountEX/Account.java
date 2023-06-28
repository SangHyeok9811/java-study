package ch08.accountEX;

public class Account implements Bankable{
    private String accountNumber;
    private int balance;
    private int amount;

    public Account(String accountNumber, int balance, int amount){
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.amount = amount;
    }

    @Override
    public void deposit() {
        int deposit1 = balance + amount;
        System.out.println(accountNumber + " 에" + amount + " 원이 입금되었습니다.");
        System.out.println("현재 잔액은: " + deposit1 + "입니다.");
    }

    @Override
    public void withdraw() {
        int withdraw1 = balance - amount;
        System.out.println(accountNumber + " 에" + amount + " 원이 출금되었습니다.");
        System.out.println("현재 잔액은: " + withdraw1 + "입니다.");
    }
}
