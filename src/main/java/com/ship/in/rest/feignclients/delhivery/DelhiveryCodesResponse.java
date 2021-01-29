package com.ship.in.rest.feignclients.delhivery;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DelhiveryCodesResponse {

    @JsonProperty("delivery_codes")
    public List<DelhiveryCode> deliveryCodes;
}
