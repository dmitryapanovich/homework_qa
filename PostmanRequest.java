package models;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostmanRequest {

    @JsonProperty("args")
    public Args args;
    @JsonProperty("headers")
    public PostmanResponseHeaders headers;
    @JsonProperty("url")
    public String url;
}
