package ch07.employeeEx;

public class Main {
    public static void main(String[] args) {
        Employee ft = new FullTimeEmployee("연봉",2600);
        Employee pt = new PartTimeEmployee("주급", 1, 8);
        ft.caculateSalary();
        pt.caculateSalary();
    }
}
