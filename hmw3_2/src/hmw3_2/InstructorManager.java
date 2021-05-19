package hmw3_2;

public class InstructorManager {
	
	public void giveHomework(Instructor instructor) {
		System.out.println("ödev verildi. Eðitmen: "+instructor.getFirstName());
		
	}
	
	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" Eðitmen kurs oluþturuldu.");
	}
	
}
