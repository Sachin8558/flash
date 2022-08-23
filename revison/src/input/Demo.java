package input;

import java.util.Scanner;

public class Demo {
	// arr[]={1 2 3 4 }
	public static void main(String[] args) {
		System.out.println("Program started");
		Scanner ip=new Scanner(System.in);
		System.out.println("enter the size");
		int n=ip.nextInt();
		int arr[]=new int[n];
		int count=0;
		System.out.println("enter the key");
		int key=ip.nextInt();
		System.out.println("enter the t elements");
		int t=ip.nextInt();
		System.out.println("enter the array elements");
		for (int i=0; i<n; i++)
			arr[i]=ip.nextInt();
		{
			int i;
		for(i=0; i<n; i++)
			if(key==arr[i])
				{
				count++;
				if(count==t)
					break;
				}
		{
			if(count==t)
				System.out.println(i);
			else
				System.out.println("-1");
		}
			
		
		System.out.println("Program ended");
	}}}


