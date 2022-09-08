package tddClass.account;

public class InvalidPinThrowException extends RuntimeException{
    public InvalidPinThrowException(String s){
        System.out.println(s);
    }
}
