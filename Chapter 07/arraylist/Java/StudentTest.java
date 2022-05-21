package arraylist;

public class StudentTest {

	public static void main(String[] args) {
		
		Student student1 = new Student("Lee");
		student1.addSubject("국어", 100);
		student1.addSubject("수학", 95);
		
		student1.showStudentInfo();
		
		Student student2 = new Student("Kim");
		student2.addSubject("국어", 100);
		student2.addSubject("수학", 90);
		student2.addSubject("영어", 80);
		
		student2.showStudentInfo();

	}

}
