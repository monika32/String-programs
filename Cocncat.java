package tasksday3;
import java.lang.*;
public class Cocncat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1=new String("monika");
		String s2=new String(s1.concat("sowjanya"));
		System.out.println(s2);
		
		StringBuilder sb1=new StringBuilder(s1);
		StringBuilder sb2=new StringBuilder(s2);
		//System.out.println(sb1.concat(s2));
	}

}
