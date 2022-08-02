package group.revealed.core.jira.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Watches {

    @JsonProperty("self")
    private String self;
    @JsonProperty("isWatching")
    private boolean isWatching;
    @JsonProperty("watchCount")
    private int watchCount;
}