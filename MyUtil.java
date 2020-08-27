package Oops_Practise_Exercise_1;
/*Exercise - 4
Create a class named MyUtil.
    • Create a static method throwDice which should return a random number between 
    		1 and 6 inclusive. (hint: use random method of Math class)
    • Create a static method findAverage which takes an array of integers as parameter. 
    The method should return the average of the integers present in the array.
    Create a class TestMyUtil with a main method.
    • Test the throwDice method
    • Create two integer arrays and find the average of both the array elements using findAverage method
    • Find the max and min of two doubles by using static methods of Math class
    • Find the ceiling, floor and round of a number by using static methods of Math class.
 */
import java.util.*;
public class MyUtil {
	static int sum=0;
	public static int throwDice() {
		Random r=new Random();
		r.setSeed(123456);
		return 0;
	}
	public static double findAverage(int a[],int size) {
		sum=0;
		for(int i=0;i<size;i++)
		{
			//a[i]=s.nextInt();
			sum=sum+a[i];
		}
		double avg=0;
		avg=sum/size;
		return avg;
	}
}
