package de.neuefische;


import java.util.Objects;

//Klassen
public class Student {
    private String firstName;
    private String lastName;
    private String matriculationNumber;


    // Konstruktor
    public Student(String firstName, String lastName, String matriculationNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.matriculationNumber = matriculationNumber;
    }


    // Getter und Setter Methoden
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMatriculationNumber() {
        return matriculationNumber;
    }

    public void setMatriculationNumber(String matriculationNumber) {
        this.matriculationNumber = matriculationNumber;
    }
//Equal und Hash - Methode
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(firstName, student.firstName) && Objects.equals(lastName, student.lastName) && Objects.equals(matriculationNumber, student.matriculationNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, matriculationNumber);
    }

    //to String Methode
    @Override
    public String toString() {
        return "Student{" +
                "vorname='" + firstName + '\'' +
                ", nachname='" + lastName + '\'' +
                ", matrikelnummer='" + matriculationNumber + '\'' +
                '}';
    }
}


