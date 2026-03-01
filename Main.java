package co.in;

public class Main {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Priya",85);
		
		StudentDao dao = new StudentDAOimplement();
		
		dao.addStudent(s1);

	}

}
