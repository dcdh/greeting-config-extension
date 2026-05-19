package com.damdamdeo.greeting.config.extension.test;

import com.damdamdeo.greeting.config.extension.runtime.GreetingService;
import io.quarkus.test.QuarkusUnitTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.RegisterExtension;

public class GreetingConfigExtensionTest {

    // Start unit test with your extension loaded
    @RegisterExtension
    static final QuarkusUnitTest unitTest = new QuarkusUnitTest()
            .withEmptyApplication()
            .overrideConfigKey("my.config.build-time-property", "BuiltTimePropertyRedefined")
            .overrideRuntimeConfigKey("my.datasource.init-at-startup", "false");

    @Inject
    GreetingService greetingService;

    @Test
    public void writeYourOwnUnitTest() {
        System.out.println("greetingService.initAtStartup(): " + greetingService.initAtStartup());
        Assertions.assertFalse(greetingService.initAtStartup());
    }
}
