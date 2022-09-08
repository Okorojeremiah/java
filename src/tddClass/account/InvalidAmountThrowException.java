package tddClass.account;

public class InvalidAmountThrowException extends RuntimeException{

    public InvalidAmountThrowException(String s){
        System.out.println(s);
    }
}
