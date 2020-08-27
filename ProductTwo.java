package Oops_Practise_Exercise_1;
/*Exercise - 3
	Create a class named Product with the following private instance variables
    • productCode of type String
    • productName of type String
    • productPrice of type double
	Include a parameterized constructor with 3 parameters to initialize the member variables.
	Include a method displayProductDetails to display object state in the following format. 
	This Method does not accept any parameters and does not return anything.
	Product Code : P101 Product Name : Laptop Product Price : 45000.00
	
	Create class TestProduct with a main method to test above class
	    • Create an object using the parameterized constructor
	    • Invoke displayProductDetails method and display the product details

*/
public class ProductTwo {
	private String productCode;
	private String productName;
	private double productPrice;
	public ProductTwo(String productCode, String productName, double productPrice) {
		super();
		this.productCode = productCode;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public void displayProductDetails() {
		System.out.println("Product code :" +productCode);
		System.out.println("Product name :" +productName);
		System.out.println("Product price :" +productPrice);
	}
}
