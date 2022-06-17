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

public class PlacementManagementRead {

	public static void main(String[] args) {
		//User user = new User();
		College college = new College();
		Student student = new Student();
		Student student1 = new Student();
		Student student2 = new Student();
//		Placement placement = new Placement();
//		Placement placement1 = new Placement();
//		Placement placement2 = new Placement();
		Certificate certificate = new Certificate();
		Certificate certificate1 = new Certificate();
		Certificate certificate2 = new Certificate();
		
		//IUserService service = new IUserServiceImpl();
		ICollegeService service1 = new ICollegeServiceImpl();
		IStudentService service2 = new IStudentServiceImpl();
		//IPlacementService service3 = new IPlacementServiceImpl();
		ICertificateService service4 = new ICertificateServiceImpl();
		
		//Retrieval
//				user = service.searchUserById(1);
//				System.out.println(user.getName());
//				System.out.println(user.getType());
//				System.out.println(user.getPassword());
				
				college = service1.searchCollege(1);
				System.out.println(college.getUser());
				System.out.println(college.getCollegeName());
				System.out.println(college.getLocation());
				
				student = service2.searchStudentById(1);
				System.out.println(student.getName());
				System.out.println(student.getCollege());
				System.out.println(student.getRoll());
				System.out.println(student.getQualification());
				System.out.println(student.getCourse());
				System.out.println(student.getYear());
				System.out.println(student.getCertificate());
				System.out.println(student.getHallTicketNo());
				
//				placement = service3.searchPlacement(1);
//				System.out.println(placement.getName());
//				System.out.println(placement.getCollege());
//				System.out.println(placement.getDate());
//				System.out.println(placement.getQualification());
//				System.out.println(placement.getYear());
				
				certificate = service4.searchCertificate(1);
				System.out.println(certificate.getYear());
				System.out.println(certificate.getCollege());
				System.out.println("Data is retrieved successfully");
	}

}
