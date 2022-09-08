package com.dietelProject.chapterTen.employeeApp2;

public class EmployeeTest {
    public static void main(String[] args) throws IllegalAccessException {

        Employee commissionCompensationModel = new Employee("Jerry", "Okoro", "0906969",new CommissionCompensationModel( 2000, 0.09));

        Employee basePlusCompensationModel = new Employee("Jerry", "Okoro", "0906969",new BasePlusCompensationModel(2000, 0.09, 20_000));
        Employee hourlyCompensationModel = new Employee("Jerry", "Okoro", "0906969",new HourlyCompensationEmployee(160, 200));
        Employee salariedPlusCompensationModel = new Employee("Jerry", "Okoro", "0906969",new SalariedCompensationEmployee(10000));

        System.out.println(commissionCompensationModel);
        System.out.println("=========================");
        System.out.println(basePlusCompensationModel);
        System.out.println("=========================");
        System.out.println(hourlyCompensationModel);
        System.out.println("========================");
        System.out.println(salariedPlusCompensationModel);
        System.out.println("=========================");


        commissionCompensationModel = new Employee("Jerry", "okoro","890-765",new BasePlusCompensationModel(788,0.06,458));
        System.out.println(commissionCompensationModel);
    }
}
