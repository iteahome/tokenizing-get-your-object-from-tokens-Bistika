package com.token;

public class Student {
    private String id;
    private String firstName;
    private String lastName;
    private String city;
    private String nativeLanguage;
    private String grade;

    private Student(String id, String firstName, String lastName, String city, String nativeLanguage, String grade) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.nativeLanguage = nativeLanguage;
        this.grade = grade;
    }

    @Override
    public String toString() {
        return id + ", " + firstName + ", " + lastName + ", " + city + ", " + nativeLanguage + ", " + grade;
    }

    public static void main (String[] args) {
        String student  = "78, marius, bistika, cluj, albanian, 8";
        String [] studentValues = student.split(",");
        Student student1 = new Student (studentValues[0], studentValues[1], studentValues[2], studentValues[3], studentValues[4], studentValues[5]);
        System.out.println(student1);
    }
}
