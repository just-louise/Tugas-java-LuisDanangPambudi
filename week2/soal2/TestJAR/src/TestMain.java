import soal2.id.ac.polban.employee.model.Department;
import soal2.id.ac.polban.employee.model.Employee;
import soal2.id.ac.polban.employee.model.EmploymentType;
import soal2.id.ac.polban.employee.service.EmployeeService;

public class TestMain {
  public static void main(String[] args) {
     Department dept = new Department("IT");
        EmploymentType type = new EmploymentType("Permanent");
        Employee emp = new Employee(1, "Danang", dept, type, 5000000);
        
        EmployeeService service = new EmployeeService();
        service.addEmployee(emp);
        service.infoKaryawan(emp);
        
        System.out.println("Total Karyawan: " + Employee.getTotalEmployee());
  }
}
