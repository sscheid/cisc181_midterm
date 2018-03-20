package com.cisc181.core;

import java.util.UUID;

public class Section { 
	 
	private UUID CourseID; 
	private UUID SemesterID;
	private UUID SectionID;
	private int RoomID;
	
	public Section(UUID courseID, UUID semesterID, UUID sectionID, int roomID) {
		super();
		CourseID = courseID;
		SemesterID = semesterID;
		SectionID = sectionID;
		RoomID = roomID;
	}

	public UUID getSectionID() {
		return SectionID;
	}

	public void setSectionID(UUID sectionID) {
		SectionID = sectionID;
	}
	
	

}
