package casestudy;

import java.util.Comparator;

public class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		// TODO Auto-generated method stub
		return o1.student_name.compareTo(o2.student_name);
	}

}
