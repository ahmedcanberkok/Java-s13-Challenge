package employeeApp;

public enum  Plan {
    HAYAT ("Hayat Sigorta",1565.00),
    HDI ("Hdi Sigorta",1758.00),
    CANLIFE("Canlife Sigorta",2500.00);
        private String name ;
        private  double price ;

         Plan(String name,double price ) {
             this.name = name ;
             this.price = price ;
         }


    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
