package Array;

public class LinerSearchArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stint
		int a[] = { 12, 45, 35, 84, 26, 79 };
		int search_Element = 4;
		boolean flag = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == search_Element) {
				System.out.println("Number is found ");
				flag = true;
				break;

			}

		}
		if (flag == false) {
			System.out.println("Element not  founds");
		}

	}

}
