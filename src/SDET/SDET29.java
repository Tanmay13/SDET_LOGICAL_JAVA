package SDET;

import java.io.File;
import java.util.Scanner;

public class SDET29 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//Read data from Test File
		//Approch 1:=File Reader
		/*FileReader fr=new FileReader("C:\\Users\\asus\\Desktop\\Tanmay_Personal\\MVNRepository.txt");
		BufferedReader br=new BufferedReader(fr);
		String str;
		while((str=br.readLine())!= null)
		{
			System.out.println(str);
			
			
		}
		

*/	//File and Scanner
		File f=new File("C:\\Users\\asus\\Desktop\\Tanmay_Personal\\MVNRepository.txt");
		Scanner sc=new Scanner(f);
		while(sc.hasNextLine())
		{
			
			System.out.println(sc.nextLine());
			
		}
		
	}

}
