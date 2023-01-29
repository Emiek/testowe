import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Comparator;
import java.util.List;
import java.util.ArrayList;

class Student {
    int id;
    String name;
    String surname;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Student(int id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
}

public class StudentGrades {
    static Map<Integer, Student> idToStudent = new HashMap<>();
    static Map<Student, String> studentToGrades = new HashMap<>();

    public static void addStudent(int id, String name, String surname, String grade) {
        Student student = new Student(id, name, surname);
        idToStudent.put(id, student);
        studentToGrades.put(student, grade);
    }

    public static void changeGrade(int id, String newGrade) {
        Student student = idToStudent.get(id);
        studentToGrades.put(student, newGrade);
    }

    public static void removeStudent(int id) {
        Student student = idToStudent.get(id);
        idToStudent.remove(id);
        studentToGrades.remove(student);
    }

    public static void printGrades() {
        List<Student> students = new ArrayList<>(studentToGrades.keySet());
        students.sort(Comparator.comparing(Student::getSurname).thenComparing(Student::getName).thenComparing(Student::getId));

        for (Student student : students) {
            System.out.println(student.surname + " " + student.name + ": " + studentToGrades.get(student));
        }
    }

    public static void main(String[] args) {
        addStudent(1, "Carl", "Johnson", "db+");
        addStudent(2, "Joe", "Smith", "db");
        addStudent(3, "Susan", "Johnson", "bdb");
        changeGrade(2, "bdb");
        printGrades();
    }
}
