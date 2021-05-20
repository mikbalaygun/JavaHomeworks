package hmw3_2;

public class Main {

	public static void main(String[] args) {
		
		Student student1 = new Student(1,"m@gmail.com","1234","Ali","Yilmaz",false,"ODTU","Bursa");
		Instructor instructor1 = new Instructor(2,"e@gmail.com","5678","Mehmet","Aygun",false,"MCT,PMP","backend");
		Student student2 = new Student(3,"a@gmail.com","2468","Emre","Taş",false,"ITU","Istanbul");
		Instructor instructor2 = new Instructor(4,"b@gmail.com","1357","Murat","Akgun",false,"MCT","backend");

		UserManager userManager = new UserManager();
		
		userManager.addToSystem(student1);
		userManager.addToSystem(instructor1);
		userManager.addToSystem(student2);
		userManager.addToSystem(instructor2);

		
		System.out.println("------------------------");
		
		userManager.removeToSystem(student2);
		userManager.removeToSystem(instructor2);

		
		System.out.println("------------------------");

		InstructorManager instructorManager = new InstructorManager();
		StudentManager studentManager = new StudentManager();
		
		studentManager.createStudent(student1);
		studentManager.createStudent(student2);
		
		System.out.println("------------------------");

		
		instructorManager.createInstructor(instructor1);

		
		System.out.println("------------------------");

		studentManager.uptadeStudent(student1);
		studentManager.uptadeStudent(student2);
		
		System.out.println("------------------------");

		instructorManager.uptadeInstructor(instructor1);
		instructorManager.uptadeInstructor(instructor2);


		
		
	}

}
