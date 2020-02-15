package JAVATPOINT;

public class ThistoStatic {
	//this keyword to access Static variable
	
	
	static int i=10;
	public ThistoStatic()
	{
		System.out.println(this.i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ThistoStatic t=new ThistoStatic();

	}

}
