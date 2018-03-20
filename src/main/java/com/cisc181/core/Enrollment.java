package com.cisc181.core;

import java.util.UUID;

public class Enrollment {
	 
	private UUID SectionID; 
	private UUID StudentID;
	private UUID EnrollmentID;
	private double Grade;
	
	// no-arg constructor
	private Enrollment() {
		super();
	}
	
	// two-arg constructor
	public Enrollment(UUID sectionID, UUID studentID) {
		super();
		setSectionID(sectionID);
		setStudentID(studentID);
		EnrollmentID = UUID.randomUUID();
	}

	public double getGrade() {
		return Grade;
	}

	public void setGrade(double grade) {
		Grade = grade;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}

	public UUID getStudentID() {
		return StudentID;
	}

	public void setStudentID(UUID studentID) {
		StudentID = studentID;
	}

	public UUID getEnrollmentID() {
		return EnrollmentID;
	}

	public void setEnrollmentID(UUID enrollmentID) {
		EnrollmentID = enrollmentID;
	}
	

}
