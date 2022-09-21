package oop1;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product();
//        // set value
//        product1.name = "Delonghi Kahve Makinesi";
//        product1.unitPrice = 7500;
//        product1.discount = 7;
//        product1.unitsInStock = 3;
//        product1.imageUrl = "bilmemNe.jpg";
//
//        // get
//        System.out.println(product1.name);

        product1.setName("Delonghi Kahve Makinesi");
        product1.setUnitPrice(7500);
        product1.setDiscount(7);
        product1.setUnitsInStock(3);
        product1.setImageUrl("image.jpg");

        Product product2 = new Product();
        product2.setName("Smeg Kahve Makinesi");
        product2.setUnitPrice(7500);
        product2.setDiscount(7);
        product2.setUnitsInStock(3);
        product2.setImageUrl("image2.jpg");

        Product product3 = new Product();
        product3.setName("Kitchen Aid Kahve Makinesi");
        product3.setUnitPrice(7500);
        product3.setDiscount(7);
        product3.setUnitsInStock(3);
        product3.setImageUrl("image3.jpg");

        Product[] products = {product1, product2, product3};

        System.out.println("<ul>");
        for (Product product: products) {
            System.out.println("<li>" + product.getName() + "</li>");
        }
        System.out.println("</ul>");

        IndividualCustomer individualCustomer = new IndividualCustomer();
        individualCustomer.setId(1);
        individualCustomer.setCustomerNumber("12345");
        individualCustomer.setPhone("05454566778");
        individualCustomer.setFirstName("Engin");
        individualCustomer.setLastName("Demiroğ");

        CorporateCustomer corporateCustomer = new CorporateCustomer();
        corporateCustomer.setId(2);
        corporateCustomer.setCompanyName("Kodlama.io");
        corporateCustomer.setPhone("05454564545");
        corporateCustomer.setTaxNumber("1234567890");
        corporateCustomer.setCustomerNumber("54321");

        Customer[] customers = {individualCustomer, corporateCustomer};

    }
}
