package de.neuefische;


/*
Ausgeschriebene Begriffe:
int = Integer
double = Double
float = Float
char = Charakter
boolean = Boolean
*/

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //Liste für Studenten erstellt : )
        List<Student> studentList = new ArrayList<>();

        School SchoolOfRock = new School();

        SchoolOfRock.addStudent(new Student("Iskren", "Radev", "123"));
        SchoolOfRock.addStudent(new Student("Alexander", "Unmuth", "123456"));
        SchoolOfRock.addStudent(new Student("Enrico", "Schulz", "1234"));

        //studentList.add(new Student("Iskren", "Radev", "123"));
        //studentList.add(new Student("Enrico", "Schulz", "1234"));
        //studentList.add(new Student("Alexander", "Unmuth", "123456"));

        System.out.println(SchoolOfRock);
        System.out.println(SchoolOfRock.getStudentByMatriculationNumber("123456"));
        System.out.println(SchoolOfRock.getStudentByMatriculationNumber("1234"));
        System.out.println(SchoolOfRock.getStudentByMatriculationNumber("123"));
        System.out.println(SchoolOfRock.removeStudentByMatriculationNumber("123456"));
        // System.out.println(School.getStudentByVorname("Alexander"));
        }
    }

