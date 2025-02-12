package com.mycompany.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class HillCipher_decrypt_1_1_Test {

    @Test
    void testDecryptWithInvalidKeyMatrix() {
        HillCipher hillCipher = new HillCipher();
        String message = "HELLO";
        // Invalid key matrix with determinant zero
        int[][] invalidKeyMatrix = { { 1, 2 }, { 2, 4 } };
        String expectedExceptionMessage = "Invalid key matrix. Determinant is zero modulo 26.";
        Exception exception = assertThrows(IllegalArgumentException.class, () -> hillCipher.decrypt(message, invalidKeyMatrix));
        assertEquals(expectedExceptionMessage, exception.getMessage());
    }
}
