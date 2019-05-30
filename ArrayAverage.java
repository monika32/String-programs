package tasksday3;
import java.util.Scanner;

public class ArrayAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size");
		int n=s.nextInt();
		int[] a=new int[n];
		int avg=0;
		System.out.println("enter array elements:");
		for(int i=0;i<n;i++) {
			a[i]=s.nextInt();
			avg+=a[i];
		}
		avg=avg/n;
		System.out.println("average is"+avg);
	}

}
