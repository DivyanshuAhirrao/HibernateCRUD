package mainOperations;

import domain.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeleteLaptopDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Model Number to Delete Record");
        int modelNo = sc.nextInt();


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

        Laptop l1 = ses.get(Laptop.class, modelNo);
        tx = ses.beginTransaction();
        ses.delete(l1);
        tx.commit();
        System.out.println("Record Deleted SuccessFully...");
    }
}
