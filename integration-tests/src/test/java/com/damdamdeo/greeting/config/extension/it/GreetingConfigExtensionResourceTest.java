package com.damdamdeo.greeting.config.extension.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import io.quarkus.test.junit.QuarkusTestProfile;
import io.quarkus.test.junit.TestProfile;
import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
@TestProfile(GreetingConfigExtensionResourceTest.CustomTestProfile.class)
public class GreetingConfigExtensionResourceTest {

    public static class CustomTestProfile implements QuarkusTestProfile {

        @Override
        public String getConfigProfile() {
            return "custom";
        }
    }

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/greeting-config-extension")
                .then()
                .statusCode(200)
                .body(is("Hello greeting-config-extension true"));
    }
}
