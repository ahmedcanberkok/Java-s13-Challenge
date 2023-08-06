package employeeApp;

import java.util.Arrays;

public class Company {
    private long id;
    private String name;
    private double giro;
    private String[] developerName;

    private void  ciroCheck ( double giro ) {
        if (giro < 0) {
            this.giro = 0;
        } else {
            this.giro = giro;
        }
    }

    public Company(long id, String name, double giro, String[] developerName) {
        this.id = id;
        this.name = name;
        ciroCheck(giro);
        this.developerName = developerName;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getGiro() {
        return giro;
    }

    public String[] getDeveloperName() {
        return developerName;
    }

    public void addEmployee(int index, String name) {
        try {
            if (developerName[index] == null) {
                developerName[index] = name;
            } else {
                System.out.println("İlgili index icin developer mevcut");
            }
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Olmayan index icin atama yapildi"+ index);
        }
    }

    public String toString () {
        return  "name: " +name + " Giro :" + giro + " developers: " + Arrays.toString(developerName);
    }
}