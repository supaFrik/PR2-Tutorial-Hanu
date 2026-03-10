package tut05.act3;

public class StudentManagementSystem {
	Student[] students;

	StudentManagementSystem(int capacity) {
		students = new Student[capacity];
	}

	void displayAll() {
		System.out.println("== Displaying All Students ==");
		for (int i = 0; i < students.length; i++) {
			Student s = students[i];
			if(s == null) {
				System.out.println(i + " is empty");
				continue;
			}
			s.printSummary();
		}
	}

	Student findById(int targetId) {
		System.out.println("== Searching for student id " + targetId + " ==");
		int i = 0;
		while (i < students.length) {
			System.out.println("Checking student id: " + i);
			Student s = students[i];
			if (s != null && s.id == targetId) {
				System.out.println("Found " + targetId);
				return s;
			}
			i++;
		}
		System.out.println("Student with id: " + targetId + " is not found");
		return null;
	}

	public static void main(String[] args) {
		System.out.println("Program started");
		StudentManagementSystem sms = new StudentManagementSystem(3);

		sms.students[0] = new Student(1, "Alice", 3);
		sms.students[1] = new Student(2, "Bob", 3);	

		sms.displayAll();

		Student unknown = sms.findById(99);
		
//		if(unknown == null) {
//			System.out.println("Student not found!");
//		}

		Course c1 = new Course("CS101", 3, 4.0);
		Course c2 = new Course("MA101", 4, 3.0);
		Course c3 = new Course("PH101", 2, 3.5);
		Course c4 = new Course("EN101", 3, 3.7); // 4th course
		
		sms.students[0].enrollCourse(c1);
		sms.students[0].enrollCourse(c2);
		sms.students[0].enrollCourse(c3);
		sms.students[0].enrollCourse(c4);

		double gpa = sms.students[0].calculateGPA();
		System.out.println("Alice GPA = " + gpa);

		System.out.println("Program ended");
	}
}
