// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week08 Lab 1

// Import the packages
import java.util.HashSet;
import java.util.Stack;
import java.util.TreeSet;

// Main class to handle HashSet, TreeSet, and Stack operations
public class StudentManagement {

    // Declare the HashSet, TreeSet and Stack
    private HashSet<Student> studentHashSet = new HashSet<>();
    private TreeSet<Student> studentTreeSet = new TreeSet<>();
    private Stack<Student> studentStack = new Stack<>();

    // Method to add a student to the HashSet
    public void addStudentToHashSet(Student student) {
        // Add the student to the HashSet and the stack, or shows a message indicating the student already exists
        if (studentHashSet.add(student)) {
            System.out.println("The student was added to HashSet");
            // If the add was successful, push the student to the Stack
            studentStack.push(student);
        } else {
            System.out.println("The student already exists in the HashSet");
        }
    }

    // Method to display all students in the HashSet
    public void displayHashSet() {
        // Print a message indicating the students in the HashSet
        System.out.println("Students in the HashSet:");

        // Iterates through the HashSet and print the student
        for (Student student : studentHashSet) {
            System.out.println(student);
        }
    }

    // Method to add a student to the TreeSet
    public void addStudentToTreeSet(Student student) {
        // Add the student to the TreeSet and the stack, or shows a message indicating the student already exists
        if (studentTreeSet.add(student)) {
            System.out.println("The student was added to TreeSet");
            // If the add was successful, push the student to the Stack
            studentStack.push(student);
        } else {
            System.out.println("The student already exists in the TreeSet");
        }
    }

    // Method to display all students in the TreeSet
    public void displayTreeSet() {
        // Print a message indicating the students in the TreeSet
        System.out.println("Students in TreeSet (sorted by name):");

        // Iterates through the HashSet and print the student
        for (Student student : studentTreeSet) {
            System.out.println(student);
        }
    }

    // Method to pop the last added student from the Stack
    public void popLastStudentFromStack() {
        // If the stack is not empty, remove it and shows a message
        if (!studentStack.isEmpty()) {
            // Remove the last student
            Student student = studentStack.pop();

            // Prints a message
            System.out.println("Student popped from stack: " + student);
        } else {
            System.out.println("The stack is empty");
        }
    }

    // Bonus: Method to remove a student by id from HashSet and TreeSet
    public void removeStudentById(int id) {
        // Temporary student with only id for lookup
        Student tempStudent = new Student(id, "", "");

        // Tries to remove the student from the HashSet and prints a message if it was successful or not
        if (studentHashSet.remove(tempStudent)) {
            System.out.println("The student was removed from HashSet");
        } else {
            System.out.println("The student was not found in HashSet");
        }

        // Tries to remove the student from the TreeSet and prints a message if it was successful or not
        if (studentTreeSet.remove(tempStudent)) {
            System.out.println("The student was removed from TreeSet");
        } else {
            System.out.println("The student was not found in TreeSet");
        }
    }
}