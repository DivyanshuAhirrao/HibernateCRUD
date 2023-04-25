package mainOperations;

import domain.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class UserEndAddDetails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Configuration cfg = null;
        SessionFactory factory = null;
        Session ses = null;
        Transaction tx = null;

        cfg = new Configuration();

        cfg = cfg.configure();

        factory = cfg.buildSessionFactory();

       ses = factory.openSession();

        Laptop l1 = new Laptop();
        System.out.println("Enter the Model Number of laptop");
        int mno = sc.nextInt();
        l1.setModelNumber(mno);

        System.out.println("Enter the Company Name of laptop");
        String cname = sc.next();
        l1.setLaptopCompany(cname);

        System.out.println("Enter the Ram Size of laptop");
        int ram = sc.nextInt();
        l1.setRamSize(ram);

        System.out.println("Enter the Rom Size of laptop");
        int rom = sc.nextInt();
        l1.setRomSize(rom);

        System.out.println("Enter the Price of laptop");
        double price = sc.nextDouble();
        l1.setLaptopPrice(price);

        tx = ses.beginTransaction();

        ses.save(l1);

        tx.commit();

        System.out.println("Record Inserted Successfully...");


    }
}
