package domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "employee")
public class EmpJavaBean {

    @Id
    @Column(name = "emp_id")
    private int empId;
    @Column(name = "emp_name")
    private String empName;
    @Column(name = "emp_sal")
    private double empSal;

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public double getEmpSal() {
        return empSal;
    }

    public void setEmpSal(double empSal) {
        this.empSal = empSal;
    }

    @Override
    public String toString() {
        return "EmpJavaBean{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empSal=" + empSal +
                '}';
    }

    public EmpJavaBean(int empId, String empName, double empSal) {
        this.empId = empId;
        this.empName = empName;
        this.empSal = empSal;
    }


}
