package hmw2_1;

public class CourseManager {
	
	public void registerToCourse(Course course){
		course.registered = true;
		System.out.println("kursa kay�t olundu :"+ course.name+" && "+ "e�itmeniniz :"+course.teacher);
	}
	
	public void percentToCourse(Course course) {
		System.out.println(course.id +" Nolu Kursu Tamamlama Y�zdeniz :"+course.percent);
	}
}
