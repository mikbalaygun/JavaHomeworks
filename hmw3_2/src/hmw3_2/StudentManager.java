package hmw3_2;

public class StudentManager {
	
	public void registerCourse(Student student) {
		
		if(student.getSigned()) {
			
			System.out.println(student.getId()+" id'li ��renci kursa kay�t olundu. ");
		}else {
			System.out.println(student.getId()+" id'li ��renci kursa eri�mek i�in �nce kay�t olmal�s�n�z.");
		}
	}
	
	public void addComment(Student student) {
		if(student.getSigned()) {
			System.out.println(student.getId()+" id'li ��renci yorumun yap�ld�.");
		}else {
			System.out.println("�nce giri� yapmal�s�n.");
		}
	}
	
	
	
}
