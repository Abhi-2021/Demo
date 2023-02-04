package in.sp.beans;

public class Employee
{
    private String name;
    private String phoneno;
    private String City;
    private String aadharcardno;

    
    
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getAadharcardno() {
		return aadharcardno;
	}
	public void setAadharcardno(String aadharcardno) {
		this.aadharcardno = aadharcardno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	public void display() {
		System.out.println("Employee Name : "+name);
    	System.out.println("Employee Phone No. : "+phoneno);
    	System.out.println("Employee city : "+City);
    	System.out.println("Employee Aadhar Card No"+aadharcardno);
	}
    
}
