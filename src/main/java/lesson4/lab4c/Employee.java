package lesson4.lab4c;

abstract class Employee {

    private String empId;

    public Employee(String empId) {
        this.empId = empId;
    }

    public String print(int month, int year) {
        return calcCompensation(month, year).print();
    }

    public Paycheck calcCompensation(int month, int year){
        double grossPay = calcGrossPay(month, year);
        return new Paycheck(grossPay);
    }

    abstract double calcGrossPay(int month, int year);

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }
}
