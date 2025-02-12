package com.mycompany.app;

import org.junit.runner.RunWith;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.platform.suite.api.SelectClasses;

@RunWith(value = JUnitPlatform.class)
@SelectClasses(value = { HillCipher_decrypt_1_1_Test.class, HillCipher_encrypt_0_0_Test.class })
public class HillCipher_Suite {
}
