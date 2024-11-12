import java.util.Scanner;

class Student {

    private String name;
    private int id;
    private int[] grades;

// Default Constructor
    public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.grades = new int[5];
        //for (int grade : grades){
        //return 
        //}
    }

    // Parameterized Constructor
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
        setGrades(grades);
        //this.grades = new int[5];
    }

    // Getters
    public String getName() {
        return this.name;
    }

    public int getID() {
        return this.id;
    }

    public int[] getGrades() {
        return this.grades;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int id) {
        this.id = id;
    }
// using setter to apply validation

    public void setGrades(int[] grades) {
        //this.grades = grades;
        for (int grade : grades) //for (int grade = 0; grade < grades.length; grade++) {
        //grades[idx] = scan.nextInt();
        {
            if (grade < 0 && grade > 100) {
                System.out.println("Please enter a number between 0 and 100");
                return;
            }
            //System.out.println("Please enter a number between 0 and 100");
        }
        this.grades = grades;
    }
// Method to calculate average grade

    public double calculateAverage() {
        if (grades.length == 0) {
            return 0;
        }
        int sum = 0;
        for (int grade : grades) {
            sum += grade;
        }
        return (double) sum / grades.length;
    }
}

class StudentManagement {

    private Student[] students; // = new Student[5];
    private int studentCount;

    //public int addStudent(Student student){
    //if(int Student : student)
    //}
    // Constructor to initialize the students array
    public StudentManagement() {
        this.students = new Student[5];
        this.studentCount = 0;
        //setGrades(students);
        //this.grades = new int[5];
    }

    // Method to add a student to the students array
    public void addStudent(Student student) {

        //for (int i = 5; i < students.length; i++) {
        //    System.out.println("Enter student name: " + i + " " + students[i]);
        if (studentCount < students.length) {
            //return students.length;
            //System.out.println("Too meny students");
            students[studentCount] = student;
            studentCount++;
        } else {
            System.out.println("Too meny students");

        }
        //return students.length ;
    }
//public int addStudent(Student student){
//if(int Student : student)
//}

// Method to display all students
    public void displayStudentInfo() {

        for (int i = 0; i < studentCount; i++) {
            Student student = students[i];
            System.out.println("Student Name: " + student.getName());
            System.out.println("Student ID: " + student.getID());
            System.out.println("Average Grade: " + student.calculateAverage());
            System.out.println("Greades: ");
            for (int grade : student.getGrades()) {
                System.out.println(grade + " ");
            }
            System.out.println("\n");
        }

        //System.out.println("Student Name: " + students[0 - 4]);
        //System.out.println("Account Number: " + accountNumber);
        //System.out.println("Balance: $" + balance);
        //System.out.println("Interest Rate: " + interestRate + "%" + "\n");
    }
}

public class Lab_Student_Record_Management {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        StudentManagement management = new StudentManagement();

        for (int i = 0; i < 2; i++) {
            System.out.println("Enter student name: ");
            String name = scan.nextLine();

            System.out.println("Enter student ID: ");
            int id = scan.nextInt();

            int[] grades = new int[5];
            System.out.println("Enter 5 grades for the student (between 0 - 100):  \n");
            for (int j = 0; j < 5; j++) {
                grades[j] = scan.nextInt();
            }
            scan.nextLine();

            Student dft2 = new Student(name, id, grades);
            management.addStudent(dft2);
        }

        management.displayStudentInfo();
        int[] grade = {85, 80, 78};
        int[] grade2 = {92, 87, 75, 80};
        Student stu1 = new Student("Alice", 01, grade);
        Student stu2 = new Student("Bob", 02, grade2);

        management.addStudent(stu1);
        management.addStudent(stu2);

        management.displayStudentInfo();
        //Student dft = new Student();
        //System.out.println("Enter student grades: " + setGrades());
        //Student dft1 = new Student("Bird", 99, setGrades(var));

        //System.out.println("Enter default grades: " + dft.setGrades();
        //System.out.println("Default: " + dft.getName() + ", " + dft.getID() + ", " + dft.getGrades());
        //dft.s //String setName = scan.nextLine();
        //System.out.println("Enter Student name: " + setName);
    }
}
