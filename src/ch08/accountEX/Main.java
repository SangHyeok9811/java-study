package ch08.accountEX;

public class Main {
    public static void main(String[] args) {
        Account account = new Account("110-459-488071", 10000,5000);
        account.deposit();
        account.withdraw();
    }
}
