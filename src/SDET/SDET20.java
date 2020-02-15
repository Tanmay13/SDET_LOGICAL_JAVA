package SDET;

public class SDET20 {

	public static void main(String[] args) {
		// Linear Search
		// TODO Auto-generated method stub
		int a[] = { 10, 20, 30, 4, 0, 50, 600, 25, 24 };
		int Srearch_Element = 41;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == Srearch_Element) {
				System.out.println("Element is found at:" + i);
				flag = true;
				break;

			}

		}

		if (flag == false) {
			System.out.println("Element is  not founds");
		}

	}

}
