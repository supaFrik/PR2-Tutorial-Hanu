package tut05.act3;

public class Course {
	String code;
	int credits;
	double gradePoints; // e.g., 4.0 for A, 3.0 for B, etc.

	Course(String code, int credits, double gradePoints) {
		if(gradePoints > 4 || gradePoints < 0) {
			throw new RuntimeException("Invalid input grade points");
		}
		this.code = code;
		this.credits = credits;
		this.gradePoints = gradePoints;
	}
}
