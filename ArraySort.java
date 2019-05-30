package tasksday3;
import java.util.Scanner;
public class ArraySort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		//System.out.println("enter array size");
	//	int n=s.nextInt();
		System.out.println("enter string:");
		String a=s.nextLine();
		int n=a.length();
		int[] a1=new int[n];
		StringBuffer sb=new StringBuffer(a);
		for(int i=0;i<n;i++) {
			a1[i]=sb.charAt(i);	
		}
		int temp=0;
		for(int j=0;j<n;j++) {
			for(int k=j+1;k<n;k++) {
				if(a1[j]>a1[k]) {
					temp=a1[k];
					a1[k]=a1[j];
					a1[j]=temp;
				}
			}
		}
		System.out.println("array elements after sorting:");
		for(int i=0;i<n;i++) {
			System.out.println((char)a1[i]);
			  
		}
	}

}
