package com.mastek.bankapp09;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;
import com.mastek.bankapp.util.InsuffientBalanceException;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    private static BankAccount account;
    
    @BeforeAll
    static void beforAll() {
    	account=new SavingAccount(1001, "Ajit",10000);
    }
    
    @AfterEach
    void afterEach() {
    	account.setBalance(10000);
    }
    
    @Test
    void withdraw1000() {
    	try {
			assertEquals(9000, account.withdraw(1000.00),0);
		} catch (Exception e) {
			e.printStackTrace();
		}
    }
    
    @Test()
    void withdrawException() {
    	Exception e=assertThrows(InsuffientBalanceException.class, ()->account.withdraw(9100));
    	assertEquals("Insufficient balance", e.getMessage());
    }
    
    @AfterAll
    static void afterAll() {
    	account=null;
    }
}
