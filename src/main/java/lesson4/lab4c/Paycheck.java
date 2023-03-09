package lesson4.lab4c;

public class Paycheck {
    private final double grossPay;
    private final double fica = 0.23;
    private final double state = 0.05;
    private final double local = 0.01;
    private final double medicare = 0.03;
    private final double socialSecurity = 0.075;

    public Paycheck(double grossPay) {
        this.grossPay = grossPay;
    }

    public double getGrossPay() {
        return grossPay;
    }

    public double getFica() {
        return fica;
    }

    public double getState() {
        return state;
    }

    public double getLocal() {
        return local;
    }

    public double getMedicare() {
        return medicare;
    }

    public double getSocialSecurity() {
        return socialSecurity;
    }

    public String print() {
        return "Print: " + this;
    }

    public double getNetPay() {
        return grossPay - grossPay*(fica+state+local+medicare+socialSecurity);
    }

    @Override
    public String toString() {
        return "Paycheck{" +
                "grossPay=" + grossPay +
                ", fica=" + fica +
                ", state=" + state +
                ", local=" + local +
                ", medicare=" + medicare +
                ", socialSecurity=" + socialSecurity +
                '}';
    }
}
