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
                    studentManger.addStudent();
                    break;
                case 2:
                    studentManger.displayAll();
                    break;
                case 3:

                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
            }
        } while (choice != 0);
    }
}
