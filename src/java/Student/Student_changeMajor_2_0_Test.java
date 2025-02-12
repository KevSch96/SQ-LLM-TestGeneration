package com.mycompany.app;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.HashMap;
import java.util.Map;

class Student_changeMajor_2_0_Test {

    private Student student;

    @BeforeEach
    void setUp() {
        student = new Student(1, "Alice", 20, "Computer Science");
    }

    @Test
    void testChangeMajor() throws Exception {
        String newMajor = "Mathematics";
        // Accessing private field 'major' using reflection
        Field majorField = Student.class.getDeclaredField("major");
        majorField.setAccessible(true);
        // Invoking changeMajor method using reflection
        Method changeMajorMethod = Student.class.getDeclaredMethod("changeMajor", String.class);
        changeMajorMethod.setAccessible(true);
        changeMajorMethod.invoke(student, newMajor);
        // Getting the value of 'major' field after change
        String updatedMajor = (String) majorField.get(student);
        assertEquals(newMajor, updatedMajor);
    }

    @Test
    void testGetGPA() {
        // Write test cases for getGPA method if needed
    }
}
