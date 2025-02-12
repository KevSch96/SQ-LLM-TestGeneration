package com.mycompany.app;

import java.util.HashMap;
import java.util.Map;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Student_toString_3_2_Test {

    @Test
    public void testGetGPAWhenGradesEmpty() {
        // Given
        Student student = new Student(456, "Bob", 21, "Engineering");
        // When
        double gpa = student.getGPA();
        // Then
        assertEquals(0.0, gpa, 0.001);
    }

    @Test
    public void testGetGPAWithGrades() {
        // Given
        Student student = new Student(789, "Charlie", 22, "Physics");
        Map<String, Double> grades = new HashMap<>();
        grades.put("Physics", 4.0);
        grades.put("Math", 3.5);
        setPrivateField(student, "grades", grades);
        // When
        double gpa = student.getGPA();
        // Then
        assertEquals(3.75, gpa, 0.001);
    }

    private void setPrivateField(Object target, String fieldName, Object value) {
        try {
            java.lang.reflect.Field field = target.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(target, value);
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
