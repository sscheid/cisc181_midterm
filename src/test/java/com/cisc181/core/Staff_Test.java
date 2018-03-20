package com.cisc181.core;

import static org.junit.Assert.*;


import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import org.junit.BeforeClass;
import org.junit.Test;

import com.cisc181.eNums.eTitle;

public class Staff_Test {

	@BeforeClass
	public static void setup() {
	}
	
	@Test
	public void test() throws PersonException {
		ArrayList<Staff> SampleStaff = new ArrayList<Staff>();
		
		Calendar cal = Calendar.getInstance();
		
		cal.set(1996, Calendar.SEPTEMBER, 5);  
		Date BirthDate1 = cal.getTime();
		cal.set(2016, Calendar.SEPTEMBER, 1);  
		Date HireDate1 = cal.getTime(); 
		Staff one = new Staff("Samantha", "Paige", "Scheid", BirthDate1, 
				"18 Cleveland St, Newark, DE", "(631)-456-8493", "sscheid@udel.edu",
				"None", 1, 3000.00, HireDate1, eTitle.MS);
		SampleStaff.add(one);
		
		cal.set(1998, Calendar.JUNE, 5);  
		Date BirthDate2 = cal.getTime();
		cal.set(2017, Calendar.JULY, 17);  
		Date HireDate2 = cal.getTime();
		Staff two = new Staff("Peter", "Joseph", "Smith", BirthDate2, 
				"18 Kershaw St, Newark, DE", "(847)-395-3848", "pjs@udel.edu",
				"None", 2, 6000.00, HireDate2, eTitle.MR);
		SampleStaff.add(two);
		
		cal.set(1966, Calendar.SEPTEMBER, 6);  
		Date BirthDate3 = cal.getTime();
		cal.set(2005, Calendar.APRIL, 10);  
		Date HireDate3 = cal.getTime();
		Staff three = new Staff("Charles", "Francis", "Scheid", BirthDate3, 
				"45 Sycamore St, Ronkonkoma, NY", "(631)-984-3747", "cscheid@udel.edu",
				"None", 3, 50000.00, HireDate3, eTitle.MR);
		SampleStaff.add(three);
		
		cal.set(1996, Calendar.APRIL, 26);  
		Date BirthDate4 = cal.getTime();
		cal.set(1989, Calendar.JANUARY, 1);  
		Date HireDate4 = cal.getTime();
		Staff four = new Staff("Renee", "Roux", "Scheid", BirthDate4, 
				"34 Wilbur St, Newark, DE", "(987)-463-7474", "rscheid@udel.edu",
				"None", 4, 75000.00, HireDate4, eTitle.MS);
		SampleStaff.add(four);
		
		cal.set(1996, Calendar.MARCH, 10);  
		Date BirthDate5 = cal.getTime();
		cal.set(2010, Calendar.AUGUST, 15);  
		Date HireDate5 = cal.getTime();
		Staff five = new Staff("Zachary", "Tyler", "Scheid", BirthDate5, 
				"87 First St, New York, New York", "(847)-374-4646", "zscheid@udel.edu",
				"None", 5, 7000.00, HireDate5, eTitle.MR);
		SampleStaff.add(five);
		
		double TotalSalary = 0;
		for (Staff s: SampleStaff) {
			TotalSalary += s.getSalary();
		}
		int AvgSalary = (int) (TotalSalary/5);
		assertEquals(AvgSalary, 28200);
				
	}	
	
	@Test (expected = PersonException.class)
	public void testInvalidPhoneNumberException() throws PersonException {
		Calendar cal = Calendar.getInstance();
		cal.set(1996, Calendar.MARCH, 10);  
		Date BirthDate5 = cal.getTime();
		cal.set(2010, Calendar.AUGUST, 15);  
		Date HireDate5 = cal.getTime();
		// enter invalid phone number... formatted different from (###)-###-####
		Staff six = new Staff("Zachary", "Tyler", "Scheid", BirthDate5, 
				"87 First St, New York, New York", "(847)374-4646", "zscheid@udel.edu",
				"None", 5, 7000.00, HireDate5, eTitle.MR);
	}
	
	@Test (expected = PersonException.class)
	public void testInvalidDOB() throws PersonException {
		Calendar cal = Calendar.getInstance();
		// enter birth date that is more than 100 years ago
		cal.set(1917, Calendar.MARCH, 10);  
		Date BirthDate5 = cal.getTime();
		cal.set(2010, Calendar.AUGUST, 15);  
		Date HireDate5 = cal.getTime();
		Staff seven = new Staff("Zachary", "Tyler", "Scheid", BirthDate5, 
				"87 First St, New York, New York", "(847)-374-4646", "zscheid@udel.edu",
				"None", 5, 7000.00, HireDate5, eTitle.MR);
	}

}
