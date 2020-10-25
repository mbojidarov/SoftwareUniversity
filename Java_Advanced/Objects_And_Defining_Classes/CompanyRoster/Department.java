package CompanyRoster;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String nameDepartment;
    private List<Employee> employeeList;

    public Department(String nameDepartment){
        this.nameDepartment = nameDepartment;
        this.employeeList = new ArrayList<>();
    }

    public List<Employee> getEmployeeList(){
        return this.employeeList;
    }
    public double getAverageSalary(){
        return this.getEmployeeList().
                stream().mapToDouble(Employee::getSalary)
                .average().orElse(0.0);
    }
    public String getNameDepartment(){
        return this.nameDepartment;
    }
}
