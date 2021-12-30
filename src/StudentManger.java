import java.util.*;

public class StudentManger {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public ArrayList<Student> getStudents() {
        return students;
    }

    public Student createStudent() {
        System.out.println("Nhập id: ");
        int id = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập điểm toán: ");
        double math = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double physics = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double chemistry = scanner.nextDouble();
        double avgPoint = (math + physics + chemistry) / 3;
        scanner.nextLine();
        return new Student(name, age, math, physics, chemistry, avgPoint);

    }
    public void addStudent() {
        students.add(createStudent());
    }
    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public Student editStudent(int id) {
        Student editStudent = null;
        for (Student s : students) {
            if (s.getId() == id) {
                editStudent = s;
            }
        }
        if (editStudent != null) {
            int index = students.indexOf(editStudent);
            System.out.println("Nhập tên: ");
            editStudent.setName(scanner.nextLine());
            System.out.println("Nhập tuổi: ");
            editStudent.setAge(scanner.nextInt());
            scanner.nextLine();
            System.out.println("Nhập điểm toán: ");
            editStudent.setMath(scanner.nextDouble());
            System.out.println("Nhập điểm lý: ");
            editStudent.setPhysics(scanner.nextDouble());
            System.out.println("Nhập điểm hóa: ");
            editStudent.setChemistry(scanner.nextDouble());
        }
        return editStudent;
    }

    public Student deleteStudentById(int id) {
        Student deleteStudent = null;
        for (Student s : students) {
            if (s.getId() == id) {
                deleteStudent = s;
            }
        }
        int index = students.indexOf(deleteStudent);
        return students.remove(index);
    }

    public ArrayList<Student> searchStudentById(int id) {
        ArrayList<Student> student = new ArrayList<>();
        for (Student s : students) {
            if (s.getId() == id) {
                student.add(s);
            }
        }
        return student;
    }
    public ArrayList<Student> avgHighToLow() {
        ArrayList<Student> students2 = new ArrayList<>();
        students2.addAll(students);

        students2.sort((o1, o2) -> {
            if (o1.getAvgPoint() < o2.getAvgPoint()) {
                return 1;
            } else if (o1.getAvgPoint() > o2.getAvgPoint()) {
                return -1;
            } else {
                return 0;
            }
        });
        return students2;
    }
    public ArrayList<Student> avgLowToHigh() {
        ArrayList<Student> students1 = new ArrayList<>();
        students1.addAll(students);

        students1.sort((o1, o2) -> {
            if (o1.getAvgPoint() > o2.getAvgPoint()) {
                return 2;
            } else if (o1.getAvgPoint() < o2.getAvgPoint()) {
                return -2;
            } else {
                return 0;
            }
        });
        return students1;
    }

    public ArrayList<Student> findStudentMaxAvg() {
        ArrayList<Student> students3 = new ArrayList<>();
        double max = students.get(0).getAvgPoint();
        for (Student student : students) {
            if (student.getAvgPoint() > max) {
                max = student.getAvgPoint();
            }
        }
        for (Student student : students) {
            if (student.getAvgPoint() == max) {
                students3.add(student);
            }
        }
        return students3;
    }
}
