package ma.namous.invoiceflow.domain;

import java.util.Objects;

public final class Client {
    
    private final String id;

    private String name;
    private String email;


public Client(String id , String name , String email){
    this.id = requireNonBlank(id, "id");
    this.name = requireNonBlank(name, "name");
    this.email = requireNonBlank(email, "email");
}

// getters 


    public String id() { return this.id;}
    public String name() { return this.name;}
    public String email() { return this.email;}


    public void changeName(String newName)
    {
        this.name = requireNonBlank(newName, "new name");
    }
    public void changeEmail(String email) {this.email = requireNonBlank(email, "email"); }
    private static String requireNonBlank(String value , String field)
    {
            Objects.requireNonNull(value,field+ "must not be empty");

            if (value.isBlank()){throw new IllegalArgumentException(field + "must not be blank");}

            return value;
    }


}
