package com.tnsif.Framework;

public class SavingAcc extends BankAcc
{
	
	 private  boolean isSalary;

	public SavingAcc(int accNo,String accNm,float accBal,boolean isSalary) {
		super();
		this.isSalary = isSalary;
	}
	public void withdraw(float accBal)
	{
		
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal
				+ ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()=" + getAccBal()
				+ ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ "]";
	}
	
}
