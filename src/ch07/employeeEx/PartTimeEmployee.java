package ch07.employeeEx;

public class PartTimeEmployee extends Employee {
    int hourPay;
    int time;
    public PartTimeEmployee(String pay, int hourPay, int time) {
        super(pay);
        this.hourPay = hourPay;
        this.time = time;
    }

    @Override
    public void caculateSalary() {
        super.caculateSalary();
        System.out.println(pay + "은 " + hourPay * time + " 입니다");
        System.out.println("월급은 30일 기준으로 " + hourPay * time * 30 + " 입니다");
    }
}
