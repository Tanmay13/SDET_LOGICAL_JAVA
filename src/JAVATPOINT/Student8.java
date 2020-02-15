package JAVATPOINT;

public class Student8 {
	int rollNo;
	String Name;
	static String Colleges = "P.R.Patil College of Engineering Amravati";

	public Student8(int r, String N) {
		this.rollNo = r;
		this.Name = N;

	}

	void display() {
		System.out.println("The deatils of Student is:" + rollNo + " " + Name + " " + Colleges);

	}

	public static void main(String[] args) {

		Student8 s = new Student8(111, "Tanmay");
		Student8 s2 = new Student8(222, "Amit");
		s.display();
		s2.display();

	}
}
