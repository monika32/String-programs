package tasksday3;
import java.util.*;
public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter array size:");
		int n=s.nextInt();
		int[] arr=new int[n];
		int index=0,count=0;
		for(int i=0;i<n;i++) {
			System.out.println("enter index vaue and element ");
				index=s.nextInt();
				if(index>=n) {
					System.out.println("array index exceeded");
					break;
				}
				arr[index]=s.nextInt();
				count++;
		}
		if(count==n)
		System.out.println("array filled");
	}

}
