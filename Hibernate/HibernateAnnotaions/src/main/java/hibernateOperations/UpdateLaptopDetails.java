package hibernateOperations;

import javaBeanClass.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UpdateLaptopDetails {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter Modelno to Update Details...");
        int modelno = sc.nextInt();

        Configuration cfg;
        SessionFactory factory;
        Session ses;
        Transaction tx = null;

        cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Laptop.class);
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();

        Laptop l1 = ses.get(Laptop.class, modelno);



        System.out.println("Enter the new Company Name : ");
        String cname = sc.next();
        l1.setLaptopCompany(cname);

        System.out.println("Enter new ROM size : ");
        int rom = sc.nextInt();
        l1.setRomSize(rom);

        System.out.println("Enter new RAM size : ");
        int ram = sc.nextInt();
        l1.setRamSize(ram);

        System.out.println("Enter new Price : ");
        double price = sc.nextDouble();
        l1.setLaptopPrice(price);
        ses.beginTransaction();
        ses.update(l1);
        tx.commit();

        System.out.println(" Record Updated Successfully...");


    }
}
