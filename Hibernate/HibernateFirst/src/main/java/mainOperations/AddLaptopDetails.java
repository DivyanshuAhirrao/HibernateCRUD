package mainOperations;

import domain.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class AddLaptopDetails {
    public static void main(String[] args) {

        // Declare Resources :
        Configuration cfg = null;
        SessionFactory factory = null;
        Session ses = null;
        Transaction tx = null;

        //Activate Hibernate Framework :
        cfg = new Configuration();

        //read data from .cfg.xml file
        cfg = cfg.configure();

        // establish communication link with db :
        factory = cfg.buildSessionFactory();

        //start Session with Database:
        ses = factory.openSession();

        //create object of domain class to store data to database :
        Laptop l1 = new Laptop();
        l1.setModelNumber(101);
        l1.setLaptopCompany("Apple");
        l1.setRamSize(16);
        l1.setRomSize(516);
        l1.setLaptopPrice(89499.56);

        //start the Transaction :
        tx = ses.beginTransaction();

        //call persistence method:
        ses.save(l1);

        tx.commit();

        // Print the message output :
        System.out.println("Record Inserted Successfully...");




    }
}
