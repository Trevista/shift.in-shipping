package com.ship.in.rest.feignclients.Dotzot;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DotzotCreateOrderResult {

    @JsonProperty("CODCHARGE")
    public String codeCharge;

    @JsonProperty("DockNo")
    public String dockNo;

    @JsonProperty("OrderNo")
    public String orderNo;

    @JsonProperty("Reason")
    public String reason;

    @JsonProperty("Succeed")
    public String succeed;

    @JsonProperty("TotalFreight")
    public String totalFreight;
}
