package tut04.act1;

public class Main {
	 public static void main(String[] args) {
	        // Test Person
	        Person p1 = new Person("An", "Hanoi");
	        System.out.println(p1);

	        // Test Student
	        Student s1 = new Student("Binh", "Danang", "Computer Science", 2, 1500.0);
	        System.out.println(s1);

	        s1.setProgram("Data Science");
	        s1.setYear(3);
	        s1.setFee(1800.0);
	        System.out.println("After update: " + s1);

	        // Test Staff
	        Staff st1 = new Staff("Chi", "Saigon", "FPT University", 2000.0);
	        System.out.println(st1);

	        st1.setPay(2200.0);
	        System.out.println("After raise: " + st1);
	    }
}
