package hmw3_2;

public class Instructor extends User {
	private String certificates;
	private String department;
	
	
	public Instructor(int id, String email, String password, String firstName, String lastName, Boolean signed , String certificates, String department) {
		super(id, email, password, firstName, lastName, signed);
		this.certificates = certificates;
		this.department = department;
	}


	public String getCertificates() {
		return certificates;
	}


	public void setCertificates(String certificates) {
		this.certificates = certificates;
	}


	public String getDepartment() {
		return department;
	}


	public void setDepartment(String department) {
		this.department = department;
	}
	
}
