package hmw3_2;

public class InstructorManager {
	
	public void giveHomework(Instructor instructor) {
		System.out.println("�dev verildi. E�itmen: "+instructor.getFirstName());
		
	}
	
	public void createCourse(Instructor instructor) {
		System.out.println(instructor.getFirstName()+" E�itmen kurs olu�turuldu.");
	}
	
}
