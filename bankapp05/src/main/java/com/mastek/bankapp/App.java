package com.mastek.bankapp;

import com.mastek.bankapp.model.BankAccount;
import com.mastek.bankapp.model.SavingAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$\n\n" );
//        BankAccount account1=new BankAccount(1001,"Amit",200000.00);
//        BankAccount account2=new BankAccount(1002,"Amit",200000.00);
//        BankAccount account3=new BankAccount(1003,"Amit",200000.00);
        //Dynamic Polymorphism 
         BankAccount account1=new SavingAccount(1001,"Amit",20000);	
         ((SavingAccount) account1).customMethod();
         
         System.out.println("After deposit "+account1.deposit(1000));
         
         System.out.println("After withdraw "+account1.withdraw(2000));
         
         account1=new BankAccount(1001,"Amit",20000);	
         
         System.out.println("After withdraw "+account1.withdraw(2000));
         
    }
}
