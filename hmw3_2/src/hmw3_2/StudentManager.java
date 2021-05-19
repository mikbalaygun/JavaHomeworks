package hmw3_2;

public class StudentManager {
	
	public void registerCourse(Student student) {
		
		if(student.getSigned()) {
			
			System.out.println(student.getId()+" id'li öğrenci kursa kayıt olundu. ");
		}else {
			System.out.println(student.getId()+" id'li öğrenci kursa erişmek için önce kayıt olmalısınız.");
		}
	}
	
	public void addComment(Student student) {
		if(student.getSigned()) {
			System.out.println(student.getId()+" id'li öğrenci yorumun yapıldı.");
		}else {
			System.out.println("önce giriş yapmalısın.");
		}
	}
	
	
	
}
