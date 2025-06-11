package com.practice.restassured;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.HashMap;

import static io.restassured.RestAssured.given;

public class Practice {

//    https://reqres.in/
//    reqres-free-v1
//    /api/users

    public static void main(String[] args) throws JSONException {

        RestAssured.baseURI = "https://reqres.in";

        HashMap<String, String> hm = new HashMap<>();
        hm.put("Accept","application/json");
        hm.put("Content-Type","application/json");

        Response res = given()
                .headers(hm)
                .queryParam("page","2")
                .when()
                .get("/api/users")
                .then()
                .assertThat().statusCode(200).and().extract().response();

        JSONObject jsonObject = new JSONObject(res.asString());
        System.out.println(jsonObject.getJSONArray("data").getJSONObject(0).get("email"));


    }
}
