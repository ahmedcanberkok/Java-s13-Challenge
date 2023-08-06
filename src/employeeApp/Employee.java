package employeeApp;

import java.util.Arrays;

public class Employee {
    private long id;
    private String name;
    private String email;
    private String password;
    private String[] healthplans;

    private  void  checkId ( long id ) {
        if (id<0) {
         this.id = 0 ;
        }else {
        this.id = id ;
        }
    }
    public Employee(long id, String name, String email, String password, String[] healthplans) {
        checkId(id);
        this.name = name;
        this.email = email;
        this.password = password;
        this.healthplans = healthplans;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getHealthplans() {
        return healthplans;
    }

    public void setHealthplans(String[] healthplans) {
        this.healthplans = healthplans;
    }

    public void addHealthplan(int index, String name) {
        try {
            if (healthplans[index] == null) {
                healthplans[index] = name;
            } else {
                System.out.println("İlgili index icin atama yapılmış");
            }
        } catch (ArrayIndexOutOfBoundsException ex){
                System.out.println("Olmayan index icin atama yapildi"+ index);
            }
    }

    public  String toString () {
        return  "Name" + name + " Healthplans : "+ Arrays.toString(healthplans) ;
    }
}