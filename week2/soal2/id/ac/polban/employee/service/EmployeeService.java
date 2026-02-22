package soal2.id.ac.polban.employee.service;

import java.util.HashMap;
import java.util.Map;


import soal2.id.ac.polban.employee.model.Employee;


public class EmployeeService {
     private Map<Integer, Employee> employees = new HashMap<>();

    public void addEmployee(Employee emp) {
        employees.put(emp.getId(), emp);
    }
    
    public Employee getEmployee(int id) {
        return employees.get(id);
    }

    public void raiseSalary(int id, double percent) {
        Employee emp = employees.get(id);
        if (emp != null) {
            emp.setSalary(emp.getSalary() * (1 + percent/100));
        }
    }
    public void infoKaryawan(Employee emp){
        System.out.println("Nama Karyawan   : " + emp.getName());
        System.out.println("Id Karyawan     : " + emp.getId()) ;
        System.out.println("Gaji Karyawan   :"  + emp.getSalary());
        System.out.println("Nama Departemen : " + emp.getDepartment().getName());
        System.out.println("Tipe Karyawan   : " + emp.getType().getType());
    }

}
