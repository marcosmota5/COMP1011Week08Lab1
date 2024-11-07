// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week08 Lab 1

// Main class
public class Main {
    // Main method to test the functionality
    public static void main(String[] args) {
        // Create an instance of the management
        StudentManagement management = new StudentManagement();

        // Create test students
        Student student1 = new Student(1, "Alice", "alice@example.com");
        Student student2 = new Student(2, "Bob", "bob@example.com");
        Student student3 = new Student(3, "Charlie", "charlie@example.com");

        // Same id as student2, so it's a duplicate
        Student student4 = new Student(2, "Bob", "bob@duplicate.com");

        // Print a message to separate the operations
        System.out.println("\n######### HashSet Operations #########\n");

        // Test the HashSet methods
        management.addStudentToHashSet(student1);
        management.addStudentToHashSet(student2);
        management.addStudentToHashSet(student3);

        // Try to add the duplicated student
        management.addStudentToHashSet(student4);
        management.displayHashSet();

        // Print a message to separate the operations
        System.out.println("\n######### TreeSet Operations #########\n");

        // Test the TreeSet methods
        management.addStudentToTreeSet(student1);
        management.addStudentToTreeSet(student2);
        management.addStudentToTreeSet(student3);

        // Try to add the duplicated student
        management.addStudentToTreeSet(student4);
        management.displayTreeSet();

        // Print a message to separate the operations
        System.out.println("\n######### Stack Operations #########\n");

        // Test the Stack methods
        management.popLastStudentFromStack();
        management.popLastStudentFromStack();

        // Bonus: Removes a student
        management.removeStudentById(2);
        management.displayHashSet();
        management.displayTreeSet();
    }
}