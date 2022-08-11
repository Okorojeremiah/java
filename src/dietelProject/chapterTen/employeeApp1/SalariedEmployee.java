package dietelProject.chapterTen.employeeApp1;

public class SalariedEmployee extends Employee {
    private double weeklySalary;

    public SalariedEmployee(String firstName, String lastName, String socialSecurityNumber, double weeklySalary) throws IllegalAccessException {
        super(firstName, lastName, socialSecurityNumber);
        this.weeklySalary = weeklySalary;
        if (weeklySalary < 0.0){
            throw new IllegalAccessException("Weekly salary cannot be less than 0");
        }
    }

    public double getWeeklySalary() {
        return weeklySalary;
    }

    public void setWeeklySalary(double weeklySalary) throws IllegalAccessException {
        if (weeklySalary < 0.0){
            throw new IllegalAccessException("Weekly salary cannot be less than 0");
        }
        this.weeklySalary = weeklySalary;
    }
    @Override
    public  double getPaymentAmount(){
        return getWeeklySalary();
    }

    @Override
    public String toString(){
        return String.format("%s %n%s: %.2f", super.toString(), "Weekly salary", getPaymentAmount());
    }
}
