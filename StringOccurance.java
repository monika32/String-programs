package tasksday3;
import java.util.Scanner;
class StringOccurance{
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter string:");
		String str=s.next();
		str=str.toLowerCase();
		int len=str.length();
		char[] arr=new char[len];
		for(int l=0;l<len;l++) {
			arr[l]=str.charAt(l);		
		}
		for(int i=0;i<len;i++) {
			int count=0;
			for(int j=i+1;j<len;j++) {
				if(arr[i]==arr[j]) {
					arr[j]=arr[len-1];
					j--;
					len--;
					count++;
					
				}
			}
		System.out.println("count of character:"+arr[i]+"is:"+(count+1));
		}
	}
}
	
	
		