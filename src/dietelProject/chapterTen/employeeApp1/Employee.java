package dietelProject.chapterTen.employeeApp1;

public abstract class Employee implements Payable {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;

    public Employee(String firstName, String lastName, String socialSecurityNumber ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

//    public abstract double earnings();

    @Override
    public abstract double getPaymentAmount();

    @Override
    public String toString(){
        return String.format("%s: %s %s%n%s: %s", "Name",firstName, lastName, "Security Number", socialSecurityNumber);
    }

}
