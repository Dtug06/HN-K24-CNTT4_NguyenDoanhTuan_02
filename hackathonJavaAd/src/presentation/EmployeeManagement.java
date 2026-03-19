package presentation;

import business.EmployeeBusiness;
import entity.Employee;

import java.util.Scanner;

public class EmployeeManagement {
    public static void main(String[] args){
        EmployeeBusiness eml = EmployeeBusiness.getInstance();
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        do {
            try {
                System.out.print("===============Quan Ly Nhan Vien===============\n");
                System.out.print("1. Hiển thị thanh sách toàn bộ nhân viên\n");
                System.out.print("2. Thêm mới nhân viên\n");
                System.out.print("3. Cập nhật thông tin nhân viên theo mã nhân viên \n");
                System.out.print("4. Xóa nhân viên theo mã nhân viên \n");
                System.out.print("5. Tìm kiếm nhân viên theo tên \n");
                System.out.print("6. Lọc danh sách nhân viên xuất sắc\n");
                System.out.print("7. Sắp xếp nhân viên giảm dần theo lương\n");
                System.out.print("8. Thoát");
                System.out.print("\nChon: ");
                choice = sc.nextInt();
                switch (choice){
                    case 1:
                        eml.display();
                        break;
                    case 2:
                        Employee e = new Employee();
                        e.inputData(sc);
                        eml.add(e);
                        break;
                    case 3:
                        System.out.print("Pay primium for used");
                        break;
                    case 4:
                        sc.nextLine();
                        System.out.print("Nhap ID can xoa: ");
                        String idDelete = sc.nextLine();
                        eml.delete(idDelete);
                        break;
                    case 5:
                        System.out.print("Pay primium for used");
                        break;
                    case 6:
                        eml.filterGoodEmployee();
                        break;
                    case 7:
                        eml.sortBySalaryDesc();
                        break;
                    case 8:
                        System.out.println("Thoat!");
                        break;
                }

            } catch (Exception e){
                System.out.println("⚠ Loi nhap du lieu! Vui long nhap lai.");
                sc.nextLine();
            }
        } while (choice != 8);
    }
}