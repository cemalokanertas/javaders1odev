package oop1;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Vade oranı";

		Product product1 = new Product();
		product1.setName("Delonghi Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(25000);
		product1.setUnitsInStock(2);
		product1.setImageUrl("image1.jpg");

		Product product2 = new Product();
		product2.setName("Vestel Kahve Makinesi");
		product2.setDiscount(7);
		product2.setUnitPrice(34555);
		product2.setUnitsInStock(5);
		product2.setImageUrl("image2.jpg");


		Product product3 = new Product();
		product1.setName("Bosch Kahve Makinesi");
		product1.setDiscount(7);
		product1.setUnitPrice(12000);
		product1.setUnitsInStock(1);
		product1.setImageUrl("image3.jpg");

		Product[] products = {product1,product2,product3};
		
		
		for (Product product : products) {
			System.out.println(product.getName());
		}
		
		IndividualCustomer individualCustomer = new  IndividualCustomer();
		individualCustomer.setId(1);
		individualCustomer.setPhone("2423905309");
		individualCustomer.setFirstName("Cemal Okan");
		individualCustomer.setLastName("Ertaş");
		
		CorporateCustomer corporateCustomer = new CorporateCustomer();
		corporateCustomer.setId(2);
		corporateCustomer.setCompanyName("ertaş tech");
		corporateCustomer.setPhone("325353523");
		corporateCustomer.setTaxNumber("22222222");
		corporateCustomer.setCustomerNumber("5435435");
		
		Customer[] customers = {individualCustomer,corporateCustomer};
		
		
	}

}
