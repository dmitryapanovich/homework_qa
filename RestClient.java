package client;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import models.PostmanRequest;
import models.PostmanResponse;
import org.apache.http.HttpStatus;
import org.hamcrest.Matchers;

import java.util.Map;

import static org.hamcrest.Matchers.hasItems;

public class RestClient {

    private static final String BASE_URI = "https://postman-echo.com/";

    public static PostmanResponse responseGET() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .get("get")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(PostmanResponse.class);
    }

    public static PostmanResponse responseWithAssertionsGET() {
        return RestAssured.given()
                .baseUri(BASE_URI)
                .get("get")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .body("headers.cookie", Matchers.hasToString(BASE_URI + "get"))
                .extract()

                .as(PostmanResponse.class);
    }

    public static PostmanResponse requestPOST(PostmanRequest request) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .body(request)
                .post("post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(PostmanResponse.class);
    }

    public static PostmanResponse requestViaStringPOST(String request) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .body(request)
                .post("post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(PostmanResponse.class);
    }

    public static PostmanResponse requestViaFormPOST(Map<String, String> params) {
        return RestAssured.given()
                .contentType("application/x-www-form-urlencoded; charset=utf-8")
                .baseUri(BASE_URI)
                .formParams(params)
                .post("post")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(PostmanResponse.class);
    }

    public static PostmanResponse requestPUT(PostmanRequest request) {
        return RestAssured.given()
                .contentType(ContentType.JSON)
                .baseUri(BASE_URI)
                .body(request)
                .put("put")
                .then()
                .statusCode(HttpStatus.SC_OK)
                .extract()
                .as(PostmanResponse.class);
    }
}
