package Oops_Practise_Exercise_1;

import java.util.Scanner;
public class TestMyUtil {
	public static void main(String[] args) {
		System.out.println("hi");
		System.out.println("Random number generated is: "+MyUtil.throwDice());
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of an array: ");
		int size=sc.nextInt();
		System.out.println("Enter the value into an array: ");
		int array1[]=new int[size];
		for(int i=0;i<size;i++)
		{
			array1[i]=sc.nextInt();
		}
		System.out.println("Enter the size of an array: ");
		int size1=sc.nextInt();
		System.out.println("Enter the value into an array: ");
		int array2[]=new int[size1];
		for(int i=0;i<size1;i++)
		{
			array2[i]=sc.nextInt();
		}
		double average1=MyUtil.findAverage(array1,size);
		double average2=MyUtil.findAverage(array2,size1);
		
		System.out.println("Average of first array is: "+average1);
		System.out.println("Average of second array is: "+average2);
		System.out.println("Minimum average is: "+Math.min(average1, average2));
		System.out.println("Maximum average is: "+Math.max(average1, average2));
		System.out.println("Ceiling value of first average is: "+Math.ceil(average1));
		System.out.println("Ceiling value of second average is: "+Math.ceil(average2));
		System.out.println("floor value of first average is: "+Math.floor(average1));
		System.out.println("floor value of second average is: "+Math.floor(average2));
		System.out.println("Round value of second average is: "+Math.round(average1));
		System.out.println("Round value of second average is: "+Math.round(average2));
	}
}
