package com.grocery.store.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"statusCode", "responseHeader", "message"})
public class GetEntitiesErrorDTO {
    @JsonProperty("statusCode")
    private String statusCode;

    @JsonProperty("responseHeader")
    private String responseHeader;

    @JsonProperty("message")
    private String message;

    public GetEntitiesErrorDTO(String responseHeader, String statusCode, String message) {
        this.responseHeader = responseHeader;
        this.statusCode = statusCode;
        this.message = message;
    }

}
