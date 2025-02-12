package com.mycompany.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class HillCipher_encrypt_0_0_Test {

    @Test
    void testEncrypt() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        HillCipher hillCipher = new HillCipher();
        String message = "HELLO";
        int[][] keyMatrix = { { 3, 2 }, { 2, 5 } };
        Method validateDeterminantMethod = HillCipher.class.getDeclaredMethod("validateDeterminant", int[][].class, int.class);
        validateDeterminantMethod.setAccessible(true);
        try {
            validateDeterminantMethod.invoke(hillCipher, keyMatrix, 2);
            Method encryptMethod = HillCipher.class.getDeclaredMethod("encrypt", String.class, int[][].class);
            encryptMethod.setAccessible(true);
            String encryptedMessage = (String) encryptMethod.invoke(hillCipher, message, keyMatrix);
            // Expected encrypted message for the given keyMatrix
            assertEquals("DIDZKN", encryptedMessage);
        } catch (InvocationTargetException e) {
            fail("Exception thrown during validation of key matrix determinant");
        }
    }
}
