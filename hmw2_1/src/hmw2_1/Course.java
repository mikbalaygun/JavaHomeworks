package hmw2_1;

public class Course {
	
	
	public Course() {
		System.out.println("kurs tanýmlandý");
	}
	
	
	
	public Course(int id,String name,String teacher,int percent,boolean registered) {
		this();
		this.id = id;
		this.name = name;
		this.teacher = teacher;
		this.percent = percent;
		this.registered = registered;
	}
	
	int id;
	String name;
	String teacher;
	int percent;
	boolean registered;
}
