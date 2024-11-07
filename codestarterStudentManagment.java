/*
Part 1: Student Class

In the setter for grades, include validation to ensure all grades are between 0 and 100. 
If any grade is out of this range, print an error message and ignore that grade.

Method to Calculate Average Grade:

Write a method calculateAverage() that calculates and returns the average of the grades in the grades array.
If the grades array is empty, return 0 as the average.
*/
public class Student {
    private String name;
    private int id;
    private int[] grades;
    }
// Default Constructor
public Student() {
        this.name = "Unknown";
        this.id = 0;
        this.grades = new int[5];
    }

    // Parameterized Constructor
    public Student(String name, int id, int[] grades) {
        this.name = name;
        this.id = id;
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

    public void setID(String id) {
        this.id = id;
    }

    public void setGrades(grades) {
        this.grades = grades;
                setGrades(grades); // using setter to apply validation
    }    

    // Method to calculate average grade
}
public class StudentManagement {
    private Student[] students;
    private int studentCount;

    // Constructor to initialize the students array


    // Method to add a student to the students array
 

    // Method to display all students
   
   
           
}
/*
Part 2: StudentManagement Class

Array of Students:

Create a Student[] students array to store multiple Student objects (up to 5 students for simplicity).
Add Students:

Write a method addStudent(Student student) that adds a Student to the students array.
Ensure you don’t exceed the array limit. If the array is full, print a message indicating that no more students can be added.
Display All Students:

Write a method displayAllStudents() that iterates over the students array and displays each student’s details (name, id, and average grade).
*/

