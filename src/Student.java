// COMP1011 - Adv Object Oriented Prog-Java
// Student: 200564426 - Marcos Oliveira Mota
// Week08 Lab 1

// Import the packages
import java.util.Objects;

// Student class declaration
public class Student implements Comparable<Student> {

    // Fields
    int id;
    String name;
    String email;

    // Constructor
    public Student(int id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
    }

    // Override the hashCode method to identify unique students by id
    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    // Override the equals method to identify unique students by id
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student student = (Student) obj;
        return id == student.id;
    }

    // Comparable implementation to allow sorting by name in TreeSet
    @Override
    public int compareTo(Student other) {
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}