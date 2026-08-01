package ma.namous.invoiceflow.domain;

import java.util.Objects;

//2. Product with id, name, unitPrice, and taxRate.

public class Product {
    private String id;
    private String name;
    private double unitPrice;
    private byte taxRate;



    public Product(String id , String name , double unitPrice,byte taxRate)
    {
        this.id = requireNonBlank(id, "id");
        this.name=requireNonBlank(name, "name");
        this.unitPrice = unitPrice;
        this.taxRate = taxRate;

    }

    //getters 

        public String getId(){return this.id;}
        public String getName() {return this.name;}
        public double getUnitPrice() {return this.unitPrice;}
        public byte getTaxRate() {return this.taxRate;}
    public void changePrice(double newPrice)
    {
        this.unitPrice = newPrice;
    }


     private static String requireNonBlank(String value , String field)
    {
            Objects.requireNonNull(value,field+ "must not be empty");

            if (value.isBlank()){throw new IllegalArgumentException(field + "must not be blank");}

            return value;
    }
}





