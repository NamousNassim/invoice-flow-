package ma.namous.invoiceflow.domain;

import java.math.BigDecimal;
import java.util.Objects;

public record InvoiceLine(String productId , String description,int quantity,BigDecimal unitPrice,BigDecimal taxRate)
{
    public InvoiceLine
    {
        Objects.requireNonNull(productId ,"not null");
        Objects.requireNonNull(description,"no desc");
        Objects.requireNonNull(unitPrice , "quanity null");
        Objects.requireNonNull(taxRate,"tax rate dec");
if (productId.isBlank() || productId.isBlank())
                    {
                        throw new IllegalArgumentException("text not vide plz");
                    }
if (quantity <= 0) {    throw new IllegalArgumentException("quantity positive");
}


if (unitPrice.signum() < 0) { throw new IllegalArgumentException("Unit price must not be negative"); }

    }

    public BigDecimal subtotal(){ return unitPrice.multiply(BigDecimal.valueOf(quantity));}


}
