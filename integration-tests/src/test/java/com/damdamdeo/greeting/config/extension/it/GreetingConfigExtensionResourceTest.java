package com.damdamdeo.greeting.config.extension.it;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.is;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class GreetingConfigExtensionResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .when().get("/greeting-config-extension")
                .then()
                .statusCode(200)
                .body(is("Hello greeting-config-extension false"));
    }
}
