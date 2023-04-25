package mainOperations;

import domain.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DisplayLaptopDetails {

    public static void main(String[] args) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter The Model Number...");
        int model = sc.nextInt();

        // Declare Resources :
        Configuration cfg = null;
        SessionFactory factory = null;
        Session ses = null;

        //Activate Hibernate Framework :
        cfg = new Configuration();

        //read data from .cfg.xml file
        cfg = cfg.configure();

        // establish communication link with db :
        factory = cfg.buildSessionFactory();

        //start Session with Database:
        ses = factory.openSession();

        //call get Method and pass primary Key Argument :
        Laptop l1 = ses.get(Laptop.class, model);
        System.out.println(l1.getModelNumber());
        System.out.println(l1.getLaptopCompany());
        System.out.println(l1.getRamSize());
        System.out.println(l1.getRomSize());
        System.out.println(l1.getLaptopPrice());

        // Print the message output :
        System.out.println("Displayed...");

    }

}
