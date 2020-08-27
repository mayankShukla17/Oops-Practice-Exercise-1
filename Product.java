package Oops_Practise_Exercise_1;
/*Exercise – 1
Create a class named Product with the following instance variables
    • productCode of type String
    • productName of type String
    • productPrice of type double
Create another class TestProduct with a main method to test above class
    • create an object of Product and display the values of instance variables
    • create another object, assign values to member variables and display the values of member variables
	Output Format:
	The object data should be displayed in the following format Product Code : P101
	Product Name : Laptop Product Price : 45000.00
 */
public class Product {
	String productCode;
	String productName;
	double productPrice;
	public void display()
	{
		System.out.println("Product code :" +productCode);
		System.out.println("Product name :" +productName);
		System.out.println("Product price :" +productPrice);
	}
}
