package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(value = JUnitPlatform.class)
@SelectClasses(value = { Student_addGrade_0_0_Test.class, Student_changeMajor_2_0_Test.class, Student_changeMajor_2_1_Test.class, Student_toString_3_2_Test.class })
public class Student_Suite {
}
