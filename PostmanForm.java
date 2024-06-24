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
public class PostmanForm {

    @JsonProperty("foo1")
    private String foo1;
    @JsonProperty("foo2")
    private String foo2;
}
