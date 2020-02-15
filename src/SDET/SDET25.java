package SDET;

public class SDET25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// remove while spaces in strings

		String str = "Tanmay Khope selenium    QA Engineers";
		System.out.println("Before removinh White spaces:" + str);
		str = str.replaceAll("\\s", "");
		System.out.println("After removing whiler space:" + str);
	}

}
