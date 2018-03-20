package com.cisc181.core;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.*;

import com.cisc181.eNums.eMajor;

public class Student_Test { 
	
	static ArrayList<Course> CourseTest = new ArrayList<Course>();
	static ArrayList<Semester> SemesterTest = new ArrayList<Semester>();
	static ArrayList<Section> SectionTest = new ArrayList<Section>(); 
	static ArrayList<Student> StudentTest = new ArrayList<Student>();
	static ArrayList<Enrollment> EnrollmentTest = new ArrayList<Enrollment>();
	 
	public static double GPA1;
	public static double GPA2;
	public static double GPA3;
	public static double GPA4;
	public static double GPA5;
	public static double GPA6;
	public static double GPA7;
	public static double GPA8;
	public static double GPA9;
	public static double GPA10;
	public static double GPAsum1 = 0;
	public static double GPAsum2 = 0;
	public static double GPAsum3 = 0;
	public static double GPAsum4 = 0;
	public static double GPAsum5 = 0;
	public static double GPAsum6 = 0;
	public static double GPAsum7 = 0;
	public static double GPAsum8 = 0;
	public static double GPAsum9 = 0;
	public static double GPAsum10 = 0;
	public static int course1avg;
	public static int course2avg;
	public static int course3avg;
	public static int section1sum = 0;
	public static int section2sum = 0;
	public static int section3sum = 0;
	public static int section4sum = 0;
	public static int section5sum = 0;
	public static int section6sum = 0;

	@BeforeClass
	public static void setup() throws PersonException {
		// add courses
		Course course1 = new Course(UUID.randomUUID(), "Computer Science", 300, eMajor.COMPSI);
		Course course2 = new Course(UUID.randomUUID(), "Chemistry", 200, eMajor.CHEM);
		Course course3 = new Course(UUID.randomUUID(), "Physics", 100, eMajor.PHYSICS);
		
		CourseTest.add(course1);
		CourseTest.add(course2);
		CourseTest.add(course3);
		
		// add semesters
		Calendar cal = Calendar.getInstance();
		cal.set(2017, Calendar.SEPTEMBER, 1);  
		Date StartDateFall = cal.getTime();
		cal.set(2017, Calendar.DECEMBER, 20);  
		Date EndDateFall = cal.getTime();
		
		Semester fall = new Semester(UUID.randomUUID(), StartDateFall, EndDateFall);
		//didn't use Date because deprecated...
		//Semester fall = new Semester(UUID.randomUUID(),new Date(2017, 9, 1), EndDateFall);
		
		cal.set(2018, Calendar.FEBRUARY, 8);  
		Date StartDateSpring = cal.getTime();
		cal.set(2018, Calendar.MAY, 25);  
		Date EndDateSpring = cal.getTime();
		
		Semester spring = new Semester(UUID.randomUUID(), StartDateSpring, EndDateSpring);
		
		SemesterTest.add(fall);
		SemesterTest.add(spring);
		
		// add sections
		Section section1 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 1);
		Section section2 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 2);
		Section section3 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 3);
		Section section4 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 4);
		Section section5 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 5);
		Section section6 = new Section(UUID.randomUUID(), UUID.randomUUID(), UUID.randomUUID(), 6);
		
		SectionTest.add(section1);
		SectionTest.add(section2);
		SectionTest.add(section3);
		SectionTest.add(section4);
		SectionTest.add(section5);
		SectionTest.add(section6);
		
		// add students
		cal.set(1996, Calendar.SEPTEMBER, 5);  
		Date BirthDate1 = cal.getTime();
		Student student1 = new Student("Samantha", "Paige", "Scheid", BirthDate1, eMajor.COMPSI,
				"45 Cleveland St, Newark, DE", "(384)-586-2938", "sscheid@udel.edu");
		
		cal.set(1996, Calendar.JANUARY, 5);  
		Date BirthDate2 = cal.getTime();
		Student student2 = new Student("Marissa", "Ann", "Smith", BirthDate2, eMajor.NURSING,
				"12 Cleveland St, Newark, DE", "(384)-748-2938", "msmith@udel.edu");
		
		cal.set(1998, Calendar.JUNE, 25);  
		Date BirthDate3 = cal.getTime();
		Student student3 = new Student("Katie", "Patricia", "Johnson", BirthDate3, eMajor.BUSINESS,
				"45 Kershaw St, Newark, DE", "(839)-586-2938", "kjohnson@udel.edu");
		
		cal.set(1990, Calendar.JANUARY, 5);  
		Date BirthDate4 = cal.getTime();
		Student student4 = new Student("Kevin", "Peter", "Scheid", BirthDate4, eMajor.CHEM,
				"78 Wilbur St, Newark, DE", "(847)-283-1967", "kscheid@udel.edu");
		
		cal.set(1993, Calendar.FEBRUARY, 5);  
		Date BirthDate5 = cal.getTime();
		Student student5 = new Student("Garrett", "Robert", "Smith", BirthDate5, eMajor.COMPSI,
				"234 North St, Newark, DE", "(847)-384-5696", "gsmith@udel.edu");
		
		cal.set(1998, Calendar.MARCH, 5);  
		Date BirthDate6 = cal.getTime();
		Student student6 = new Student("Kelsey", "Megan", "Lovett", BirthDate6, eMajor.NURSING,
				"87 South St, Newark, DE", "(234)-586-2233", "klovett@udel.edu");
		
		cal.set(1999, Calendar.APRIL, 6);  
		Date BirthDate7 = cal.getTime();
		Student student7 = new Student("Andrew", "Henry", "Gannin", BirthDate7, eMajor.BUSINESS,
				"45 Academy St, Newark, DE", "(907)-343-8678", "agannin@udel.edu");
		
		cal.set(1995, Calendar.MAY, 23);  
		Date BirthDate8 = cal.getTime();
		Student student8 = new Student("Frank", "Ryan", "Peterson", BirthDate8, eMajor.COMPSI,
				"89 Mason St, Newark, DE", "(384)-343-5843", "fpeterson@udel.edu");
		
		cal.set(1996, Calendar.JUNE, 19);  
		Date BirthDate9 = cal.getTime();
		Student student9 = new Student("Emily", "Patty", "Tonson", BirthDate9, eMajor.COMPSI,
				"23 Treehill St, Newark, DE", "(232)-546-3794", "etonson@udel.edu");
		
		cal.set(1992, Calendar.JULY, 4);  
		Date BirthDate10 = cal.getTime();
		Student student10 = new Student("Zachary", "Tyler", "Scheid", BirthDate10, eMajor.PHYSICS,
				"75 Green St, Newark, DE", "(384)-586-2938", "zscheid@udel.edu");
		
		StudentTest.add(student1);
		StudentTest.add(student2);
		StudentTest.add(student3);
		StudentTest.add(student4);
		StudentTest.add(student5);
		StudentTest.add(student6);
		StudentTest.add(student7);
		StudentTest.add(student8);
		StudentTest.add(student9);
		StudentTest.add(student10);
		
		
		for (Student st:StudentTest) {
			for (Section s: SectionTest) {
				Enrollment E = new Enrollment(s.getSectionID(),st.getStudentID());
				EnrollmentTest.add(E);
			}
		}
		
		for (int i = 0; i<EnrollmentTest.size(); i++) {
			if (i>=0 && i<6) {
				// student 1 gets a grade of 10 for each section
				EnrollmentTest.get(i).setGrade(10);
			}
			if (i>=6 && i<12) {
				EnrollmentTest.get(i).setGrade(20);
			}
			if (i>=12 && i<18) {
				EnrollmentTest.get(i).setGrade(30);
			}
			if (i>=18 && i<24) {
				EnrollmentTest.get(i).setGrade(40);
			}
			if (i>=24 && i<30) {
				EnrollmentTest.get(i).setGrade(50);
			}
			if (i>=30 && i<36) {
				EnrollmentTest.get(i).setGrade(60);
			}
			if (i>=36 && i<42) {
				EnrollmentTest.get(i).setGrade(70);
			}
			if (i>=42 && i<48) {
				EnrollmentTest.get(i).setGrade(80);
			}
			if (i>=48 && i<54) {
				EnrollmentTest.get(i).setGrade(90);
			}
			if (i>=54 && i<60) {
				EnrollmentTest.get(i).setGrade(100);
			}
		}
		
		// calculate GPAs
		for (int i = 0; i<EnrollmentTest.size(); i++) {
			 int number_grade = (int) EnrollmentTest.get(i).getGrade();
			 // convert number grade to GPA scale
			 double gpa_grade;
			 if (number_grade >= 93) {
				 gpa_grade = 4.0;
			 }
			 else if (number_grade >= 90 && number_grade <=92) {
				 gpa_grade = 3.7;
			 }
			 else if (number_grade >= 87 && number_grade <=89) {
				 gpa_grade = 3.3;
			 }
			 else if (number_grade >= 83 && number_grade <=86) {
				 gpa_grade = 3.0;
			 }
			 else if (number_grade >= 80 && number_grade <=82) {
				 gpa_grade = 2.7;
			 }
			 else if (number_grade >= 77 && number_grade <=79) {
				 gpa_grade = 2.3;
			 }
			 else if (number_grade >= 73 && number_grade <=76) {
				 gpa_grade = 2.0;
			 }
			 else if (number_grade >= 70 && number_grade <=72) {
				 gpa_grade = 1.7;
			 }
			 else if (number_grade >= 67 && number_grade <=69) {
				 gpa_grade = 1.3;
			 }
			 else if (number_grade >= 65 && number_grade <=66) {
				 gpa_grade = 1.0;
			 }
			 else {
				 gpa_grade = 0.0;
			 }
			 
			 if (i>=0 && i<6) {
				 GPAsum1 += gpa_grade;
			 }
			 if (i>=6 && i<12) {
				 GPAsum2 += gpa_grade;
			 }
			 if (i>=12 && i<18) {
				 GPAsum3 += gpa_grade;
			 }
			 if (i>=18 && i<24) {
				 GPAsum4 += gpa_grade;
			 }
			 if (i>=24 && i<30) {
				 GPAsum5 += gpa_grade;
			 }
			 if (i>=30 && i<36) {
				 GPAsum6 += gpa_grade;
			 }
			 if (i>=36 && i<42) {
				 GPAsum7 += gpa_grade;
			 }
			 if (i>=42 && i<48) {
				 GPAsum8 += gpa_grade;
			 }
			 if (i>=48 && i<54) {
				 GPAsum9 += gpa_grade;
			 }
			 if (i>=54 && i<60) {
				 GPAsum10 += gpa_grade;
			 }
		}
		
		GPA1 = GPAsum1 / 6;
		GPA2 = GPAsum2 / 6;
		GPA3 = GPAsum3 / 6;
		GPA4 = GPAsum4 / 6;
		GPA5 = GPAsum5 / 6;
		GPA6 = GPAsum6 / 6;
		GPA7 = GPAsum7 / 6;
		GPA8 = GPAsum8 / 6;
		GPA9 = GPAsum9 / 6;
		GPA10 = GPAsum10 / 6;
		
	
		// calculate average grade for each course
		// assume sections 1 and 2 are for course 1
		// assume sections 3 and 4 are for course 2
		// assume sections 5 and 6 are for course 3
		for (int j = 0; j<EnrollmentTest.size(); j+=6) {
			section1sum += EnrollmentTest.get(j).getGrade();
		}
		for (int j = 1; j<EnrollmentTest.size(); j+=6) {
			section2sum += EnrollmentTest.get(j).getGrade();
		}
		for (int j = 2; j<EnrollmentTest.size(); j+=6) {
			section3sum += EnrollmentTest.get(j).getGrade();
		}
		for (int j = 3; j<EnrollmentTest.size(); j+=6) {
			section4sum += EnrollmentTest.get(j).getGrade();
		}
		for (int j = 4; j<EnrollmentTest.size(); j+=6) {
			section5sum += EnrollmentTest.get(j).getGrade();
		}
		for (int j = 5; j<EnrollmentTest.size(); j+=6) {
			section6sum += EnrollmentTest.get(j).getGrade();
		}
		
		course1avg = (section1sum + section2sum) / 12;
		course2avg = (section3sum + section4sum) / 12;
		course3avg = (section5sum + section6sum) / 12;
		
		System.out.println(course1avg);
			
	}

	@Test
	public void test() throws PersonException {
		
		assertEquals(GPA1, 0, 0);
		assertEquals(GPA2, 0, 0);
		assertEquals(GPA3, 0, 0);
		assertEquals(GPA4, 0, 0);
		assertEquals(GPA5, 0, 0);
		assertEquals(GPA6, 0, 0);
		assertEquals(GPA7, 1.7, 0.1);
		assertEquals(GPA8, 2.7, 0.1); 
		assertEquals(GPA9, 3.7, 0.1);
		assertEquals(GPA10, 4, 0);
		assertEquals(course1avg,91);
		assertEquals(course2avg,91);
		assertEquals(course3avg,91);


	}
}