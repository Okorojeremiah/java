package tddClass.bankApp;

public class InvalidRecipientAccountNumberException extends RuntimeException{

    public InvalidRecipientAccountNumberException(String s){
        System.out.println(s);
    }

}
