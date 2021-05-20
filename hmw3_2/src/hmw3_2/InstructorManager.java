package hmw3_2;

public class InstructorManager {
	
	public void createInstructor(Instructor instructor) {
		System.out.println(instructor.getId()+" id'li "+instructor.getFirstName()+", Eðitmen kaydýn oluþturuldu.");
	}
	
	public void uptadeInstructor(Instructor instructor) {
		if(instructor.getSigned()) {
			System.out.println(instructor.getId()+" id'li eðitmen güncellendi.");
		}else{
			System.out.println("önce sisteme kayýt olmalýsýnýz.");
		}
		
	}
	
	
	
}
