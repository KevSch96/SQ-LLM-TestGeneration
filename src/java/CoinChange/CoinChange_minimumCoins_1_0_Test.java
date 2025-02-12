package com.mycompany.app;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CoinChange_minimumCoins_1_0_Test {

    @Test
    public void testMinimumCoins() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        int[] coins = { 1, 2, 5 };
        int amount = 11;
        Class<?> coinChangeClass = CoinChange.class;
        Method minimumCoinsMethod = coinChangeClass.getDeclaredMethod("minimumCoins", int[].class, int.class);
        minimumCoinsMethod.setAccessible(true);
        Object result = minimumCoinsMethod.invoke(null, coins, amount);
        int minimumCoinsResult = (int) result;
        assertEquals(3, minimumCoinsResult);
    }
}
