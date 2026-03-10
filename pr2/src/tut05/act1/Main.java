package tut05.act1;

public class Main {
	public static void main(String[] args) {
		Instructor instructor = new Instructor();
		Classroom room = new Classroom();
		System.out.println("Main: Student arrives.");
		attend(room, instructor);
		System.out.println("Main: Student leaves.");
	}

	static void attend(Classroom c, Instructor i) {
		System.out.println("Student: Entering classroom.");
		c.beginClass(i);
		System.out.println("Student: Taking notes.");
	}

}
