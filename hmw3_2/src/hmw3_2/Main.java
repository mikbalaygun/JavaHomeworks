package hmw3_2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"m@gmail.com","1234","Ali","Yilmaz",false,"ODTU","Bursa");
		Instructor instructor1 = new Instructor(2,"e@gmail.com","5678","Mehmet","Aygun",false,"MCT,PMP","backend");
		Student student2 = new Student(3,"a@gmail.com","2468","Emre","Taş",false,"ITU","Istanbul");

		UserManager userManager = new UserManager();
		
		userManager.addToSystem(student1);
		userManager.addToSystem(student2);
		userManager.addToSystem(instructor1);

		userManager.removeToSystem(student2);
		
		System.out.println("------------------------");
		
		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		studentManager.registerCourse(student1);
		studentManager.registerCourse(student2);
		
		System.out.println("------------------------");

		
		instructorManager.giveHomework(instructor1);
		instructorManager.createCourse(instructor1);
		
		System.out.println("------------------------");

		studentManager.addComment(student1);
		studentManager.addComment(student2);
		
		
		
		
		
	}

}
