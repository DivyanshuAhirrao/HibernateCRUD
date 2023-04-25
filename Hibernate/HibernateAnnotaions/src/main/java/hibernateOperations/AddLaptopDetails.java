package hibernateOperations;

import javaBeanClass.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class AddLaptopDetails {
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

        System.out.println(" Enter the Model Number...");
        int modelno = sc.nextInt();

        System.out.println(" Enter the Model Name...");
        String name = sc.next();

        System.out.println(" Enter the RAM size...");
        int ram = sc.nextInt();

        System.out.println(" Enter the ROM size...");
        int rom = sc.nextInt();

        System.out.println(" Enter the Model Prize...");
        double price = sc.nextDouble();


        Laptop l1 = new Laptop(modelno, name,ram,rom,price);

        tx = ses.beginTransaction();

        ses.save(l1);
        tx.commit();

        System.out.println(" Record Inserted Successfuly...");

    }
}
