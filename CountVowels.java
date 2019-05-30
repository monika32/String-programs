package tasksday3;
import java.util.*;
//import java.lang.*;
public class CountVowels {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a string:");
		String str=s.nextLine();
		s.close();
		str=str.toLowerCase();
	//	StringBuffer sb=new StringBuffer(str);
		int len=str.length();
		int count=0,count1=0;
		for(int i=0;i<len;i++) {
			if(str.charAt(i)=='a'|| str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
				count++;
			}else {
				count1++;
			}
		}
		System.out.println("number of vowels is:"+count);
		System.out.println("number of consonants is "+count1);
	}

}
