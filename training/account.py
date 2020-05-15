'''
Created on 28-Apr-2020

@author: manisha
'''

class BankAccount(object):
    
    def _init_(self,accNo,accName,balance):
        self.accNo=accNo
        self.accName=accName
        self.balance=balance
        BankAccount.counter=BankAccount.counter+1
 
    def _str_(self,*args,**kwargs):
        return self.accNo+" "+self.accName+" "+self.balance
    
    @classmethod
    def
    
        
class SavingAccount(BankAccount):
    
    def _init_(self,accNo,accName,balance):
        BankAccount._init_(self,accNo,accName,balance)
    def _str_(self,*args,**kwargs):
        return self.accNo+" "+self.accName+" "+self.balance


    #def displayBankAccountDetails(self):
     #   print(self.accNo)
      #  print(self.accName)
       # print(self.balance)
        #print(self.Min_bal)
        
       


        