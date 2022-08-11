package dietelProject.chapterTen.employeeApp3;

public class EmployeeTest {
    public static void main(String[] args) throws IllegalAccessException {

//        Employee commissionCompensationModel = new Employee("Jerry", "Okoro", "0906969",new CommissionCompensationModel( 2000, 0.09));
//        Employee basePlusCompensationModel = new Employee("asd","ghjk","3456", new BasePlusCompensationModel(200,0.02,23));
//        Employee hourlyCompensationModel = new Employee("Jerry", "Okoro", "0906969",new HourlyCompensationEmployee(160, 200));
//        Employee salariedPlusCompensationModel = new Employee("Jerry", "Okoro", "0906969",new SalariedCompensationEmployee(10000));

//        System.out.println(commissionCompensationModel);
//        System.out.println("=========================");
//        System.out.println(basePlusCompensationModel);
//        System.out.println("=========================");
//        System.out.println(hourlyCompensationModel);
//        System.out.println("========================");
//        System.out.println(salariedPlusCompensationModel);
//        System.out.println("=========================");


  //      commissionCompensationModel = new Employee("Jerry", "okoro","890-765",new BasePlusCompensationModel(788,0.06,458));
//        System.out.println(commissionCompensationModel);

        Payable[] payable = new Payable[]{
                new Employee("Jerry", "Okoro", "45677",new BasePlusCompensationModel (2000,0.09, 35)),
                new Employee("Jacob", "Kay", "73773", new CommissionCompensationModel(6000, 0.09)),
                new Employee("Ade", "Kola", "63637", new HourlyCompensationEmployee(90, 34)),
                new Employee("Gerald", "James", "4567", new SalariedCompensationEmployee(4000))
        };

        for (Payable payable1 : payable){
            System.out.println(payable1);
            System.out.println(payable1.getClass());
            System.out.println();
        }

    }
}
