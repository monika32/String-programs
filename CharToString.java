package tasksday3;
import java.util.*;
public class CharToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter characters:");
		String s1=s.nextLine();
		char[] ch=new char[s1.length()];
		StringTokenizer st=new StringTokenizer(s1);
		while(st.hasMoreTokens()) {
			st.nextToken(" ");
			System.out.println(st);
			ch=s1.toCharArray();
		}
	
	//	char[] ch=new char[] {'j','a','v','a'};
		String str=new String(ch);
		System.out.println("char converted to string is:"+str);
	}

}
