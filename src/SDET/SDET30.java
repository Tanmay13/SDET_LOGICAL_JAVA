package SDET;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class SDET30 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//write data in text file
		//FileWritter
		//Buffer Writter
		FileWriter fr=new FileWriter("C:\\Users\\asus\\Desktop\\Tanmay_Personal\\123.txt");
		BufferedWriter bw=new BufferedWriter(fr);
		bw.write(" Anya Chomnyaaa ");
		bw.write("  SunnyLowdyaaaaa  ");
		bw.write("   tanmay Hushaaar ");
		System.out.println("Fineshed!!!");
		bw.close();

	}

}
