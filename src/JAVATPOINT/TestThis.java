package JAVATPOINT;

public class TestThis {
	
	public TestThis()
	{
		//this=null;
		System.out.println("Test Class Constructor is call");
	}
	public static void main(String[] args) {
		
		TestThis t=new TestThis();
	}

}
/*
Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
	The left-hand side of an assignment must be a variable

	at JAVATPOINT.TestThis.<init>(TestThis.java:7)
	at JAVATPOINT.TestThis.main(TestThis.java:12)
*/
