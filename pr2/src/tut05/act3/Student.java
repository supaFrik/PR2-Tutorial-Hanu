package tut05.act3;

public class Student {
	int id;
	String name;
	Course[] courses;
	int courseCount;

	Student(int id, String name, int maxCourses) {
		if(id <= 0 || maxCourses <= 0 || name == null) {
			throw new RuntimeException("Id, name or max courses is invalid");
		}
		if(courseCount >= maxCourses) {
			throw new RuntimeException("Outnumbered max courses");
		}
		this.id = id;
		this.name = name;
		this.courses = new Course[maxCourses];
		this.courseCount = 0;
	}

	void enrollCourse(Course c) {
		if (courseCount < courses.length) {
			courses[courseCount] = c;
			courseCount++;
		} else {
			System.out.println("No more space for more courses");
		}
	}

	double calculateGPA() {
		if (courseCount == 0) {
			return 0.0;
		}

		int totalCredits = 0;
		double totalQualityPoints = 0.0;

		for (int i = 0; i < courseCount; i++) {
			totalCredits += courses[i].credits;
			totalQualityPoints += courses[i].gradePoints * courses[i].credits;
		}

		double gpa = totalCredits / totalQualityPoints;
		return gpa;
	}

	void printSummary() {
		System.out.println("Student #" + id + " - " + name + " - Courses: " + courseCount);
	}
}
