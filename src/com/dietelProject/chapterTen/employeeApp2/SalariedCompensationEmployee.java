package com.dietelProject.chapterTen.employeeApp2;

public class SalariedCompensationEmployee implements CompensationModel{
    private double weeklySalary;

    public SalariedCompensationEmployee(double weeklySalary) throws IllegalAccessException {
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
    public  double earnings(){
        return getWeeklySalary();
    }
}
