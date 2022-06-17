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

public class PlacementManagementCreate {
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
		
	//Create
			user.setId(1);
			user.setName("Victoria");
			user.setPassword("@Victoria");
			user.setType("College Admin");
			
			college.setId(1); 
			college.setCollegeName("MIT");
			college.setLocation("Cambridge");
			
			student.setId(1);
			student.setName("Emma");
			student.setRoll(50);
			student.setQualification("BSc");
			student.setCourse("CS");
			student.setYear(2021);
			student.setHallTicketNo(123437);
			student1.setId(2);
			student1.setName("Emily");
			student1.setRoll(60);
			student1.setQualification("MSc");
			student1.setCourse("IT");
			student1.setYear(2022);
			student1.setHallTicketNo(123457);
			student2.setId(3);
			student2.setName("Rose");
			student2.setRoll(70);
			student2.setQualification("PhD");
			student2.setCourse("Chemistry");
			student2.setYear(2020);
			student2.setHallTicketNo(123458);
			
			placement.setId(1); 
			placement.setName("Emma");
			LocalDate d1 = LocalDate.of(2021, 12, 1);
			placement.setDate(d1);
			placement.setQualification("BSc"); 
			placement.setYear(2021);
			placement1.setId(2); 
			placement1.setName("Emily");
			LocalDate d2 = LocalDate.of(2022, 11, 2);
			placement1.setDate(d2);
			placement1.setQualification("MSc"); 
			placement1.setYear(2022);
			placement2.setId(3); 
			placement2.setName("Rose");
			LocalDate d3 = LocalDate.of(2020, 9, 3);
			placement2.setDate(d3);
			placement2.setQualification("PhD"); 
			placement2.setYear(2020);
			
			certificate.setId(1);
			certificate.setYear(2021);
			certificate1.setId(2);
			certificate1.setYear(2022);
			certificate2.setId(3);
			certificate2.setYear(2020);
			
			college.setUser(user);
			college.addStudent1(student);
			college.addStudent1(student1);
			college.addStudent1(student2);
			college.addPlacement1(placement);
			college.addPlacement1(placement1);
			college.addPlacement1(placement2);
			college.addCertificate1(certificate);
			college.addCertificate1(certificate1);
			college.addCertificate1(certificate2);
			student.setCertificate(certificate);
			student1.setCertificate(certificate1);
			student2.setCertificate(certificate2);
			certificate.setStudent(student);
			certificate1.setStudent(student1);
			certificate2.setStudent(student2);
			
			service.addUser(user);
			service1.addCollege(college);
			service2.addStudent(student);
			service2.addStudent(student1);
			service2.addStudent(student2);
			service3.addPlacement(placement);
			service3.addPlacement(placement1);
			service3.addPlacement(placement2);
			service4.addCertificate(certificate);
			service4.addCertificate(certificate1);
			service4.addCertificate(certificate2);
			System.out.println("Data is created successfully");
			
	}		

}
