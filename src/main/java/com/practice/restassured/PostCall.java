package com.practice.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class PostCall {

    public static void main(String[] args) {

        HashMap<String, String> map = new HashMap<>();
        map.put("Accept","application/json");
        map.put("Content-Type","application/json");
        map.put("x-api-key", "reqres-free-v1");

        String payload = "{\n" +
                "    \"name\": \"Kiran\",\n" +
                "    \"job\": \"Tester\"\n" +
                "}";

        RestAssured.baseURI = "https://reqres.in";

        Response res = given()
                .headers(map)
                .body(payload)
                .when()
                .post("/api/users")
                .then()
                .assertThat().statusCode(201).extract().response();

        System.out.println(res.asString());
    }
}

