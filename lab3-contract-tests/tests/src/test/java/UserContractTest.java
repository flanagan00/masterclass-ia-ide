import au.com.dius.pact.consumer.MockServer;
import au.com.dius.pact.consumer.dsl.PactDslWithProvider;
import au.com.dius.pact.consumer.junit5.PactConsumerTestExt;
import au.com.dius.pact.consumer.junit5.PactTestFor;
import au.com.dius.pact.core.model.RequestResponsePact;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

@ExtendWith(PactConsumerTestExt.class)
public class UserContractTest {
    @PactTestFor(providerName = "UserService")
    public RequestResponsePact createPact(PactDslWithProvider builder) {
        return builder
            .given("User exists")
            .uponReceiving("A request for user 1")
            .path("/user/1")
            .method("GET")
            .willRespondWith()
            .status(200)
            .body("User1")
            .toPact();
    }

    @Test
    @PactTestFor(port = "8080")
    public void testUserEndpoint(MockServer mockServer) {
        RestTemplate restTemplate = new RestTemplate();
        String response = restTemplate.getForObject(mockServer.getUrl() + "/user/1", String.class);
        assertEquals("User1", response);
    }
}