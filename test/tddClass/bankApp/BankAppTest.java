package tddClass.bankApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tddClass.account.Account;
import tddClass.account.InvalidAmountThrowException;
import tddClass.account.InvalidPinThrowException;

import static org.junit.jupiter.api.Assertions.*;

public class BankAppTest {

    BankApp wemaBank;

    @BeforeEach
    public void testStartWith(){
        wemaBank = new BankApp();
    }

    @Test
    public void testThatBankExist(){
        //given that bank exist
        assertNotEquals(null, wemaBank);
    }

    @Test
    public void testToCreateAnAccount(){
        //given that bank exists
        //I can create an account
        wemaBank.createAccount("Jerry",  "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());
        wemaBank.createAccount("Jayblinks", "2345");
        assertEquals("Jayblinks", wemaBank.findAccounts("2").getName());

    }

    @Test
    public void createAccountFindAccountByAccountNumber(){
        //given that customer creates an account
        //when the bank search for customer account with the account number
        //customer account name should be the same with the account created

        wemaBank.createAccount("Jerry", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccounts("1");
        assertEquals("Jerry", account.getName());
        assertEquals("1",account.getNumber());
    }

    @Test
    public  void customerCanDepositWithAccountNumber(){
        //given that customer creates an account
        //when they make deposit in the account with their account number
        //Let their balance increase

        wemaBank.createAccount("Jerry", "2727");
        assertEquals(1, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccounts("1");
        wemaBank.deposit(2000,"1");
        assertEquals(2000, account.getBalance("2727"));
    }

    @Test
    public void customerCanWithdrawWithAccountNumber(){
        //given that customer has money in their account
        //when they make withdrawal with their account number
        //Let their balance be less than their previous balance

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.deposit(2000, "1");

        Account account = wemaBank.findAccounts("1");
        wemaBank.withdrawal(2000, "2727", "1");
        assertEquals(0, account.getBalance("2727"));
    }

    @Test
    public void customerCannotWithdrawANegativeAmount() throws InvalidAmountThrowException{
        //given that customer has money in their account
        //when they try to make a negative withdrawal with their account number
        //It throws an exception and their balance remain the same

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.deposit(2000, "1");

        Account account = wemaBank.findAccounts("1");
        assertThrows(InvalidAmountThrowException.class, ()->wemaBank.withdrawal(-2000, "2727", "1"));
        assertEquals(2000, account.getBalance("2727"));
    }

    @Test
    public void customerCanTransferFromTheirAccount() throws IllegalAccessException {
        //given that customer has money in their account
        //when they make transfer from their account
        //Let their balance be less than their previous balance

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");
        wemaBank.createAccount("Habib","3030");
        assertEquals(3, wemaBank.getNumberOfCustomers());

        Account account = wemaBank.findAccounts("1");
        Account account2 = wemaBank.findAccounts("2");
        Account account3 = wemaBank.findAccounts("3");

        wemaBank.deposit(2000, "1");
        wemaBank.transfer(2000,"2727", "1","2");
        assertEquals(0, account.getBalance("2727"));
        assertEquals(2000, account2.getBalance("2828"));
        wemaBank.transfer(2000, "2828","2", "3");
        assertEquals(0, account2.getBalance("2828"));
        assertEquals(2000, account3.getBalance("3030"));
        wemaBank.transfer(2000, "3030","3", "1");
        assertEquals(2000, account.getBalance("2727"));
        assertEquals(0, account2.getBalance("2828"));
        assertEquals(0, account3.getBalance("3030"));
    }

    @Test
    public void customerCannotTransferASumGreaterThanTheirBalance() throws InvalidAmountThrowException {
        //given that customer has money in their account
        //when they try to transfer an amount greater than their balance
        //It throws an exception and their balance remain the same

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");
        Account account2 = wemaBank.findAccounts("2");

        wemaBank.deposit(2000, "1");
        assertThrows(InvalidAmountThrowException.class, ()->wemaBank.transfer(20000,"2727", "1","2"));
        assertEquals(2000, account.getBalance("2727"));
        assertEquals(0, account2.getBalance("2828"));
    }

    @Test
    public void customerCannotTransferANegativeAmount() throws InvalidAmountThrowException {
        //given that customer has money in their account
        //when they try to make a negative transfer
        //It throws an exception and their balance remain the same

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");
        Account account2 = wemaBank.findAccounts("2");

        wemaBank.deposit(2000, "1");
        assertThrows(InvalidAmountThrowException.class, ()->wemaBank.transfer(-2000,"2727", "1","2"));
        assertEquals(2000, account.getBalance("2727"));
        assertEquals(0, account2.getBalance("2828"));
    }

    @Test
    public void customerCannotTransferWithWrongPin() throws InvalidPinThrowException {
        //given that customer has money in their account
        //when they try to make a transfer with wrong pin
        //It throws an exception and their balance remain the same

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");
        Account account2 = wemaBank.findAccounts("2");

        wemaBank.deposit(9000, "1");
        assertThrows(InvalidPinThrowException.class, ()->wemaBank.transfer(2000,"2728", "1","2"));
        assertEquals(9000, account.getBalance("2727"));
        assertEquals(0, account2.getBalance("2828"));
    }

    @Test
    public void customerCannotTransferToTheirOwnAccount() throws InvalidRecipientAccountNumberException {
        //given that customer has money in their account
        //when they try to make a transfer to their own account
        //It throws an exception

        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");

        wemaBank.deposit(9000, "1");
        assertThrows(InvalidRecipientAccountNumberException.class, ()->wemaBank.transfer(2000,"2727", "1","1"));
        assertEquals(9000, account.getBalance("2727"));
    }

    @Test
    public void customerCanCheckTheirBalanceWithTheirPin() {
        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");
        wemaBank.deposit(9000, "1");
        assertEquals(9000, wemaBank.checkBalance("1","2727"));
    }

    @Test
    public void customerCanCheckCannotTheirBalanceWithTheirPin() throws InvalidPinThrowException{
        wemaBank.createAccount("Jerry", "2727");
        wemaBank.createAccount("Banke", "2828");

        Account account = wemaBank.findAccounts("1");
        wemaBank.deposit(9000, "1");
        assertThrows(InvalidPinThrowException.class, ()-> wemaBank.checkBalance("1","1"));
    }

    @Test
    public void InvalidRecipientAccountNumberException(){
        wemaBank.createAccount("Jerry", "2727");
        Account account = wemaBank.findAccounts("1");
        assertThrows(InvalidRecipientAccountNumberException.class, ()->wemaBank.transfer(2000,"2727","1","1"));
    }

}
