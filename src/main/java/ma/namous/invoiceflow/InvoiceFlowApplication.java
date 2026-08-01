package ma.namous.invoiceflow;

import ma.namous.invoiceflow.domain.Client;
import ma.namous.invoiceflow.domain.Product;

public class InvoiceFlowApplication {

        public static void main(String[] args)
        {
                byte tax = 20;
                Client client1 = new Client("00-001","Namous","nassimnamousdev@gmail.com");
            
                Product product1 = new Product("000-001","maticha",2,tax);


                System.out.println(client1.name());
                System.out.println(product1.getName());
                System.out.println(product1.getUnitPrice());
                product1.changePrice(2.5);
                System.out.println(product1.getUnitPrice());

        }
}