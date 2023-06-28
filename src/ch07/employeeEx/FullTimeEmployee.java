package ch07.employeeEx;

public class FullTimeEmployee extends Employee {
    int annualSalary;

    public FullTimeEmployee(String pay, int annualSalary) {
        super(pay);
        this.annualSalary = annualSalary;
    }

    @Override
    public void caculateSalary() {
        super.caculateSalary();
        System.out.println(pay + "은 " + annualSalary + " 입니다");
        System.out.println("월급은 " + annualSalary / 12 + " 입니다" );
    }

}
