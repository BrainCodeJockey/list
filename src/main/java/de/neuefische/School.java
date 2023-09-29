package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class School {

    // Liste, die Studenten in School speichert
    private List<Student> students;

    public School() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    // Methode zur Ausgabe aller Studenten
    public void printAllStudents() {
        for (Student student : students) {
            System.out.println(student.getFirstName() + " ");
        }
    }

    // Methode, um einen Studenten anhand des Vornamens zu finden
    public Student getStudentByVorname(String vorname) {
        for (Student student : students) {
            if (student.getFirstName().equals(vorname)) {
                return student;
            }
        }
        return null;
    }

    public Student getStudentByMatriculationNumber(String matriculationNumber) {
        for (Student student : students) {
            if (student.getMatriculationNumber().equals(matriculationNumber)) {
                return student;
            }
        }
        return null;
    }



    public Student removeStudentByMatriculationNumber(String matriculationNumber) {
        Student studentToRemove = null;
        for (Student student : students) {
            if (student.getMatriculationNumber().equals(matriculationNumber)) {
                studentToRemove = student;
                break;
            }
        }
        if (studentToRemove != null) {
            students.remove(studentToRemove);
        }
        System.out.println("Student wurde gelöscht.");
        return studentToRemove;
    }


    @Override
    public String toString() {
        return "School{" +
                "students=" + students +
                '}';
    }
}
