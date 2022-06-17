package com.cg.placementmanagement.client;

import com.cg.placementmanagement.entity.Certificate;
import com.cg.placementmanagement.entity.College;
import com.cg.placementmanagement.entity.Placement;
import com.cg.placementmanagement.entity.Student;
import com.cg.placementmanagement.entity.User;
import com.cg.placementmanagement.service.ICertificateService;
import com.cg.placementmanagement.service.ICertificateServiceImpl;
import com.cg.placementmanagement.service.ICollegeService;
import com.cg.placementmanagement.service.ICollegeServiceImpl;
import com.cg.placementmanagement.service.IPlacementService;
import com.cg.placementmanagement.service.IPlacementServiceImpl;
import com.cg.placementmanagement.service.IStudentService;
import com.cg.placementmanagement.service.IStudentServiceImpl;
import com.cg.placementmanagement.service.IUserService;
import com.cg.placementmanagement.service.IUserServiceImpl;

public class PlacementManagementDelete {
	public static void main(String[] args) {

	User user = new User();
	College college = new College();
	Student student = new Student();
	Student student1 = new Student();
	Student student2 = new Student();
	Placement placement = new Placement();
	Placement placement1 = new Placement();
	Placement placement2 = new Placement();
	Certificate certificate = new Certificate();
	Certificate certificate1 = new Certificate();
	Certificate certificate2 = new Certificate();
	
	IUserService service = new IUserServiceImpl();
	ICollegeService service1 = new ICollegeServiceImpl();
	IStudentService service2 = new IStudentServiceImpl();
	IPlacementService service3 = new IPlacementServiceImpl();
	ICertificateService service4 = new ICertificateServiceImpl();
		
		//Delete
				user = service.searchUserById(1);
				college = service1.searchCollege(1);
				student = service2.searchStudentById(3);
				placement = service3.searchPlacement(3);
				certificate = service4.searchCertificate(3);
				
		        service.deleteUser(user);
		        service1.deleteCollege(college);
				service2.deleteStudent(student);
				service3.deletePlacement(placement);
				service4.deleteCertificate(certificate);
				System.out.println("Delete is performed successfully");
	}

}
