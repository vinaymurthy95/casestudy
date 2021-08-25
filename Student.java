package casestudy;

import java.util.ArrayList;

public class Student implements Comparable<Student> {

	int student_id;
	String student_name;
	int student_age;
	int student_marks;

	public Student(int student_id, String student_name, int student_age, int student_marks) {
		super();
		this.student_id = student_id;
		this.student_name = student_name;
		this.student_age = student_age;
		this.student_marks = student_marks;
	}

	public int getStudent_id() {
		return student_id;
	}

	public void setStudent_id(int student_id) {
		this.student_id = student_id;
	}

	public String getStudent_name() {
		return student_name;
	}

	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}

	public int getStudent_age() {
		return student_age;
	}

	public void setStudent_age(int student_age) {
		this.student_age = student_age;
	}

	public int getStudent_marks() {
		return student_marks;
	}

	public void setStudent_marks(int student_marks) {
		this.student_marks = student_marks;
	}

	@Override
	public String toString() {
		return "Student [student_id=" + student_id + ", student_name=" + student_name + ", student_age=" + student_age
				+ ", student_marks=" + student_marks + "]";
	}

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
