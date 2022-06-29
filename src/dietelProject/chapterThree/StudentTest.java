public class StudentTest {
	public static void main(String[] args) {
	
	Student student1 = new Student("Jerry", 90.1);
	Student student2 = new Student("Ben", 40.2);
	
	System.out.printf("%s's grade is %s%n", student1.getName(), student1.getLetterGrade());
	
	System.out.printf("%s's grade is %s", student2.getName(), student2.getLetterGrade());
	}
}
	