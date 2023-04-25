package javaBeanClass;
                         // POJO class or JAVA bean Class or domain Class :
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "laptop_info")
public class Laptop {
        @Id
        @Column(name = "model_number")
        private int modelNumber;
        @Column(name = "model_brand")
        private String laptopCompany;
        @Column(name = "ram")
        private int ramSize;
        @Column(name = "rom")
        private int romSize;
        @Column(name = "price")
        private double laptopPrice;

        public int getModelNumber() {
            return modelNumber;
        }

        public void setModelNumber(int modelNumber) {
            this.modelNumber = modelNumber;
        }

        public String getLaptopCompany() {
            return laptopCompany;
        }

        public void setLaptopCompany(String laptopCompany) {
            this.laptopCompany = laptopCompany;
        }

        public int getRamSize() {
            return ramSize;
        }

        public void setRamSize(int ramSize) {
            this.ramSize = ramSize;
        }

        public int getRomSize() {
            return romSize;
        }

        public void setRomSize(int romSize) {
            this.romSize = romSize;
        }

        public double getLaptopPrice() {
            return laptopPrice;
        }

    public Laptop() {
    }

    public Laptop(int modelNumber, String laptopCompany, int ramSize, int romSize, double laptopPrice) {
        this.modelNumber = modelNumber;
        this.laptopCompany = laptopCompany;
        this.ramSize = ramSize;
        this.romSize = romSize;
        this.laptopPrice = laptopPrice;
    }

    public void setLaptopPrice(double laptopPrice) {
            this.laptopPrice = laptopPrice;
    }
}


