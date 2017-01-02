
public class NewEmployee extends Employee {
    private boolean inUnion = true;
    private boolean overtimeEligible = true;

    public NewEmployee() {
    }

    public NewEmployee(String ID, String na, double h, double r) {
        super(ID, na, h, r);
    }

    public void setPayData(String ID, String na, double h, double r) {
        empID = ID;
        nameID = na;
        hours = h;
        rate = r;
    }

    public void setInUnion(boolean iU) {
        inUnion = iU;
    }

    public void setOvertimeEligible(boolean oE) {
        overtimeEligible = oE;
    }

    public void setOvertimeRate(double oR) {
        overtimeRate = oR;
    }

    // Computes gross pay
    public double computeGross() {
        if (overtimeRate != 1.0)
            return super.computeGross();
        else
            return hours * rate;
    }

    // Computes net pay, given gross pay.
    public double computeNet(double gross) {
        if (inUnion)
            return super.computeNet(gross);
        else
            return gross;
    }

    // Shows employee information.
    public String toString() {
        String result = "Employee ID is " + empID +
                "\nName is " + nameID +
                "\nHours worked are " + hours + "\n" +
                "Hourly rate is $" + rate + "\n";
        if (overtimeEligible)
            result += "The overtime rate is " + overtimeRate +
                    " for hours worked over " + maxNoOvertime + "\n";
        else result += "Not eligible for overtime\n";
        if (inUnion)
            result += "The union dues are $" + dues +
                    " for gross pay over $" + maxNoDues + "\n";
        else
            result += "Not a union member\n";
        return result;
    }
}