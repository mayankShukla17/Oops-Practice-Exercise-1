package Oops_Practise_Exercise_1;
import java.util.Scanner;
public class Distance {
	private int feet;
	private int inches;
	
	public void getDistance(){
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter feet: ");
		feet=sc.nextInt();
		System.out.print("Enter inches: ");
		inches=sc.nextInt();
	}
	public void showDistance(){
		System.out.println("Feet: "+ feet + "\tInches: "+ inches);
	}
	
	public void addDistance(Distance D1, Distance D2){
		inches=D1.inches+D2.inches;
		feet=D1.feet+D2.feet+(inches/12);
		inches=inches%12;
	}
}
