package JavaByKiran;

public class Student {
	private int RollNo;
	private String SName;
	
	public Student(int RollNo,String SName)
	{
		this.RollNo=RollNo;
		this.SName=SName;
		
	}

	public int getRollNo() {
		return RollNo;
	}

	public void setRollNo(int rollNo) {
		RollNo = rollNo;
	}

	public String getSName() {
		return SName;
	}

	public void setSName(String sName) {
		SName = sName;
	}
	
	public boolean equals(Object obj) {

	    if (obj == null) return false;

	    if (!(obj instanceof Student))

	        return false;

	    if (obj == this)

	        return true;

	    return this.getRollNo() == ((Student) obj).getRollNo();

	}

	

}
