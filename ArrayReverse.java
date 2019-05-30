package tasksday3;
import java.util.*;
public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int[] a=new int[n];
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
		}
		System.out.println("reverse array is:");
		for(int j=n-1;j>=0;j--) {
			System.out.print(a[j]+" ");
		}
	}

}
