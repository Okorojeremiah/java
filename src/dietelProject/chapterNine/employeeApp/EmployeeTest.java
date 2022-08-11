package dietelProject.chapterNine.employeeApp;

public class EmployeeTest {
    public static void main(String[] args) throws IllegalAccessException {
//        CommissionEmployee employee = new BaseEmployee("Jerry", "Okoro","010202222", 0.09, 2000, 20_000);
//        Employee hourlyEmployee = new HourlyEmployee("Wale", "Ayoola", "419", 160, 20);

        Employee commissionCompensationModel = new Employee("Jerry", "Okoro", "0906969",new CommissionCompensationModel("Jerry", "Okoro", "0906969", 2000, 0.09));

        Employee basePlusCompensationModel = new Employee("Jerry", "Okoro", "0906969",new BasePlusCompensationModel("Jerry", "Okoro", "0906969", 2000, 0.09, 20_000));

        System.out.println(commissionCompensationModel);
        System.out.println();
        System.out.println(basePlusCompensationModel);
        System.out.println();
//
//        System.out.println(employee);
//        System.out.println(hourlyEmployee);

        commissionCompensationModel = new Employee("Jerry", "okoro","890-765",new BasePlusCompensationModel("Jerry","Okoro","6789-876",788,0.06,458));
        System.out.println(commissionCompensationModel);
    }
}
