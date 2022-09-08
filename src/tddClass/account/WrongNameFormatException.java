package tddClass.account;

public class WrongNameFormatException extends RuntimeException {
    public WrongNameFormatException(String s) {
        System.out.println(s);
    }
}
