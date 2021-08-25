package casestudy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentMain1 {

	public static void main(String[] args) {

		Student s1 = new Student(12, "Vinay", 25, 85);
		Student s2 = new Student(15, "Ashok", 22, 65);
		Student s3 = new Student(11, "Sandep", 28, 60);
		Student s4 = new Student(20, "Tarun", 18, 45);
		ArrayList<Student> alist = new ArrayList<Student>();
		alist.add(s1);
		alist.add(s2);
		alist.add(s3);
		alist.add(s4);
		// System.out.println(alist);
		// Collections.sort(null);
		// System.out.println();

		for (;;) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Press 1 for SortByName");
			System.out.println("Press 2 for SortByAge");
			System.out.println("Press 3 for SortById");
			System.out.println("Press 4 for SortByMarks");
			System.out.println("Press 5 for Exit");
			System.out.println("Enter your Choice");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				Collections.sort(alist, new SortByName());
				for (Student x : alist) {
					System.out.println("Name is: " + x.getStudent_name());
					System.out.println("Age is :"+x.getStudent_age());
					System.out.println("Id is :"+x.getStudent_id());
					System.out.println("Marks is :" +x.getStudent_marks());
					System.out.println("--------------");
				}
				break;
			case 2:
				Collections.sort(alist, new SortByAge());
				for (Student x : alist) {
					System.out.println("Age is :" + x.getStudent_age());
					System.out.println("Id is :"+x.getStudent_id());
					System.out.println("Name is: " +x.getStudent_name());
					System.out.println("Marks is :" +x.getStudent_marks());
					System.out.println("--------------");
				}
				break;
			case 3:
				Collections.sort(alist, new SortById());
				for (Student x : alist) {
					System.out.println("Id is:" + x.getStudent_id());
					System.out.println("Name is: " +x.getStudent_name());
					System.out.println("Age is :"+x.getStudent_age());
					System.out.println("Marks is :" +x.getStudent_marks());
					System.out.println("--------------");
				}
				break;
			case 4:
				Collections.sort(alist, new SortByMarks());
				for (Student x : alist) {
					System.out.println("Marks is :" + x.getStudent_marks());
					System.out.println("Id is :"+x.getStudent_id());
					System.out.println("Name is: " +x.getStudent_name());
					System.out.println("Age is :"+x.getStudent_age());
					System.out.println("--------------");
				}
				break;
			case 5:
				System.exit(0);

			default:
				System.out.println("Wrong Input ...");
				break;
			}

		}

	}

}
