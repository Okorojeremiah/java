package tddClass;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {

    @Test
    @DisplayName("Deposit money, balance increases test")
    public void methodName(){
        //given
        Account jennyAccount = new Account();
        //when
        jennyAccount.deposit(500);
        jennyAccount.deposit(500);
        //check
        assertEquals(1000, jennyAccount.getBalance());
    }

    @Test
    public void withdrawWorktest(){
        //given
        Account jennyAccount = new Account();
        jennyAccount.deposit(5000);
        //when
        jennyAccount.withdraw(2000);
        //check
        assertEquals(3000, jennyAccount.getBalance());

    }




}

