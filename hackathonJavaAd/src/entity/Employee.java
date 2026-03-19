package entity;

import java.util.Scanner;

public class Employee {
    private String emId;
    private String empName;
    private int age;
    private double salary;

    public Employee(String emId, String empName, int age, double salary) {
        this.emId = emId;
        this.empName = empName;
        this.age = age;
        this.salary = salary;
    }

    public Employee() {}

    public String getEmId() { return emId; }
    public void setEmId(String emId) { this.emId = emId; }

    public String getEmpName() { return empName; }
    public void setEmpName(String empName) { this.empName = empName; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public void inputData(Scanner sc){
        sc.nextLine();

        while (true){
            System.out.print("Nhap id (NVxxx): ");
            this.emId = sc.nextLine();

            if(this.emId.matches("^NV\\d{3}$")){
                break;
            } else {
                System.out.println("Sai dinh dang! (VD: NV001)");
            }
        }

        while (true){
            System.out.print("Nhap name: ");
            this.empName = sc.nextLine();

            if(!this.empName.trim().isEmpty()){
                break;
            } else {
                System.out.println("Ten khong duoc rong!");
            }
        }

        while (true){
            try {
                System.out.print("Nhap age (>10): ");
                this.age = Integer.parseInt(sc.nextLine());

                if(this.age > 18){
                    break;
                } else {
                    System.out.println("Tuoi phai > 18!");
                }
            } catch (Exception e){
                System.out.println("Nhap sai dinh dang so!");
            }
        }


        while (true){
            try {
                System.out.print("Nhap salary (>0): ");
                this.salary = Double.parseDouble(sc.nextLine());

                if(this.salary > 0){
                    break;
                } else {
                    System.out.println("Luong phai > 0!");
                }
            } catch (Exception e){
                System.out.println("Nhap sai dinh dang so!");
            }
        }
    }

    public void displayData(){
        System.out.printf("| %-10s | %-20s | %-5d | %-10.2f |\n",
                emId, empName, age, salary);
    }
}