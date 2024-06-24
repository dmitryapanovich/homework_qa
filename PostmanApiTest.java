import client.RestClient;
import models.PostmanResponse;
import org.testng.annotations.Test;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;

public class PostmanApiTest {

    private static final String HOST = "postman-echo.com";

    @Test
    public void postmanGETTest() {
        PostmanResponse postmanResponse = RestClient.responseGET();
        assertThat(postmanResponse.getHeaders().getHost()).isEqualTo(HOST);
    }

    @Test
    public void postmanPOSTTest() {
        String requestStr = "Some text";

        PostmanResponse responseViaString = RestClient.requestViaStringPOST(requestStr);
        assertThat(responseViaString.getData()).isEqualTo(requestStr);
    }

    @Test
    public void postmanPostTest2() {
        String formValue1 = "bar1";
        String formValue2 = "bar2";
        Map<String, String> parameters = new HashMap<>();
        parameters.put("foo1", formValue1);
        parameters.put("foo2", formValue2);
        PostmanResponse responseViaForm = RestClient.requestViaFormPOST(parameters);
        assertThat(responseViaForm.getForm().getFoo1()).isEqualTo(formValue1);
        assertThat(responseViaForm.getForm().getFoo2()).isEqualTo(formValue2);
    }

}
