package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(value = JUnitPlatform.class)
@SelectClasses(value = { SelfAdjustingScheduling_scheduleNext_1_0_Test.class })
public class SelfAdjustingScheduling_Suite {
}
