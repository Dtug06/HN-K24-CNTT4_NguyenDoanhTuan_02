
package business;

import entity.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class EmployeeBusiness {

    private static final EmployeeBusiness instance = new EmployeeBusiness();
    public static EmployeeBusiness getInstance() {
        return instance;
    }

    private List<Employee> employees = new ArrayList<>();

    public void display(){
        if(employees.isEmpty()){
            System.out.println("List empty!!!");
            return;
        }
        System.out.println("-------------------------------------------------------------");
        employees.forEach(Employee::displayData);
    }

    public void add(Employee employee){
        boolean exists = employees.stream()
                .anyMatch(e -> e.getEmId().equals(employee.getEmId()));

        if(exists){
            System.out.println("ID da ton tai!!!");
        } else {
            employees.add(employee);
            System.out.println("Them thanh cong!");
        }
    }

    public Optional<Employee> findById(String id){
        return employees.stream()
                .filter(e -> e.getEmId().equals(id))
                .findFirst();
    }

    public void delete(String id){
        boolean removed = employees.removeIf(e -> e.getEmId().equals(id));

        if(removed){
            System.out.println("Xoa thanh cong!");
        } else {
            System.out.println("Khong tim thay!");
        }
    }

    public void filterGoodEmployee(){
        employees.stream()
                .filter(e -> e.getSalary() >= 15000000)
                .forEach(Employee::displayData);
    }
    public void sortBySalaryDesc(){
        employees.sort(Comparator.comparing(Employee::getSalary).reversed());
        System.out.println("Da sap xep!");
    }
}
