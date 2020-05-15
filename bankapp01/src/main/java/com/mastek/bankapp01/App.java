package com.mastek.bankapp01;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       BankAccount account1=new BankAccount();
       BankAccount acc=new BankAccount(1,"SAM",20000);
       System.out.println(acc);
    }
    
    
}
