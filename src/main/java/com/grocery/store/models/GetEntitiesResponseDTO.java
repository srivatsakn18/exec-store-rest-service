package com.grocery.store.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import lombok.Data;

@Data
@JsonPropertyOrder({"statusCode", "responseHeader", "data"})
public class GetEntitiesResponseDTO {

    @JsonProperty("responseHeader")
    private String responseHeader;
    @JsonProperty("statusCode")
    private String statusCode;
    @JsonProperty("data")
    private Object data;

    public GetEntitiesResponseDTO(String responseHeader, String statusCode, Object data) {
        this.responseHeader = responseHeader;
        this.statusCode = statusCode;
        this.data = data;
    }
}
