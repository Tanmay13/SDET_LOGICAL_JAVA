package Array;

import javax.swing.plaf.synth.SynthScrollBarUI;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="Sumit";
		String Rev="";
		for(int i=s.length()-1;i>=0;i--)
		{
			Rev=Rev+s.charAt(i);
			
		}
		System.out.println(Rev);

	}

}
