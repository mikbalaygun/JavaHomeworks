package hmw3_2;

public class StudentManager {
	
	public void createStudent(Student student) {
		System.out.println(student.getId()+" id'li ��renci olu�turuldu.");
	}
	
	
	public void uptadeStudent(Student student) {
		
		if(student.getSigned()) {
			
			System.out.println(student.getId()+" id'li ��renci g�ncellendi. ");
		}else {
			System.out.println("�nce sisteme kay�t olmal�s�n�z.");
		}
	}
	
	
	
	
	
}
