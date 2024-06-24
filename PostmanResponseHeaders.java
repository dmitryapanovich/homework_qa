package models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class PostmanResponseHeaders {

    @JsonProperty("host")
    public String host;
    @JsonProperty("x-request-start")
    public String xRequestStart;
    @JsonProperty("connection")
    public String connection;
    @JsonProperty("x-forwarded-proto")
    public String xForwardedProto;
    @JsonProperty("x-forwarded-port")
    public String xForwardedPort;
    @JsonProperty("x-amzn-trace-id")
    public String xAmznTraceId;
    @JsonProperty("user-agent")
    public String userAgent;
    @JsonProperty("accept")
    public String accept;
    @JsonProperty("cache-control")
    public String cacheControl;
    @JsonProperty("postman-token")
    public String postmanToken;
}
