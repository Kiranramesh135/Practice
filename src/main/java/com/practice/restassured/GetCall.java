package com.practice.restassured;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.codehaus.jettison.json.JSONException;
import org.codehaus.jettison.json.JSONObject;

import java.util.HashMap;
import java.util.List;

import static io.restassured.RestAssured.given;

public class GetCall {
    public static void main(String[] args ) throws JSONException {

        RestAssured.baseURI = "https://reqres.in/";

        HashMap<String,String> rh = new HashMap<>();
        rh.put("Accept", "application/json");
        rh.put("Content-type", "application/json");
        rh.put("x-api-key", "free_user_3Dts2XuUnTIeXE2f0Bcl3F5RXQJ");

        Response res = given()
                .headers(rh)
                .queryParam("page","2")
                .when()
                .get("/api/users")
                .then()
                .assertThat().statusCode(200).and().extract().response();

//        JSONObject jObject = new JSONObject(res.asString());
//        System.out.println(jObject.getJSONArray("data").getJSONObject(0).get("email"));
//
//        Object b = jObject.getJSONArray("data");
//
////        JsonPath jp = new JsonPath(res.asString());
////        List<String> a = jp.getList("");
//
//
//        jObject.getJSONArray("data").getJSONObject(0);

        JsonPath response = res.jsonPath();
        System.out.println(response.getString("data[1].email"));
        List<String> emails = response.getList("data.email");

        System.out.println(emails);


    }
}
