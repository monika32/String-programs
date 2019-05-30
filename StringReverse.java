package tasksday3;
import java.util.Scanner;
public class StringReverse {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string");
		String str=s.nextLine();
		StringBuffer sb=new StringBuffer(str);
		System.out.println("Reversed String is:"+sb.reverse());
		System.out.println("enter number");
		String num=s.nextLine();
		StringBuffer sb1=new StringBuffer(num);
		System.out.println("Reversed Numbers is:"+sb1.reverse());
		System.out.println("enter string to check whether it is palindrome or not:");
		String str1=s.nextLine();
		StringBuffer sb2=new StringBuffer(str1);
		sb2.reverse();
		//String s3=sb2.toString();
		StringBuffer sb3=new StringBuffer(sb2);
		if(str1.equals(sb3.toString())) 
		//if(s3.equals(str1))    
			System.out.println("palindrome");
		else
			System.out.println("not a palindrome");
			
	}

}
