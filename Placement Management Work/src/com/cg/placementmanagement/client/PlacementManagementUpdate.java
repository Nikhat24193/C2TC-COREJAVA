package com.cg.placementmanagement.client;

import java.time.LocalDate;

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

public class PlacementManagementUpdate {
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
	
	//Update
			user = service.searchUserById(1);
			user.setName("Elizabeth");
			user.setPassword("@Elizabeth");
			service.updateUser(user);
			
			college = service1.searchCollege(1);
			college.setCollegeName("Harvard");
			service1.updateCollege(college);
			
			student = service2.searchStudentById(1);
			student.setName("Selena");
			student.setQualification("BA");
			student.setYear(2019);
			service2.updateStudent(student);
			
			placement = service3.searchPlacement(1);
			placement.setName("Selena");
			placement.setQualification("BA");
			LocalDate d4 = LocalDate.of(2019, 8, 6);
			placement.setDate(d4);
			placement.setYear(2019);
			service3.updatePlacement(placement);
			
			certificate = service4.searchCertificate(1);
			certificate.setYear(2019);
			service4.updateCertificate(certificate);
			
			student.setCertificate(certificate);
			certificate.setStudent(student);
			System.out.println("Data is updated successfully");
			
	}
}
