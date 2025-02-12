package com.mycompany.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class BinaryInsertionSort_sort_0_0_Test {

    @Test
    void testSort() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        BinaryInsertionSort binaryInsertionSort = new BinaryInsertionSort();
        Integer[] array = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
        Integer[] expected = { 1, 1, 2, 3, 3, 4, 5, 5, 5, 6, 9 };
        Method sort = BinaryInsertionSort.class.getDeclaredMethod("sort", Comparable[].class);
        sort.setAccessible(true);
        sort.invoke(binaryInsertionSort, (Object) array);
        assertArrayEquals(expected, array);
    }
}
