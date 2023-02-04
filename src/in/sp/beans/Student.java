package in.sp.beans;

public class Student {
    private String name;
    private String phoneno;
    private String City;
    private String aadharcardno;

	public String getPhoneno() {
		return phoneno;
	}

	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}

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
    public void display() {
    	System.out.println("Student Name : "+name);
    	System.out.println("Student Phone No. : "+phoneno);
    	System.out.println("Student city : "+City);
    	System.out.println("Studengt Aadhar Card No"+aadharcardno);
    }
    
}
