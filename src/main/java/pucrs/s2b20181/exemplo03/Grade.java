/*
 * Fabiano Dutra
 * S2B 2018/1
 * TDD exemple - Test Driven Development
 * Exam scores system
 */

package pucrs.s2b20181.exemplo03;

public class Grade {

	public static String calc(double s1, double s2) {
		
		double score = (s1+s2)/2.0;
		if (score >= 7.0) {
			return "Approved";
		}
		else if (score >= 4.0) {
			return "In Exam";
		}
		else {
			return "Reproved";
		}
				
	}

}
