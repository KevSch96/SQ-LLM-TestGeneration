package com.mycompany.app;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class Student_addGrade_0_0_Test {

    @Test
    public void testAddGrade() throws NoSuchFieldException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // Given
        Student student = new Student(1, "Alice", 20, "Computer Science");
        Map<String, Double> grades = new HashMap<>();
        String course = "Math";
        double grade = 85.0;
        // Accessing private field 'grades' in Student class using reflection
        Field field = Student.class.getDeclaredField("grades");
        field.setAccessible(true);
        field.set(student, grades);
        // When
        Method addGradeMethod = Student.class.getDeclaredMethod("addGrade", String.class, double.class);
        addGradeMethod.setAccessible(true);
        addGradeMethod.invoke(student, course, grade);
        // Then
        Map<String, Double> updatedGrades = (Map<String, Double>) field.get(student);
        assertTrue(updatedGrades.containsKey(course));
        assertEquals(grade, updatedGrades.get(course));
    }
}
