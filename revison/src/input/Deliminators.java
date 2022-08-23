package input;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;
  
public class Deliminators {
	public static void main(String[] args) throws IOException {
		Scanner ip=new Scanner(System.in);
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		//System.out.println("Enter the Array size");
		//int n=ip.nextInt();
		ip.useDelimiter(",");
		
		//int arr[] = new int[n];
		System.out.println("Enter the Numbers ");
		
		while(ip.hasNextInt()){
			System.out.println(ip.hasNextInt());
			System.out.println("Hi");
			list.add(ip.nextInt());
		}
		System.out.println(list);
	
	}
	
}