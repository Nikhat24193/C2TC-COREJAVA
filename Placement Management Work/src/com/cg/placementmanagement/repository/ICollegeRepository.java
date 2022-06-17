package com.cg.placementmanagement.repository;


import com.cg.placementmanagement.entity.College;

public interface ICollegeRepository {
		
	public College addCollege(College college);
	public College updateCollege(College college);
	public College searchCollege(int id);
	public College deleteCollege(College college);
	public abstract void commitTransaction();
	public abstract void beginTransaction();
	

}

