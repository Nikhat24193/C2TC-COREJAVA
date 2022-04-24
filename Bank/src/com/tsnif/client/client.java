package com.tsnif.client;



import com.tnsif.Application.MMBankFactory;
import com.tnsif.Application.MMCurrentAcc;
import com.tnsif.Application.MMSavingAcc;

public class client 
{
	public static void main(String[] args)
	{
		//step a
		MMBankFactory mmbfactory=new MMBankFactory();
		mmbfactory.getNewSavingAccount(8605656, "Nikhat", 20000, true);
		mmbfactory.getNewCurrentAccount(951129, "imtiyaz", 50000, 100000);
		
		//step b
		MMSavingAcc mmsaving=new MMSavingAcc(8605656, "Nikhat", 20000, true);
		mmsaving.getAccNo();
		mmsaving.getAccNm();
		mmsaving.getAccBal();
		mmsaving.withdraw(20000);
		mmsaving.toString();
		
		MMCurrentAcc mmcurrent=new MMCurrentAcc(951129, "imtiyaz", 50000, 100000);
		mmcurrent.getAccNo();
		mmcurrent.getAccNm();
		mmcurrent.getAccBal();
		mmcurrent.withdraw(50000);
		mmcurrent.toString();


	}

}
