package employeeApp;

import java.util.Arrays;

/**
 * Uygulamanın amacı Java'da nesne tabanlı programlamanın temellerinin oluşturulmasıdır.
 *
 */
public class Main
{

    /**
     * Uygulamadaki tüm işlemler bu metotda yapılmalı
     */
    private static void workWithData ()

    {

        Healthplan plan1 = new Healthplan(1, "Canlife" , Plan.CANLIFE) ;
        Healthplan plan2 = new Healthplan(2, "Hdi Sigorta" , Plan.HDI) ;
        String[] healthplans = new String[3] ;
        healthplans[0] = plan1.getName();
        healthplans[1] = plan2.getName();
        System.out.println("Emplooye Name : ");
        Employee developer = new Employee(1," Canberk OK", "canberkok@gmail.com","123456",healthplans);
//        developer.addHealthplan(0,"A sigorta");
        System.out.println(developer);

        String[] developerNames  = new String[2] ;
        developerNames[0] = developer.getName() ;

        System.out.println( "Company Name");
        Company company = new Company(1,"CanTech",1000000.00, developerNames);

        System.out.println(company);
    }

    /**
     * Bu projenin ana(main) metodu. Java uygulamalarında main metot küçük bir metot olur.
     * Bir Java programınd ilgili işlemlerin çoğunluğu başka metodlarda yapılır.
     * Daha sonra ana metod diğer metodları çağırır. Böylece ana metodun içi kalabalık bir hale gelmemiş olur.

     *
     * @param args bu uygulamada kullanılmamaktadır. Command Line üzerinden argüman alan
     *             bir uygulamamız olsaydı kullanılacaktı.
     */
    public static void main(String[] args)
    {
        workWithData();
    }
}
