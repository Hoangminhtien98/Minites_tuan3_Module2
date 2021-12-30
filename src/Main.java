import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManger studentManger = new StudentManger();
        int choice;
        do {
            System.out.println("Menu");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị tất cả sinh viên");
            System.out.println("3. Sửa Sinh viên qua Id");
            System.out.println("4. Xóa Sinh viên qua id");
            System.out.println("5. Tìm sinh viên qua id");
            System.out.println("6. Sắp xếp sinh viên theo điểm trung bình");
            System.out.println("7. Find student who have maximum average point");
            System.out.println("8. Ghi file");
            System.out.println("9. Đọc file");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Student student = studentManger.createStudent();
                    studentManger.addStudent(student);
                    break;
                case 2:
                    studentManger.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập ID: ");
                    int idEdit = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(studentManger.editStudent(idEdit));
                    break;
                case 4:
                    System.out.println("Nhập ID: ");
                    int idDelete = scanner.nextInt();
                    scanner.nextLine();
                    Student student1 = studentManger.deleteStudentById(idDelete);
                    if (student1 == null) {
                        System.out.println("Không có sinh viên nào có id tương ứng!!");
                    } else {
                        System.out.println();
                    }
                    break;
                case 5:
                    System.out.println("Nhập ID: ");
                    scanner.nextLine();
                    int id = scanner.nextInt();
                    ArrayList<Student> arrayList = studentManger.searchStudentById(id);
                    System.out.println(arrayList);
                    break;
                case 6:
                    int choice1;
                    do {
                        System.out.println("1. Low to high");
                        System.out.println("2. High to low");
                        System.out.println("0. Back");
                        System.out.print("Enter your choice: ");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                ArrayList<Student> arrayList1 = studentManger.avgLowToHigh();
                                for (Student students : arrayList1) {
                                    System.out.println(students);
                                }
                                break;
                            case 2:
                                ArrayList<Student> arrayList2 = studentManger.avgHighToLow();
                                for (Student student2 : arrayList2) {
                                    System.out.println(student2);
                                }
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 7:
                    ArrayList<Student> students3 = studentManger.findStudentMaxAvg();
                    for (Student student3 : students3) {
                        System.out.println(student3);
                    }
                    break;
                case 8:
                    break;
                case 9:
                    break;
            }
        } while (choice != 0);
    }
}
