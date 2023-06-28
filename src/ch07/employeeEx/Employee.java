package ch07.employeeEx;

public class Employee {
    String pay;
    public Employee(String pay){
        this.pay = pay;
    }

    public void caculateSalary() {
        System.out.println(pay + "의 정보를 알려드리겠습니다");
    }
}
