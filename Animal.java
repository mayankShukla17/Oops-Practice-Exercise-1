package Oops_Practise_Exercise_1;
/*Create a class 'Animal' with following properties 
    - id
    - name
    - Height
    - Weight
    - numberofLegs

    - Define the property methods for all the properties 
    - Define the method for accepting and displaying the Animal details

Create another class 'Cat' which will have all the properties related to Cat
    - This class will inherit the Animal class
    - This class will override the base class methods for accepting and displaying 
    - Use toString method to display the properties 

Create two class name client
    - ClientA can add data
    - ClientB can display data

Use 100% abstraction
*/
import java.util.*;
public class Animal {
	private int id;
	private String name;
	private int height;
	private double weight;
	private int numberOfLegs;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public double getWeight() {
		return weight;
	}
	public void setWeight(double weight) {
		this.weight = weight;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
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
		setNumberOfLegs(sc.nextInt());
	}
	public void display() {
		System.out.println(" Id: "+getId());
		System.out.println(" Name: "+getName());
		System.out.println(" Height: "+getHeight());
		System.out.println(" Weight: "+getWeight());
		System.out.println(" Number of legs: "+getNumberOfLegs());
	}
}
