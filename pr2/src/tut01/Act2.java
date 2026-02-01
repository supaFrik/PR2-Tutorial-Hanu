package tut01;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Act2 {
	int result;
	
	public Act2() {
		this.result = 0;
	}
	
	int add(int a, int b) {
		this.result = a + b;
		return this.result;
	}
	
	int subtract(int a, int b) {
		this.result = a - b;
		return this.result;
	}
	int multiply(int a, int b) {
		this.result = a * b;
		return this.result;
	}
	int divide(int a, int b) {
		if(b == 0) {
			throw new IllegalArgumentException("Cannot divide by 0.");
		}
		this.result = a / b;
		return this.result;
	}	
	public static void main(String[] args) {
		Act2 act2c = new Act2();
		System.out.println(act2c.add(5, 3));
		System.out.println(act2c.multiply(5, 3));
	}

//  Act 2 - a
//	public static void main(String[] args) {
//		int arr[] = {64, 34, 25, 12, 22, 11, 90};
//		int n = arr.length;
//		bubbleSort(arr, n);
//		printArray(arr, n);
//	}
//	
//	public static void bubbleSort(int arr[], int n) {
//		for(int i = 0; i < n - 1; i++) {
//			for(int j = 0; j < n - i - 1; j++) {
//				if(arr[j] > arr[j + 1]) {
//					int temp = arr[j];
//					arr[j] = arr[j + 1];
//					arr[j + 1] = temp;
//				}
//			}
//		}
//	}
//	
//	public static void printArray(int arr[], int n) {
//		for(int i = 0; i < n; i++) {
//			System.out.printf("%d ", arr[i]);
//		}
//	}
	
//	static Map<String, Integer> students  = new HashMap<>();
//	
//	public static void addStudent(String name, int grade) {
//		students.put(name, grade);
//	}
//	
//	static double getAverage() {
//		if(students.isEmpty()) {
//			return 0;
//		}
//		
//		double sum = 0;
//		for(double grade : students.values()) {
//			sum += grade;
//		}
//		return  sum / students.size();
//	}
//	
//	static String getTopStudent() {
//		if(students.isEmpty()) {
//			return null;
//		}
//		String topStudent = null;
//		double maxGrade = Double.MIN_VALUE;
//		Set<String> stuNames = students.keySet();
//		for(String stuName : stuNames) {
//			if(students.get(stuName) > maxGrade) {
//				maxGrade = students.get(stuName);
//				topStudent = stuName;
//			}
//		}
//		return topStudent;
//	}
//	
//	public static void main(String[] args) {
//		addStudent("Alice", 85);
//		addStudent("Bob", 92);
//		addStudent("Charlie", 78);
//		
//		System.out.println("Average grade: " + getAverage());
//		System.out.println();
}
