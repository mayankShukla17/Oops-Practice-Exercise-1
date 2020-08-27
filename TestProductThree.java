package Oops_Practise_Exercise_1;

public class TestProductThree {
	public static void main(String[] args) {
		ProductThree product=new ProductThree("Laptop", 45000.00,'E');
		System.out.println(product.getProductDetails());

		ProductThree product1=new ProductThree("Laptop", 45000.00);
		System.out.println(product1.getProductDetails());
	}
}
