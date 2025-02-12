package com.mycompany.app;

import org.mockito.*;
import org.junit.jupiter.api.*;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

public class CoinChange_change_0_1_Test {

    @Test
    public void testChangeWithZeroAmount() {
        int[] coins = { 2 };
        int amount = 0;
        assertEquals(1, CoinChange.change(coins, amount));
    }
}
