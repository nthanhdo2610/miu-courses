package lesson4.lab4c;

public class Hourly extends Employee {
    private int hourlyWage;
    private int hoursPerWeek;

    public Hourly(String empId, int hourlyWage, int hoursPerWeek) {
        super(empId);
        this.hourlyWage = hourlyWage;
        this.hoursPerWeek = hoursPerWeek;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(int hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    public int getHoursPerWeek() {
        return hoursPerWeek;
    }

    public void setHoursPerWeek(int hoursPerWeek) {
        this.hoursPerWeek = hoursPerWeek;
    }

    @Override
    double calcGrossPay(int month, int year) {
        return 4 * hoursPerWeek * hourlyWage;
    }
}
