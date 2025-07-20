
public class Main {
    public static void main(String[] args) {
        // Create a student
        Student student = new Student("Ashfaqul");

        // Create first course with assignments
        Course oop = new Course("SYSC 2004", "Object-Oriented Programming");
        oop.addAssignment(new Assignment("Assignment 1", "2025-07-25", 85));
        oop.addAssignment(new Assignment("Assignment 2", "2025-08-01", 90));

        // Create second course with assignments
        Course dsa = new Course("SYSC 2100", "Data Structures and Algorithms");
        dsa.addAssignment(new Assignment("Assignment 1", "2025-07-27", 70));
        dsa.addAssignment(new Assignment("Assignment 2", "2025-08-10", 75));

        // Add courses to student
        student.addCourse(oop);
        student.addCourse(dsa);

        // Display student courses and assignments
        System.out.println("======================================");
        System.out.println(" Student: " + student.getName());
        System.out.println("======================================\n");

        System.out.println(" Enrolled Courses:");
        for (Course course : student.getCourses()) {
            System.out.println("- " + course);
        }

        // 🧮 Calculate GPA and display letter grade
        double gpa = student.calculateGPA();
        String letter = student.convertGPAtoLetterGrade(gpa);

        System.out.println("\n======================================");
        System.out.printf(" GPA (4.0 Scale): %.2f\n", gpa);
        System.out.println(" Letter Grade: " + letter);
        System.out.println("======================================");
    }
}
