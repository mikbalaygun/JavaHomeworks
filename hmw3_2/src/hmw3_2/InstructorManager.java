package hmw3_2;

public class InstructorManager {
	
	public void createInstructor(Instructor instructor) {
		System.out.println(instructor.getId()+" id'li "+instructor.getFirstName()+", E�itmen kayd�n olu�turuldu.");
	}
	
	public void uptadeInstructor(Instructor instructor) {
		if(instructor.getSigned()) {
			System.out.println(instructor.getId()+" id'li e�itmen g�ncellendi.");
		}else{
			System.out.println("�nce sisteme kay�t olmal�s�n�z.");
		}
		
	}
	
	
	
}
