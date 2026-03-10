package tut05.act1;

public class Classroom {
	void beginClass(Instructor inst) {
		System.out.println("Classroom: Opening the classroom.");
		inst.prepareLesson();
		inst.startLecture();
		System.out.println("Classroom: Class in progress...");
	}
}
