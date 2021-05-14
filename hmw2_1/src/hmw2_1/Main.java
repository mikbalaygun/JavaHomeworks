package hmw2_1;

public class Main {

	public static void main(String[] args) {
		
		
		Course course1 = new Course(1,"Java & React geliştirme kampı","Engin Demiroğ",60,false);
		
		Course course2 = new Course();
		course2.id = 2;
		course2.name = "C# & Angular geliştirme kampı";
		course2.teacher = "Engin Demiroğ";
		course2.percent = 23;
		course2.registered = false;
		
		Course course3 = new Course();
		course3.id = 3;
		course3.name = "Programlama için temel kamp";
		course3.teacher = "Engin Demiroğ";
		course3.percent = 0;
		course3.registered = false;
		System.out.println("------------------------------------");

		Course[] courses = {course1,course2,course3};
		
		System.out.println("Yayındaki Kurslar :");
		for(Course course : courses) {
			System.out.println(course.id +" "+ course.name);
		}
		
		System.out.println("------------------------------------");
		
		CourseManager courseManager = new CourseManager();
		
		courseManager.registerToCourse(course1);
		courseManager.registerToCourse(course2);

		
		System.out.println(course1.registered);
		
		System.out.println("------------------------------------");
		System.out.println("Kayıtlı Kurslarım :");
		
		for(Course course : courses) {
			if(course.registered) {
				System.out.println(course.id +" "+ course.name);
			}
		}
		
		System.out.println("------------------------------------");

		for(Course course : courses ) {
			courseManager.percentToCourse(course);
		}
		
		System.out.println("------------------------------------");
		System.out.println("2.gün İlk ödevi bitmiştir.Beğenmeyi Unutmayın!!");
		
		
		
		
		
		
		
		
	}

}
