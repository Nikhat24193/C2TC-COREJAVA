package com.cg.placementmanagement.service;


import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.entity.College;
import com.cg.placementmanagement.repository.ICollegeRepository;
import com.cg.placementmanagement.repository.ICollegeRepositoryImpl;

public class ICollegeServiceImpl implements ICollegeService{

	private ICollegeRepository dao;

	public ICollegeServiceImpl() {
	dao = new ICollegeRepositoryImpl();	
    }

	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College searchCollege(int id) {
	College college = dao.searchCollege(id);
		return college;
	}


	@Override
	public College deleteCollege(College college) {
		dao.beginTransaction();
		dao.deleteCollege(college);
		dao.commitTransaction();
			return college;
		}


	

}

