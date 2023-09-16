package com.test;

import org.junit.Assert;
import org.junit.Test;

import com.exception.IllegalMarksException;
import com.service.MarksService;

public class MarksServiceTest {

	MarksService markService = new MarksService();

	@Test
	public void computePercentTest() {
		
		try {
			double marks[] = { 70, 80, 75, 90, 81 };
			Assert.assertEquals(79, Math.round(markService.computePercentage(marks, 500, 6, 100)));
		}

		catch (IllegalMarksException e) {
			Assert.assertEquals("No Of Marks given do not match with Number of Subjects!!!".toLowerCase(),
					e.getMessage().toLowerCase());
		}

		try {
			double marks[] = { 70, 80, 75, 900, 81 };
			Assert.assertEquals(79, Math.round(markService.computePercentage(marks, 500, 5, 100)));
		} catch (IllegalMarksException e) {
			Assert.assertEquals("Entered Marks Should be less than per subject marks!!!".toLowerCase(),
					e.getMessage().toLowerCase());
		}

	}

	/*
	 * @Test public void grade() { double marks[]= {70,80,75,90,81};
	 * Assert.assertEquals('B', markService.computeGrade(marks, 500)); }
	 */

}
