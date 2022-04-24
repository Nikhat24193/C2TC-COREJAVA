package com.tnsif.Application;

import com.tnsif.Framework.SavingAcc;

public class MMSavingAcc extends SavingAcc
{
	private static final float MINBAL=0;
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super(accNo, accNm, accBal, isSalary);
		// TODO Auto-generated constructor stub
	}
	
	public void withdraw(float accBal)
	{
		System.out.println("Dear saving user,your account balance is " +accBal);
	}

	@Override
	public String toString() {
		return "MMSavingAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
