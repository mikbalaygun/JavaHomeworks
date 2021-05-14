package hmw2_1;

public class CourseManager {
	
	public void registerToCourse(Course course){
		course.registered = true;
		System.out.println("kursa kayýt olundu :"+ course.name+" && "+ "eðitmeniniz :"+course.teacher);
	}
	
	public void percentToCourse(Course course) {
		System.out.println(course.id +" Nolu Kursu Tamamlama Yüzdeniz :"+course.percent);
	}
}
