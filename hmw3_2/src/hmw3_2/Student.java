package hmw3_2;

public class Student extends User {
	private String schoolName;
	private String address;
	
	
	public Student(int id, String email, String password, String firstName, String lastName, Boolean signed , String schoolName,String address) {
		super(id, email, password, firstName, lastName, signed);
		this.schoolName = schoolName;
		this.address = address;
		
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	
}
