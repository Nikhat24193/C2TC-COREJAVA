package com.tnsif.Application;

import com.tnsif.Framework.ShopFactory;
import com.tnsif.Framework.NormalAcc;
import com.tnsif.Framework.PrimeAcc;


public class GSShopFactory implements ShopFactory
{
	public GSPrimeAcc getNewPrimeAccount(int accNo,String accNm,float charges,boolean isPrime)
	{
		GSPrimeAcc gsprime=new GSPrimeAcc(accNo,accNm,charges,isPrime);
		return gsprime;
		
	}
	public NormalAcc getNewNormalAccount(int accNo,String accNm,float charges,float deliveryCharge)
	{
		GSNormalAcc gsnormal=new GSNormalAcc(accNo,accNm,charges,deliveryCharge);
		return gsnormal;
		
	}
}
