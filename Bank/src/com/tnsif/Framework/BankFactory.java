package com.tnsif.Framework;
import com.tnsif.Framework.CurrentAcc;
import com.tnsif.Framework.SavingAcc;

public interface BankFactory {


    public abstract CurrentAcc getNewCurrentAccount(int accNo,String accNm,float accBal,float creditLimit);
    public abstract SavingAcc getNewSavingAccount(int accNo,String accNm,float accBal,boolean isSalary);
}


