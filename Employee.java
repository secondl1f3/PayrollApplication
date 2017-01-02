public class Employee {
    // Data fields
    protected String empID;
    protected String nameID;
    protected double hours;
    protected double rate;
    protected double maxNoOvertime = 40; // hours in work week
    protected double overtimeRate = 1.5; // overtime rate
    protected double maxNoDues = 100;	// max earnings before dues
    protected double dues = 25;		// dues amount

    // Methods
    public Employee() {}

    public Employee(String s, String n, double h, double r) {
        empID = s;
        nameID = n;
        hours = h;
        rate = r;
    }

    // Sets hours and rate
    public void setPayData(double h, double r) {
        hours = h;
        rate = r;
    }

    // Computes gross pay
    public double computeGross() {
        if (hours <= maxNoOvertime) {
            return hours * rate;
        } else {
            double regularPay = maxNoOvertime * rate;
            double overtimePay = (hours - maxNoOvertime) *
                    overtimeRate * rate;
            return regularPay + overtimePay;
        }
    }

    // Computes net pay, given gross pay.
    public double computeNet(double gross) {
        if (gross <= maxNoDues)
            return gross;
        else
            return gross - dues; // deduct dues amount
    }

    // Shows employee information.
    public String toString() {
        return "Hours worked are " + hours + "\n" +
                "Hourly rate is $" + rate + "\n" +
                "The overtime rate is " + overtimeRate +
                " for hours worked over " + maxNoOvertime + "\n" +
                "The union dues are $" + dues +
                " for gross pay over $" + maxNoDues + "\n";
    }

}
