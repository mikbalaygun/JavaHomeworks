package hmw3_2;

public class StudentManager {
	
	public void createStudent(Student student) {
		System.out.println(student.getId()+" id'li öğrenci oluşturuldu.");
	}
	
	
	public void uptadeStudent(Student student) {
		
		if(student.getSigned()) {
			
			System.out.println(student.getId()+" id'li öğrenci güncellendi. ");
		}else {
			System.out.println("önce sisteme kayıt olmalısınız.");
		}
	}
	
	
	
	
	
}
