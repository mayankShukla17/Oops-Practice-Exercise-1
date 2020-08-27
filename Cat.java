package Oops_Practise_Exercise_1;

import java.util.Scanner;

public class Cat extends Animal{
	@Override
	public void accept() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Id");
		setId(sc.nextInt());
		System.out.println("Enter the Name");
		setName(sc.next());
		System.out.println("Enter the Height");
		setHeight(sc.nextInt());
		System.out.println("Enter the Weight");
		setWeight(sc.nextInt());
		System.out.println("Enter the Number of legs");
		setNumberOfLegs(sc.nextInt());;
	}
	@Override
	public void display() {
		System.out.println(" Id: "+getId());
		System.out.println(" Name: "+getName());
		System.out.println(" Height: "+getHeight());
		System.out.println(" Weight: "+getWeight());
		System.out.println(" Number of legs: "+getNumberOfLegs());
	}
	@Override
	public String toString() {
		return "Cat [getId()=" + getId() + ", getName()=" + getName() + ", getHeight()=" + getHeight()
				+ ", getWeight()=" + getWeight() + ", getNumberOfLegs()=" + getNumberOfLegs() + "]";
	}
}
