package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;

/**
 * A class to represent a student in a system.
 */
public class Student {
    private int studentId;
    private String name;
    private int age;
    private String major;
    private Map<String, Double> grades;

    /**
     * Constructor to initialize a student with ID, name, age, and major.
     */
    public Student(int studentId, String name, int age, String major) {
        this.studentId = studentId;
        this.name = name;
        this.age = age;
        this.major = major;
        this.grades = new HashMap<>();
    }

    /**
     * Adds a grade for a specific course.
     */
    public void addGrade(String course, double grade) {
        grades.put(course, grade);
    }

    /**
     * Calculates and returns the student's GPA.
     */
    public double getGPA() {
        if (grades.isEmpty()) {
            return 0.0;
        }
        double total = 0.0;
        for (double grade : grades.values()) {
            total += grade;
        }
        return total / grades.size();
    }

    /**
     * Changes the student's major.
     */
    public void changeMajor(String newMajor) {
        this.major = newMajor;
    }

    @Override
    public String toString() {
        return String.format("Student %s (ID: %d), Age: %d, Major: %s, GPA: %.2f",
                name, studentId, age, major, getGPA());
    }
}
