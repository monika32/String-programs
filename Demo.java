package tasksday3;
import java.util.Scanner;
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter string to be converted into character:");
		String str=s.nextLine();
		char[] ch=new char[str.length()];
		System.out.println("the characters are:");
		for(int i=0;i<str.length();i++) {
			ch[i]=str.charAt(i);
			System.out.print(ch[i]+" ");
		}
		System.out.println();
		String s1=str.valueOf(ch);
		System.out.println("the string after conveted from char to string is:");
		System.out.println(s1);
	}

}
