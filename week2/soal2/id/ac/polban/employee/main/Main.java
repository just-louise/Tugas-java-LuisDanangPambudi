package soal2.id.ac.polban.employee.main;

import soal2.id.ac.polban.employee.service.*;
import soal2.id.ac.polban.employee.model.*;

public class Main {
    public static void main(String[] args) {
        Department departement1 = new Department("IT");
        Department departement2 = new Department("Finance");
        EmploymentType type1 = new EmploymentType("Permanent");
        EmploymentType type2 = new EmploymentType("Contract");
        Employee karyawan1 = new Employee(01, "Luis", departement2, type2, 3000000);
        Employee karyawan2 = new Employee(02, "Danang", departement1, type1, 5000000);
        EmployeeService servisKaryawan = new EmployeeService();
        servisKaryawan.addEmployee(karyawan1);
        servisKaryawan.addEmployee(karyawan2);
        System.out.println("\nsebelum naik gaji: ");
        servisKaryawan.infoKaryawan(karyawan1);
        servisKaryawan.infoKaryawan(karyawan2);
        servisKaryawan.raiseSalary(01, 10);
        System.out.println("\nsesudah naik gaji: ");
        servisKaryawan.infoKaryawan(karyawan1);
        servisKaryawan.infoKaryawan(karyawan2);
        System.out.println("\nTotal karyawan: " + Employee.getTotalEmployee());
    }
}
