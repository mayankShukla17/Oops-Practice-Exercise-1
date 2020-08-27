package Oops_Practise_Exercise_1;
/*Exercise – 2
Create a class named Product with the following private instance variables
    • productCode of type String
    • productName of type String
    • productPrice of type double
Include Getters and Setters for all the variables
Create another class TestProduct with a main method to test above class
    • create another object of Product class and assign values to member variables using setters
    • Display the values of member variables using getter methods
Output Format:
The object data should be displayed in the following format Product Code : P101
Product Name : Laptop Product Price : 45000.00
*/

public class ProductOne {
	private String productCode;       
    private String productName;   
    private double productPrice;
	public String getProductCode() {
		return productCode;
	}
	public void setProductCode(String productCode) {
		this.productCode = productCode;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
}
