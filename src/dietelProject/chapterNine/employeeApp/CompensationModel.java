package dietelProject.chapterNine.employeeApp;

public class CompensationModel {
    private String firstName;
    private String lastname;
    private String socialSecurityNumber;

    public CompensationModel(String firstName, String lastname, String socialSecurityNumber){
        this.firstName = firstName;
        this.lastname = lastname;
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public double earnings(){
        return 0;
    }

    public String toString(){
        return String.format("%s: %s %s%n%s: %s", "Name", getFirstName(), getLastname(), "Social Security Number", getSocialSecurityNumber());
    }
}
