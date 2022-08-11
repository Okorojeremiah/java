package dietelProject.chapterTen.employeeApp3;


public class HourlyCompensationEmployee implements CompensationModel {

    private double hours;
    private double wage;


    public HourlyCompensationEmployee(double hours, double wage) throws IllegalAccessException {

        if(hours <= 0.0 || hours >= 168){
            throw new IllegalAccessException("Hours should be between 0 and 168");
        }
        if(wage < 0.0){
            throw new IllegalAccessException("Wage cannot be less than 0");
        }
        this.hours = hours;
        this.wage = wage;
    }

    public double getHours() {
        return hours;
    }

    public void setHours(double hours) throws IllegalAccessException {
        this.hours = hours;
        if(hours <= 0.0 || hours >= 168){
            throw new IllegalAccessException("Hours should be between 0 and 168");
        }
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) throws IllegalAccessException {
        this.wage = wage;
        if(wage < 0.0){
            throw new IllegalAccessException("Wage cannot be less than 0");
        }
    }
    @Override
    public double earnings(){
        double earnings = hours * wage;
        double normaHours = 40.0;
        double commissionRate = 1.5;
        double hourDiff = getHours() - normaHours;
        if (hours > normaHours){
            earnings = commissionRate * (hourDiff * wage) + (normaHours * wage);
        }
        return earnings;
    }


//    @Override
    public String toString(){
        return String.format("%s %n%s: %.2f %n%s: %.2f", super.toString(), "Hours", hours, "Earnings", earnings());
    }

}
