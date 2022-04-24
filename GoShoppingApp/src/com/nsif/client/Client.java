package com.nsif.client;

import com.tnsif.Application.GSNormalAcc;
import com.tnsif.Application.GSPrimeAcc;
import com.tnsif.Application.GSShopFactory;
public class Client
{
	public static void main(String[] args)
	{
		//step a
		GSShopFactory gssfactory=new GSShopFactory();
		gssfactory.getNewPrimeAccount(111,"Nikhat",2000,true);
		gssfactory.getNewNormalAccount(123, "srk",424,20);
		
		//step b
		GSPrimeAcc gsprime=new GSPrimeAcc(111, "Nikhat", 2000, true);
		gsprime.getAccNo();
		gsprime.getAccNm();
		gsprime.getCharges();
		gsprime.bookProduct(2000);
		gsprime.toString();
		
		GSNormalAcc gsnormal=new GSNormalAcc(123, "srk", 424, 20);
		gsnormal.getAccNo();
		gsnormal.getAccNm();
		gsnormal.getCharges();
		gsnormal.getDeliverycharges();
		gsnormal.bookProduct(424);
		gsnormal.toString();
		
	}


	

}
