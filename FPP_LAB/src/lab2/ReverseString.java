package lab2;

import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please input the word");
		String theWord=sc.nextLine();
		sc.close();
		for(int i=(theWord.length()-1);i>=0;i--)
		{
			System.out.print(theWord.charAt(i));
		}
	}

}
