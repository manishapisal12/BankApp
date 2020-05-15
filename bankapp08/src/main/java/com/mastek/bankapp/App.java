package com.mastek.bankapp;

import com.mastek.bankapp.model.BankAccountList;
import com.mastek.bankapp.model.SavingAccount;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        BankAccountList bankaccountList=new BankAccountList();
        String msg="";
        msg=bankaccountList.createAccount(new SavingAccount(1001,"Ajit",20000));
        System.out.println(msg);
        msg=bankaccountList.createAccount(new SavingAccount(1002,"Amit",21000));
        System.out.println(msg);
        msg=bankaccountList.createAccount(new SavingAccount(1003,"Ankit",22000));
        System.out.println(msg);
        msg=bankaccountList.createAccount(new SavingAccount(1004,"Aarti",20400));
        System.out.println(msg);
        bankaccountList.displayAllAccountDetails();
        
        msg=bankaccountList.createAccount(new SavingAccount(1005,"Aarti",20400));
        System.out.println(msg);
        System.out.println(bankaccountList.totalAccounts());
        
        msg=bankaccountList.closeAccount(1004);
        System.out.println(msg);
        bankaccountList.displayAllAccountDetails();
        
        
    }
}
