package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(value = JUnitPlatform.class)
@SelectClasses(value = { CoinChange_change_0_1_Test.class, CoinChange_minimumCoins_1_0_Test.class })
public class CoinChange_Suite {
}
