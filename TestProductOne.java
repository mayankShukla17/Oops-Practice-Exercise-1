package Oops_Practise_Exercise_1;

public class TestProductOne {
	public static void main(String args[]){
        ProductOne p = new ProductOne();
        p.setProductCode("P101");
        p.setProductName("Laptop");
        p.setProductPrice(450000.00);
        System.out.println("Product Code : " + p.getProductCode());
        System.out.println("Product Name : " + p.getProductName());
        System.out.println("Product Price : " + p.getProductPrice());
   }
}
