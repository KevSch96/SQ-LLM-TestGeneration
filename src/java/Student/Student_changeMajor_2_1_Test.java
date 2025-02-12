package com.mycompany.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

public class Student_changeMajor_2_1_Test {

    @Test
    public void testChangeMajor() throws Exception {
        // Given
        Student student = new Student(1, "Alice", 20, "Math");
        String newMajor = "Computer Science";
        // When
        Method changeMajorMethod = Student.class.getDeclaredMethod("changeMajor", String.class);
        changeMajorMethod.setAccessible(true);
        changeMajorMethod.invoke(student, newMajor);
        // Then
        Field majorField = Student.class.getDeclaredField("major");
        majorField.setAccessible(true);
        String updatedMajor = (String) majorField.get(student);
        assertEquals(newMajor, updatedMajor);
    }

    @Test
    public void testGetGPA() {
        // You can write test cases for getGPA method if needed
    }
}
