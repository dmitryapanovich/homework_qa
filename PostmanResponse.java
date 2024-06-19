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
public class PostmanResponse {

    @JsonProperty("args")
    public Args args;
    @JsonProperty("data")
    private String data;
    @JsonProperty("form")
    private PostmanForm form;
    @JsonProperty("headers")
    public PostmanResponseHeaders headers;
    @JsonProperty("json")
    private PostmanForm json;
    @JsonProperty("url")
    public String url;
}
