package com.tnsif.Application;

import com.tnsif.Framework.NormalAcc;

public class GSNormalAcc extends NormalAcc
{

	public GSNormalAcc(int accNo, String accNm, float charges, float deiveryCharge) {
		super(accNo, accNm, charges, deiveryCharge);
		// TODO Auto-generated constructor stub
	}
	
	public void bookProduct(float charges)
	{
		System.out.println("Dear normal user,your product charges are "+charges+" with delivery charge "+deliveryCharge);
	}

	@Override
	public String toString() {
		return "GSNormalAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + ", toString()="
				+ super.toString() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	public void getDeliverycharges() {
		// TODO Auto-generated method stub
		
	}
	

}