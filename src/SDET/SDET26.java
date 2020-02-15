package SDET;

public class SDET26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Occurance character in string

	String s= "java Prograing java Opps";
    int count=	s.length();//totol lenght of String

	int Totalcount=s.replace("o", "").length();
	int c=count-Totalcount;
	System.out.println(c);
	
	
	}

}
