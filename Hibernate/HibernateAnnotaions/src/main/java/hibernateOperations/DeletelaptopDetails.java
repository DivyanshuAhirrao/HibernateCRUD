package hibernateOperations;

import javaBeanClass.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DeletelaptopDetails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx;

        cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Laptop.class);
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();

        System.out.println(" Enter the Model Number to Delete Record...");
        int modelno = sc.nextInt();

        Laptop l1 = ses.get(Laptop.class,modelno);
        tx = ses.beginTransaction();
        ses.delete(l1);
        tx.commit();
        System.out.println("Record Deleted SuccessFully...");

        ses.save(l1);
        tx.commit();

    }
}