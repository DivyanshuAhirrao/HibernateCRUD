package hibernateOperations;

import javaBeanClass.Laptop;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.Scanner;

public class DisplaylaptopDetails {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Model no to Display Details...");
        int modelno = sc.nextInt();

        Configuration cfg;
        SessionFactory factory;
        Session ses;


        cfg = new Configuration();
        cfg.configure();
        cfg.addAnnotatedClass(Laptop.class);
        factory = cfg.buildSessionFactory();
        ses = factory.openSession();

        Laptop l1 = ses.get(Laptop.class, modelno);
          System.out.print("ModelNo       | ");
        System.out.print("ModelName       | ");
        System.out.print("RAM size        | ");
                               System.out.print("ROM size        | ");
        System.out.println("Prize");

        System.out.print(l1.getModelNumber()+"           | ");
        System.out.print(l1.getLaptopCompany()+"            | ");
        System.out.print(l1.getRamSize()+"              |");
        System.out.print(l1.getRomSize()+"              | ");
        System.out.println(l1.getLaptopPrice());



    }
}