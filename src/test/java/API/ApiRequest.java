package API;

import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class ApiRequest extends ApiUtils implements ApiVerbos {

    @Override
    public void GET() {
        response = given()
                .relaxedHTTPSValidation().params(params).headers(headers).get(uri);
        super.log("GET");
    }

    @Override
    public void POST() {
        response = (Response) given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .post(uri);
        super.log("POST");
    }

    @Override
    public void PUT() {
        response = (Response) given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .put(uri);
        super.log("PUT");

    }

    @Override
    public void PATCH() {

        response = (Response) given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .body(body.toString())
                .patch(uri);
        super.log("PATCH");
    }

    @Override
    public void DELETE() {

        response = given()
                .relaxedHTTPSValidation()
                .params(params)
                .headers(headers)
                .delete(uri);


        super.log("DELETE");
    }


}